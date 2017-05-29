package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prop$Write_3_0 extends Strategy 
{ 
  public static $Prop$Write_3_0 instance = new $Prop$Write_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4, Strategy l_4, Strategy m_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropWrite_3_0");
    Fail33:
    { 
      IStrategoTerm t_70 = null;
      IStrategoTerm q_70 = null;
      IStrategoTerm r_70 = null;
      IStrategoTerm s_70 = null;
      IStrategoTerm u_70 = null;
      IStrategoTerm v_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropWrite_3 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      q_70 = term.getSubterm(0);
      r_70 = term.getSubterm(1);
      s_70 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      t_70 = annos20;
      term = k_4.invoke(context, q_70);
      if(term == null)
        break Fail33;
      u_70 = term;
      term = l_4.invoke(context, r_70);
      if(term == null)
        break Fail33;
      v_70 = term;
      term = m_4.invoke(context, s_70);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropWrite_3, new IStrategoTerm[]{u_70, v_70, term}), checkListAnnos(termFactory, t_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}