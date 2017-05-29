package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted2 extends Strategy 
{ 
  public static final lifted2 instance = new lifted2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail63:
    { 
      if(term.getTermType() != IStrategoTerm.INT || 34 != ((IStrategoInt)term).intValue())
        break Fail63;
      if(true)
        return term;
    }
    return null;
  }
}