package org.metaborg.lang.sl.interpreter.natives;

import java.math.BigInteger;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "left", type = TermBuild.class),
		@NodeChild(value = "right", type = TermBuild.class) })
public abstract class lteBigInt_2 extends TermBuild {

	public lteBigInt_2(SourceSection source) {
		super(source);
	}

	@Specialization
	@TruffleBoundary
	public boolean doBigInt(BigInteger left, BigInteger right) {
		return left.compareTo(right) <= 0;
	}

	public static TermBuild create(SourceSection source, TermBuild left, TermBuild right) {
		return lteBigInt_2NodeGen.create(source, left, right);
	}

}
