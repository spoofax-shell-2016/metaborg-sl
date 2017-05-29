package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$L$Define$Function_1_0 extends Strategy 
{ 
  public static $S$L$Define$Function_1_0 instance = new $S$L$Define$Function_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SLDefineFunction_1_0");
    Fail45:
    { 
      IStrategoTerm k_72 = null;
      IStrategoTerm j_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLDefineFunction_1 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      j_72 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      k_72 = annos29;
      term = c_5.invoke(context, j_72);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}