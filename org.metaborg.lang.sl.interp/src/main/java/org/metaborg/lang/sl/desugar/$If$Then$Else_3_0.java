package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then$Else_3_0 extends Strategy 
{ 
  public static $If$Then$Else_3_0 instance = new $If$Then$Else_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4, Strategy x_4, Strategy y_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThenElse_3_0");
    Fail39:
    { 
      IStrategoTerm x_71 = null;
      IStrategoTerm u_71 = null;
      IStrategoTerm v_71 = null;
      IStrategoTerm w_71 = null;
      IStrategoTerm y_71 = null;
      IStrategoTerm z_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfThenElse_3 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      u_71 = term.getSubterm(0);
      v_71 = term.getSubterm(1);
      w_71 = term.getSubterm(2);
      IStrategoList annos26 = term.getAnnotations();
      x_71 = annos26;
      term = w_4.invoke(context, u_71);
      if(term == null)
        break Fail39;
      y_71 = term;
      term = x_4.invoke(context, v_71);
      if(term == null)
        break Fail39;
      z_71 = term;
      term = y_4.invoke(context, w_71);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{y_71, z_71, term}), checkListAnnos(termFactory, x_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}