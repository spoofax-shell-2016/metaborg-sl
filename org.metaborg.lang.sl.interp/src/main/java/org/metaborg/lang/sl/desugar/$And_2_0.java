package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4, Strategy b_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail27:
    { 
      IStrategoTerm s_69 = null;
      IStrategoTerm q_69 = null;
      IStrategoTerm r_69 = null;
      IStrategoTerm t_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      q_69 = term.getSubterm(0);
      r_69 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      s_69 = annos14;
      term = a_4.invoke(context, q_69);
      if(term == null)
        break Fail27;
      t_69 = term;
      term = b_4.invoke(context, r_69);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAnd_2, new IStrategoTerm[]{t_69, term}), checkListAnnos(termFactory, s_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}