package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class newObj_0 extends TermBuild {

	public newObj_0(SourceSection source) {
		super(source);
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return new ObjData();
	}

	public static TermBuild create(SourceSection source) {
		return new newObj_0(source);
	}
}
