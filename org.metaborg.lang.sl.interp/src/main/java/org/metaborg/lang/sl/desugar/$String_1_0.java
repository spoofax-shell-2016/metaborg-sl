package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $String_1_0 extends Strategy 
{ 
  public static $String_1_0 instance = new $String_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("String_1_0");
    Fail14:
    { 
      IStrategoTerm q_67 = null;
      IStrategoTerm p_67 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consString_1 != ((IStrategoAppl)term).getConstructor())
        break Fail14;
      p_67 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      q_67 = annos3;
      term = f_3.invoke(context, p_67);
      if(term == null)
        break Fail14;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consString_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_67));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}