package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add_2_0 extends Strategy 
{ 
  public static $Add_2_0 instance = new $Add_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_3, Strategy h_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Add_2_0");
    Fail17:
    { 
      IStrategoTerm u_67 = null;
      IStrategoTerm s_67 = null;
      IStrategoTerm t_67 = null;
      IStrategoTerm v_67 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      s_67 = term.getSubterm(0);
      t_67 = term.getSubterm(1);
      IStrategoList annos4 = term.getAnnotations();
      u_67 = annos4;
      term = g_3.invoke(context, s_67);
      if(term == null)
        break Fail17;
      v_67 = term;
      term = h_3.invoke(context, t_67);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAdd_2, new IStrategoTerm[]{v_67, term}), checkListAnnos(termFactory, u_67));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}