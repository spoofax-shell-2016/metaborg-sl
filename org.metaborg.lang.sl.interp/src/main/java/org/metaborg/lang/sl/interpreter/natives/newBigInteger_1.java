package org.metaborg.lang.sl.interpreter.natives;

import java.math.BigInteger;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "term", type = TermBuild.class) })
public abstract class newBigInteger_1 extends TermBuild {

	public newBigInteger_1(SourceSection source) {
		super(source);
	}

	@Specialization
	@TruffleBoundary
	public BigInteger doString(String s) {
		return new BigInteger(s);
	}

	public static TermBuild create(SourceSection source, TermBuild term) {
		return newBigInteger_1NodeGen.create(source, term);
	}

}
