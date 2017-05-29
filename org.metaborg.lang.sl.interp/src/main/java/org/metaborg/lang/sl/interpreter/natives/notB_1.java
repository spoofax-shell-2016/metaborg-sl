package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "t", type = TermBuild.class) })
public abstract class notB_1 extends TermBuild {

	public notB_1(SourceSection source) {
		super(source);
	}

	public static TermBuild create(SourceSection source, TermBuild termBuild) {
		return notB_1NodeGen.create(source, termBuild);
	}

	@Specialization
	public boolean doEvaluated(boolean t) {
		return !t;
	}
}
