package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_3, Strategy z_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail26:
    { 
      IStrategoTerm n_69 = null;
      IStrategoTerm l_69 = null;
      IStrategoTerm m_69 = null;
      IStrategoTerm o_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      l_69 = term.getSubterm(0);
      m_69 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      n_69 = annos13;
      term = y_3.invoke(context, l_69);
      if(term == null)
        break Fail26;
      o_69 = term;
      term = z_3.invoke(context, m_69);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGt_2, new IStrategoTerm[]{o_69, term}), checkListAnnos(termFactory, n_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}