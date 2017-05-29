package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Def_3_0 extends Strategy 
{ 
  public static $Fun$Def_3_0 instance = new $Fun$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_2, Strategy a_3, Strategy b_3)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunDef_3_0");
    Fail11:
    { 
      IStrategoTerm d_67 = null;
      IStrategoTerm a_67 = null;
      IStrategoTerm b_67 = null;
      IStrategoTerm c_67 = null;
      IStrategoTerm e_67 = null;
      IStrategoTerm f_67 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consFunDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      a_67 = term.getSubterm(0);
      b_67 = term.getSubterm(1);
      c_67 = term.getSubterm(2);
      IStrategoList annos0 = term.getAnnotations();
      d_67 = annos0;
      term = z_2.invoke(context, a_67);
      if(term == null)
        break Fail11;
      e_67 = term;
      term = a_3.invoke(context, b_67);
      if(term == null)
        break Fail11;
      f_67 = term;
      term = b_3.invoke(context, c_67);
      if(term == null)
        break Fail11;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consFunDef_3, new IStrategoTerm[]{e_67, f_67, term}), checkListAnnos(termFactory, d_67));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}