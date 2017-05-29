package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail29:
    { 
      IStrategoTerm b_70 = null;
      IStrategoTerm a_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      a_70 = term.getSubterm(0);
      IStrategoList annos16 = term.getAnnotations();
      b_70 = annos16;
      term = e_4.invoke(context, a_70);
      if(term == null)
        break Fail29;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}