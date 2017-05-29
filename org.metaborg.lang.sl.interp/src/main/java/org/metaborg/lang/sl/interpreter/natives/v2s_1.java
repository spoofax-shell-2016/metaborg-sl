package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.terms.BoolV_1_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.FunV_3_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.NumV_1_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.ObjV_1_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.StringV_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "term", type = TermBuild.class) })
public abstract class v2s_1 extends TermBuild {

	public v2s_1(SourceSection source) {
		super(source);
	}

	@Specialization
	@TruffleBoundary
	public String doString(StringV_1_Term t) {
		return t.get_1();
	}

	@Specialization
	@TruffleBoundary
	public String doBool(BoolV_1_Term t) {
		return t.get_1() + "";
	}

	@Specialization
	@TruffleBoundary
	public String doNum(NumV_1_Term t) {
		return t.get_1() + "";
	}

	@Specialization
	public String doNull(NullV_0_Term t) {
		return "null";
	}

	@Specialization
	public String doFun(FunV_3_Term t) {
		return t.get_1();
	}

	@Specialization
	@TruffleBoundary
	public String doNull(ObjV_1_Term t) {
		return t.get_1() + "";
	}

	@Fallback
	@TruffleBoundary
	public String doGeneric(Object o) {
		return o + "";
	}

	public static TermBuild create(SourceSection source, TermBuild term) {
		return v2s_1NodeGen.create(source, term);
	}

}
