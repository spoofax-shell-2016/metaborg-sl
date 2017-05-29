package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$L$Println_1_0 extends Strategy 
{ 
  public static $S$L$Println_1_0 instance = new $S$L$Println_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLPrintln_1_0");
    Fail48:
    { 
      IStrategoTerm n_72 = null;
      IStrategoTerm m_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLPrintln_1 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      m_72 = term.getSubterm(0);
      IStrategoList annos30 = term.getAnnotations();
      n_72 = annos30;
      term = d_5.invoke(context, m_72);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}