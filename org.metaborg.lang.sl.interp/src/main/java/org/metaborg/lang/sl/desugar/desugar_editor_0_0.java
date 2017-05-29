package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_editor_0_0 extends Strategy 
{ 
  public static desugar_editor_0_0 instance = new desugar_editor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("desugar_editor_0_0");
    Fail0:
    { 
      IStrategoTerm l_2 = null;
      IStrategoTerm m_2 = null;
      IStrategoTerm n_2 = null;
      IStrategoTerm o_2 = null;
      IStrategoTerm p_2 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail0;
      n_2 = term.getSubterm(2);
      l_2 = term.getSubterm(3);
      p_2 = term;
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail1:
        { 
          IStrategoTerm r_2 = null;
          r_2 = l_2;
          term = guarantee_extension_0_1.instance.invoke(context, r_2, desugar.const0);
          if(term == null)
            break Fail1;
          m_2 = term;
          term = desugar_all_0_0.instance.invoke(context, n_2);
          if(term == null)
            break Fail1;
          o_2 = term;
          if(true)
            break Success0;
        }
        term = term0;
        IStrategoTerm t_2 = null;
        t_2 = term;
        term = report_with_failure_0_1.instance.invoke(context, t_2, desugar.const1);
        if(term == null)
          break Fail0;
      }
      term = p_2;
      if(m_2 == null || o_2 == null)
        break Fail0;
      term = termFactory.makeTuple(m_2, o_2);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}