package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail13:
    { 
      IStrategoTerm n_67 = null;
      IStrategoTerm m_67 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail13;
      m_67 = term.getSubterm(0);
      IStrategoList annos2 = term.getAnnotations();
      n_67 = annos2;
      term = e_3.invoke(context, m_67);
      if(term == null)
        break Fail13;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_67));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}