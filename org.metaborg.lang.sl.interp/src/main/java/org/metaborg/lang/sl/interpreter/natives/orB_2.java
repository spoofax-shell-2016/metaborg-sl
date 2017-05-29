package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "left", type = TermBuild.class),
		@NodeChild(value = "right", type = TermBuild.class) })
public abstract class orB_2 extends TermBuild {

	public orB_2(SourceSection source) {
		super(source);
	}

	public static TermBuild create(SourceSection source, TermBuild left, TermBuild right) {
		return orB_2NodeGen.create(source, left, right);
	}

	@Specialization
	public boolean doEvaluated(boolean left, boolean right) {
		return left || right;
	}

}
