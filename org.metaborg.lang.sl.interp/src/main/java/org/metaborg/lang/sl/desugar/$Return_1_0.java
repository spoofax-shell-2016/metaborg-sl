package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Return_1_0 extends Strategy 
{ 
  public static $Return_1_0 instance = new $Return_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail40:
    { 
      IStrategoTerm c_72 = null;
      IStrategoTerm b_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail40;
      b_72 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      c_72 = annos27;
      term = z_4.invoke(context, b_72);
      if(term == null)
        break Fail40;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}