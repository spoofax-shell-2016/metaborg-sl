package org.metaborg.lang.sl.interpreter.natives;

import java.math.BigInteger;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class nanoTime_0 extends TermBuild {

	public nanoTime_0(SourceSection source) {
		super(source);
	}

	@Override
	public Object executeGeneric(VirtualFrame frame) {
		return doLogic();
	}

	@TruffleBoundary
	private BigInteger doLogic() {
		return BigInteger.valueOf(System.nanoTime());
	}

	public static TermBuild create(SourceSection source) {
		return new nanoTime_0(source);
	}

}
