package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class e_73 extends Strategy 
{ 
  public static final e_73 instance = new e_73();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_73)
  { 
    Fail60:
    { 
      lifted0 lifted00 = new lifted0();
      lifted00.g_73 = g_73;
      term = SRTS_all.instance.invoke(context, term, lifted00);
      if(term == null)
        break Fail60;
      term = g_73.invoke(context, term);
      if(term == null)
        break Fail60;
      if(true)
        return term;
    }
    return null;
  }
}