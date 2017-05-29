package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar_0_0 extends Strategy 
{ 
  public static desugar_0_0 instance = new desugar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail3:
    { 
      IStrategoTerm term9 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1:
      { 
        if(cons0 == desugar._consProgram_1)
        { 
          Fail4:
          { 
            IStrategoTerm y_2 = null;
            y_2 = term.getSubterm(0);
            term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{y_2, desugar.constFunCall0});
            if(true)
              break Success1;
          }
          term = term9;
        }
        Success2:
        { 
          if(cons0 == desugar._consIfNoElse_2)
          { 
            Fail5:
            { 
              IStrategoTerm w_2 = null;
              IStrategoTerm x_2 = null;
              w_2 = term.getSubterm(0);
              x_2 = term.getSubterm(1);
              term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{w_2, x_2, desugar.constBlock0});
              if(true)
                break Success2;
            }
            term = term9;
          }
          Success3:
          { 
            if(cons0 == desugar._consFunCall_2)
            { 
              Fail6:
              { 
                IStrategoTerm v_2 = null;
                IStrategoTerm arg14 = term.getSubterm(0);
                if(arg14.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg14).stringValue()))
                  break Fail6;
                IStrategoTerm arg15 = term.getSubterm(1);
                if(arg15.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg15).isEmpty())
                  break Fail6;
                v_2 = ((IStrategoList)arg15).head();
                IStrategoTerm arg16 = ((IStrategoList)arg15).tail();
                if(arg16.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg16).isEmpty())
                  break Fail6;
                term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{v_2});
                if(true)
                  break Success3;
              }
              term = term9;
            }
            Success4:
            { 
              if(cons0 == desugar._consFunCall_2)
              { 
                Fail7:
                { 
                  IStrategoTerm arg17 = term.getSubterm(0);
                  if(arg17.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg17).stringValue()))
                    break Fail7;
                  IStrategoTerm arg18 = term.getSubterm(1);
                  if(arg18.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg18).isEmpty())
                    break Fail7;
                  term = desugar.constSLNanoTime0;
                  if(true)
                    break Success4;
                }
                term = term9;
              }
              Success5:
              { 
                if(cons0 == desugar._consFunCall_2)
                { 
                  Fail8:
                  { 
                    IStrategoTerm arg19 = term.getSubterm(0);
                    if(arg19.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg19).stringValue()))
                      break Fail8;
                    IStrategoTerm arg20 = term.getSubterm(1);
                    if(arg20.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg20).isEmpty())
                      break Fail8;
                    term = desugar.constSLNewObject0;
                    if(true)
                      break Success5;
                  }
                  term = term9;
                }
                Success6:
                { 
                  if(cons0 == desugar._consFunCall_2)
                  { 
                    Fail9:
                    { 
                      IStrategoTerm u_2 = null;
                      IStrategoTerm arg21 = term.getSubterm(0);
                      if(arg21.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg21).stringValue()))
                        break Fail9;
                      IStrategoTerm arg22 = term.getSubterm(1);
                      if(arg22.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg22).isEmpty())
                        break Fail9;
                      u_2 = ((IStrategoList)arg22).head();
                      IStrategoTerm arg23 = ((IStrategoList)arg22).tail();
                      if(arg23.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg23).isEmpty())
                        break Fail9;
                      term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{u_2});
                      if(true)
                        break Success6;
                    }
                    term = term9;
                  }
                  Success7:
                  { 
                    if(cons0 == desugar._consFunCall_2)
                    { 
                      Fail10:
                      { 
                        IStrategoTerm arg24 = term.getSubterm(0);
                        if(arg24.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg24).stringValue()))
                          break Fail10;
                        IStrategoTerm arg25 = term.getSubterm(1);
                        if(arg25.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25).isEmpty())
                          break Fail10;
                        term = desugar.constSLReadln0;
                        if(true)
                          break Success7;
                      }
                      term = term9;
                    }
                    if(cons0 == desugar._consFunCall_2)
                    { 
                      IStrategoTerm arg26 = term.getSubterm(0);
                      if(arg26.getTermType() != IStrategoTerm.STRING || !"stacktrace".equals(((IStrategoString)arg26).stringValue()))
                        break Fail3;
                      IStrategoTerm arg27 = term.getSubterm(1);
                      if(arg27.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg27).isEmpty())
                        break Fail3;
                      term = desugar.constSLStacktrace0;
                    }
                    else
                    { 
                      break Fail3;
                    }
                  }
                }
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("desugar_0_0");
    context.popOnFailure();
    return null;
  }
}