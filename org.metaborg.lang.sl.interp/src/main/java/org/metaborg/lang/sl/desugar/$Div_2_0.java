package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Div_2_0 extends Strategy 
{ 
  public static $Div_2_0 instance = new $Div_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_3, Strategy j_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Div_2_0");
    Fail18:
    { 
      IStrategoTerm z_67 = null;
      IStrategoTerm x_67 = null;
      IStrategoTerm y_67 = null;
      IStrategoTerm a_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consDiv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      x_67 = term.getSubterm(0);
      y_67 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      z_67 = annos5;
      term = i_3.invoke(context, x_67);
      if(term == null)
        break Fail18;
      a_68 = term;
      term = j_3.invoke(context, y_67);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consDiv_2, new IStrategoTerm[]{a_68, term}), checkListAnnos(termFactory, z_67));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}