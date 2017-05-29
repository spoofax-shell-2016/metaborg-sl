package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gte_2_0 extends Strategy 
{ 
  public static $Gte_2_0 instance = new $Gte_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_3, Strategy x_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gte_2_0");
    Fail25:
    { 
      IStrategoTerm i_69 = null;
      IStrategoTerm g_69 = null;
      IStrategoTerm h_69 = null;
      IStrategoTerm j_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consGte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail25;
      g_69 = term.getSubterm(0);
      h_69 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      i_69 = annos12;
      term = w_3.invoke(context, g_69);
      if(term == null)
        break Fail25;
      j_69 = term;
      term = x_3.invoke(context, h_69);
      if(term == null)
        break Fail25;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consGte_2, new IStrategoTerm[]{j_69, term}), checkListAnnos(termFactory, i_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}