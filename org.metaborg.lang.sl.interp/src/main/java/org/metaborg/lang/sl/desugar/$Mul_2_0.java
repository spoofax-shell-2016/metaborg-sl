package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Mul_2_0 extends Strategy 
{ 
  public static $Mul_2_0 instance = new $Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_3, Strategy l_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Mul_2_0");
    Fail19:
    { 
      IStrategoTerm e_68 = null;
      IStrategoTerm c_68 = null;
      IStrategoTerm d_68 = null;
      IStrategoTerm f_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      c_68 = term.getSubterm(0);
      d_68 = term.getSubterm(1);
      IStrategoList annos6 = term.getAnnotations();
      e_68 = annos6;
      term = k_3.invoke(context, c_68);
      if(term == null)
        break Fail19;
      f_68 = term;
      term = l_3.invoke(context, d_68);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMul_2, new IStrategoTerm[]{f_68, term}), checkListAnnos(termFactory, e_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}