package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_all_0_0 extends Strategy 
{ 
  public static desugar_all_0_0 instance = new desugar_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("desugar_all_0_0");
    Fail2:
    { 
      term = e_73.instance.invoke(context, term, f_73.instance);
      if(term == null)
        break Fail2;
      term = alltd_1_0.instance.invoke(context, term, lifted1.instance);
      if(term == null)
        break Fail2;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}