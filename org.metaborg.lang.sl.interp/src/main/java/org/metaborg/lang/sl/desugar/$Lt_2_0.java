package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_3, Strategy t_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail23:
    { 
      IStrategoTerm y_68 = null;
      IStrategoTerm w_68 = null;
      IStrategoTerm x_68 = null;
      IStrategoTerm z_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      w_68 = term.getSubterm(0);
      x_68 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      y_68 = annos10;
      term = s_3.invoke(context, w_68);
      if(term == null)
        break Fail23;
      z_68 = term;
      term = t_3.invoke(context, x_68);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLt_2, new IStrategoTerm[]{z_68, term}), checkListAnnos(termFactory, y_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}