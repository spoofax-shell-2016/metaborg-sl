package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Stmt_1_0 extends Strategy 
{ 
  public static $Stmt_1_0 instance = new $Stmt_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Stmt_1_0");
    Fail35:
    { 
      IStrategoTerm f_71 = null;
      IStrategoTerm e_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consStmt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      e_71 = term.getSubterm(0);
      IStrategoList annos22 = term.getAnnotations();
      f_71 = annos22;
      term = q_4.invoke(context, e_71);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consStmt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}