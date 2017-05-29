package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prop$Read_2_0 extends Strategy 
{ 
  public static $Prop$Read_2_0 instance = new $Prop$Read_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4, Strategy j_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropRead_2_0");
    Fail32:
    { 
      IStrategoTerm n_70 = null;
      IStrategoTerm l_70 = null;
      IStrategoTerm m_70 = null;
      IStrategoTerm o_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consPropRead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      l_70 = term.getSubterm(0);
      m_70 = term.getSubterm(1);
      IStrategoList annos19 = term.getAnnotations();
      n_70 = annos19;
      term = i_4.invoke(context, l_70);
      if(term == null)
        break Fail32;
      o_70 = term;
      term = j_4.invoke(context, m_70);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consPropRead_2, new IStrategoTerm[]{o_70, term}), checkListAnnos(termFactory, n_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}