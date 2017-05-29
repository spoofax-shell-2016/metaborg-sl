package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Read_1_0 extends Strategy 
{ 
  public static $Var$Read_1_0 instance = new $Var$Read_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarRead_1_0");
    Fail30:
    { 
      IStrategoTerm e_70 = null;
      IStrategoTerm d_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consVarRead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      d_70 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      e_70 = annos17;
      term = f_4.invoke(context, d_70);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consVarRead_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}