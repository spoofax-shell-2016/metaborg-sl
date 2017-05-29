package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sub_2_0 extends Strategy 
{ 
  public static $Sub_2_0 instance = new $Sub_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_3, Strategy n_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sub_2_0");
    Fail20:
    { 
      IStrategoTerm j_68 = null;
      IStrategoTerm h_68 = null;
      IStrategoTerm i_68 = null;
      IStrategoTerm k_68 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSub_2 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      h_68 = term.getSubterm(0);
      i_68 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      j_68 = annos7;
      term = m_3.invoke(context, h_68);
      if(term == null)
        break Fail20;
      k_68 = term;
      term = n_3.invoke(context, i_68);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consSub_2, new IStrategoTerm[]{k_68, term}), checkListAnnos(termFactory, j_68));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}