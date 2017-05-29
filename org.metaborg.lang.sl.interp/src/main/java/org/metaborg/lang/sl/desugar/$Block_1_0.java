package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail36:
    { 
      IStrategoTerm i_71 = null;
      IStrategoTerm h_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      h_71 = term.getSubterm(0);
      IStrategoList annos23 = term.getAnnotations();
      i_71 = annos23;
      term = r_4.invoke(context, h_71);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}