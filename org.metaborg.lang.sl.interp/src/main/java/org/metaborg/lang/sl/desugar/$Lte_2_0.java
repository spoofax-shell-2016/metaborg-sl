package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lte_2_0 extends Strategy 
{ 
  public static $Lte_2_0 instance = new $Lte_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_3, Strategy r_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lte_2_0");
    Fail22:
    { 
      IStrategoTerm t_68 = null;
      IStrategoTerm r_68 = null;
      IStrategoTerm s_68 = null;
      IStrategoTerm u_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consLte_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      r_68 = term.getSubterm(0);
      s_68 = term.getSubterm(1);
      IStrategoList annos9 = term.getAnnotations();
      t_68 = annos9;
      term = q_3.invoke(context, r_68);
      if(term == null)
        break Fail22;
      u_68 = term;
      term = r_3.invoke(context, s_68);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consLte_2, new IStrategoTerm[]{u_68, term}), checkListAnnos(termFactory, t_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}