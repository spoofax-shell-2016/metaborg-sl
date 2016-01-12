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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail38:
    { 
      IStrategoTerm j_72 = null;
      IStrategoTerm i_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      i_72 = term.getSubterm(0);
      IStrategoList annos16 = term.getAnnotations();
      j_72 = annos16;
      term = w_5.invoke(context, i_72);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}