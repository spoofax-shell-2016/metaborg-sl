package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Call_3_0 extends Strategy 
{ 
  public static $Method$Call_3_0 instance = new $Method$Call_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4, Strategy o_4, Strategy p_4)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodCall_3_0");
    Fail34:
    { 
      IStrategoTerm a_71 = null;
      IStrategoTerm x_70 = null;
      IStrategoTerm y_70 = null;
      IStrategoTerm z_70 = null;
      IStrategoTerm b_71 = null;
      IStrategoTerm c_71 = null;
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consMethodCall_3 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      x_70 = term.getSubterm(0);
      y_70 = term.getSubterm(1);
      z_70 = term.getSubterm(2);
      IStrategoList annos21 = term.getAnnotations();
      a_71 = annos21;
      term = n_4.invoke(context, x_70);
      if(term == null)
        break Fail34;
      b_71 = term;
      term = o_4.invoke(context, y_70);
      if(term == null)
        break Fail34;
      c_71 = term;
      term = p_4.invoke(context, z_70);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(desugar._consMethodCall_3, new IStrategoTerm[]{b_71, c_71, term}), checkListAnnos(termFactory, a_71));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}