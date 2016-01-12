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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4, Strategy z_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Add_2_0");
    Fail26:
    { 
      IStrategoTerm c_70 = null;
      IStrategoTerm a_70 = null;
      IStrategoTerm b_70 = null;
      IStrategoTerm d_70 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      a_70 = term.getSubterm(0);
      b_70 = term.getSubterm(1);
      IStrategoList annos4 = term.getAnnotations();
      c_70 = annos4;
      term = y_4.invoke(context, a_70);
      if(term == null)
        break Fail26;
      d_70 = term;
      term = z_4.invoke(context, b_70);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consAdd_2, new IStrategoTerm[]{d_70, term}), checkListAnnos(termFactory, c_70));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}