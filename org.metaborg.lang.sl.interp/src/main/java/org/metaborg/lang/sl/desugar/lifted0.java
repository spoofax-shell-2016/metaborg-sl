package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  Strategy g_73;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail61:
    { 
      term = e_73.instance.invoke(context, term, g_73);
      if(term == null)
        break Fail61;
      if(true)
        return term;
    }
    return null;
  }
}