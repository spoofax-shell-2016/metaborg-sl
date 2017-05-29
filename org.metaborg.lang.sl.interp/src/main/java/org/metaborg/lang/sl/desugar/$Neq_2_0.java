package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Neq_2_0 extends Strategy 
{ 
  public static $Neq_2_0 instance = new $Neq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_3, Strategy v_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Neq_2_0");
    Fail24:
    { 
      IStrategoTerm d_69 = null;
      IStrategoTerm b_69 = null;
      IStrategoTerm c_69 = null;
      IStrategoTerm e_69 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNeq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail24;
      b_69 = term.getSubterm(0);
      c_69 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      d_69 = annos11;
      term = u_3.invoke(context, b_69);
      if(term == null)
        break Fail24;
      e_69 = term;
      term = v_3.invoke(context, c_69);
      if(term == null)
        break Fail24;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNeq_2, new IStrategoTerm[]{e_69, term}), checkListAnnos(termFactory, d_69));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}