package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Call_2_0 extends Strategy 
{ 
  public static $Fun$Call_2_0 instance = new $Fun$Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_3, Strategy d_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunCall_2_0");
    Fail12:
    { 
      IStrategoTerm j_67 = null;
      IStrategoTerm h_67 = null;
      IStrategoTerm i_67 = null;
      IStrategoTerm k_67 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail12;
      h_67 = term.getSubterm(0);
      i_67 = term.getSubterm(1);
      IStrategoList annos1 = term.getAnnotations();
      j_67 = annos1;
      term = c_3.invoke(context, h_67);
      if(term == null)
        break Fail12;
      k_67 = term;
      term = d_3.invoke(context, i_67);
      if(term == null)
        break Fail12;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{k_67, term}), checkListAnnos(termFactory, j_67));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}