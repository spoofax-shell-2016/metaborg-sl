package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Eq_2_0 extends Strategy 
{ 
  public static $Eq_2_0 instance = new $Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_3, Strategy p_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Eq_2_0");
    Fail21:
    { 
      IStrategoTerm o_68 = null;
      IStrategoTerm m_68 = null;
      IStrategoTerm n_68 = null;
      IStrategoTerm p_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      m_68 = term.getSubterm(0);
      n_68 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      o_68 = annos8;
      term = o_3.invoke(context, m_68);
      if(term == null)
        break Fail21;
      p_68 = term;
      term = p_3.invoke(context, n_68);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consEq_2, new IStrategoTerm[]{p_68, term}), checkListAnnos(termFactory, o_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}