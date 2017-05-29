package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.desugar.desugar;
import org.metaborg.lang.sl.desugar.desugar_all_0_0;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITermTransformer;
import org.spoofax.interpreter.terms.IStrategoTerm;

public class DesugarTransformer implements ITermTransformer {

	@Override
	public IStrategoTerm transform(IStrategoTerm term) {
		return desugar_all_0_0.instance.invoke(desugar.init(), term);
	}

}
