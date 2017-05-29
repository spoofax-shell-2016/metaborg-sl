package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$No$Else_2_0 extends Strategy 
{ 
  public static $If$No$Else_2_0 instance = new $If$No$Else_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4, Strategy v_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfNoElse_2_0");
    Fail38:
    { 
      IStrategoTerm r_71 = null;
      IStrategoTerm p_71 = null;
      IStrategoTerm q_71 = null;
      IStrategoTerm s_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consIfNoElse_2 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      p_71 = term.getSubterm(0);
      q_71 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      r_71 = annos25;
      term = u_4.invoke(context, p_71);
      if(term == null)
        break Fail38;
      s_71 = term;
      term = v_4.invoke(context, q_71);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consIfNoElse_2, new IStrategoTerm[]{s_71, term}), checkListAnnos(termFactory, r_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}