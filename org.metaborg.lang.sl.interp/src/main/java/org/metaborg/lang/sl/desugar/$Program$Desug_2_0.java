package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Program$Desug_2_0 extends Strategy 
{ 
  public static $Program$Desug_2_0 instance = new $Program$Desug_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_5, Strategy b_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ProgramDesug_2_0");
    Fail44:
    { 
      IStrategoTerm g_72 = null;
      IStrategoTerm e_72 = null;
      IStrategoTerm f_72 = null;
      IStrategoTerm h_72 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consProgramDesug_2 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      e_72 = term.getSubterm(0);
      f_72 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      g_72 = annos28;
      term = a_5.invoke(context, e_72);
      if(term == null)
        break Fail44;
      h_72 = term;
      term = b_5.invoke(context, f_72);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{h_72, term}), checkListAnnos(termFactory, g_72));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}