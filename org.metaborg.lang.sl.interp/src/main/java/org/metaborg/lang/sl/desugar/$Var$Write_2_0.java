package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Write_2_0 extends Strategy 
{ 
  public static $Var$Write_2_0 instance = new $Var$Write_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4, Strategy h_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarWrite_2_0");
    Fail31:
    { 
      IStrategoTerm i_70 = null;
      IStrategoTerm g_70 = null;
      IStrategoTerm h_70 = null;
      IStrategoTerm j_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarWrite_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      g_70 = term.getSubterm(0);
      h_70 = term.getSubterm(1);
      IStrategoList annos18 = term.getAnnotations();
      i_70 = annos18;
      term = g_4.invoke(context, g_70);
      if(term == null)
        break Fail31;
      j_70 = term;
      term = h_4.invoke(context, h_70);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarWrite_2, new IStrategoTerm[]{j_70, term}), checkListAnnos(termFactory, i_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}