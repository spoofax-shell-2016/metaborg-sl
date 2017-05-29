package org.metaborg.lang.sl.interpreter.natives;

import java.nio.charset.Charset;

import org.metaborg.lang.sl.interpreter.generated.terms.IFunDefTerm;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({ @NodeChild(value = "term", type = TermBuild.class) })
public abstract class parseFunDef_1 extends TermBuild {

	public parseFunDef_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public IFunDefTerm doEvaluated(String s) {
		IStrategoTerm funDefTerm = getContext().getParser()
				.parse(Source.fromBytes(s.getBytes(),
						"Dynamically defined function",
						Charset.defaultCharset()), "FunDef");

		IStrategoTerm desugFunDefTerm = new DesugarTransformer()
				.transform(funDefTerm);

		return IFunDefTerm.create(desugFunDefTerm);

	}

	public static TermBuild create(SourceSection source, TermBuild term) {
		return parseFunDef_1NodeGen.create(source, term);
	}

}
