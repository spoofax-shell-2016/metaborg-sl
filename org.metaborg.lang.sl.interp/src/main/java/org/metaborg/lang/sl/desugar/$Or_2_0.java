package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4, Strategy d_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail28:
    { 
      IStrategoTerm x_69 = null;
      IStrategoTerm v_69 = null;
      IStrategoTerm w_69 = null;
      IStrategoTerm y_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      v_69 = term.getSubterm(0);
      w_69 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      x_69 = annos15;
      term = c_4.invoke(context, v_69);
      if(term == null)
        break Fail28;
      y_69 = term;
      term = d_4.invoke(context, w_69);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consOr_2, new IStrategoTerm[]{y_69, term}), checkListAnnos(termFactory, x_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}