package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "term", type = TermBuild.class) })
public abstract class println_1 extends TermBuild {

	public println_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public String doString(String s) {
		getContext().getOutput().println(s);
		return s;
	}

	public static TermBuild create(SourceSection source, TermBuild term) {
		return println_1NodeGen.create(source, term);
	}
}
