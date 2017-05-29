package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class eqT_2 extends TermBuild {

	@Child
	private TermBuild left;
	@Child
	private TermBuild right;

	public eqT_2(TermBuild left, TermBuild right, SourceSection source) {
		super(source);
		this.left = left;
		this.right = right;
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return executeBoolean(frame);
	}

	@Override
	public boolean executeBoolean(VirtualFrame frame) {

		return left.executeGeneric(frame).equals(right.executeGeneric(frame));
	}

	public static TermBuild create(SourceSection source, TermBuild left, TermBuild right) {
		return new eqT_2(left, right, source);
	}

}
