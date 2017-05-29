package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$L$Readln_0_0 extends Strategy 
{ 
  public static $S$L$Readln_0_0 instance = new $S$L$Readln_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail49:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || desugar._consSLReadln_0 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      if(true)
        return term;
    }
    context.push("SLReadln_0_0");
    context.popOnFailure();
    return null;
  }
}