package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4, Strategy t_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail37:
    { 
      IStrategoTerm m_71 = null;
      IStrategoTerm k_71 = null;
      IStrategoTerm l_71 = null;
      IStrategoTerm n_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      k_71 = term.getSubterm(0);
      l_71 = term.getSubterm(1);
      IStrategoList annos24 = term.getAnnotations();
      m_71 = annos24;
      term = s_4.invoke(context, k_71);
      if(term == null)
        break Fail37;
      n_71 = term;
      term = t_4.invoke(context, l_71);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consWhile_2, new IStrategoTerm[]{n_71, term}), checkListAnnos(termFactory, m_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}