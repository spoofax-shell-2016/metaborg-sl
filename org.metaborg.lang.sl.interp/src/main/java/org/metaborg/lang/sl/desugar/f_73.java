package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class f_73 extends Strategy 
{ 
  public static final f_73 instance = new f_73();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail51:
    { 
      IStrategoTerm term1 = term;
      Success8:
      { 
        Fail52:
        { 
          IStrategoTerm term2 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success9:
          { 
            if(cons1 == desugar._consProgram_1)
            { 
              Fail53:
              { 
                IStrategoTerm x_72 = null;
                x_72 = term.getSubterm(0);
                term = this.invoke(context, desugar.constFunCall0);
                if(term == null)
                  break Fail53;
                term = termFactory.makeAppl(desugar._consProgramDesug_2, new IStrategoTerm[]{x_72, term});
                if(true)
                  break Success9;
              }
              term = term2;
            }
            Success10:
            { 
              if(cons1 == desugar._consIfNoElse_2)
              { 
                Fail54:
                { 
                  IStrategoTerm a_73 = null;
                  IStrategoTerm b_73 = null;
                  a_73 = term.getSubterm(0);
                  b_73 = term.getSubterm(1);
                  term = termFactory.makeAppl(desugar._consIfThenElse_3, new IStrategoTerm[]{a_73, b_73, desugar.constBlock0});
                  if(true)
                    break Success10;
                }
                term = term2;
              }
              Success11:
              { 
                if(cons1 == desugar._consFunCall_2)
                { 
                  Fail55:
                  { 
                    IStrategoTerm c_73 = null;
                    IStrategoTerm arg0 = term.getSubterm(0);
                    if(arg0.getTermType() != IStrategoTerm.STRING || !"defineFunction".equals(((IStrategoString)arg0).stringValue()))
                      break Fail55;
                    IStrategoTerm arg1 = term.getSubterm(1);
                    if(arg1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1).isEmpty())
                      break Fail55;
                    c_73 = ((IStrategoList)arg1).head();
                    IStrategoTerm arg2 = ((IStrategoList)arg1).tail();
                    if(arg2.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg2).isEmpty())
                      break Fail55;
                    term = termFactory.makeAppl(desugar._consSLDefineFunction_1, new IStrategoTerm[]{c_73});
                    if(true)
                      break Success11;
                  }
                  term = term2;
                }
                Success12:
                { 
                  if(cons1 == desugar._consFunCall_2)
                  { 
                    Fail56:
                    { 
                      IStrategoTerm arg3 = term.getSubterm(0);
                      if(arg3.getTermType() != IStrategoTerm.STRING || !"nanoTime".equals(((IStrategoString)arg3).stringValue()))
                        break Fail56;
                      IStrategoTerm arg4 = term.getSubterm(1);
                      if(arg4.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg4).isEmpty())
                        break Fail56;
                      term = desugar.constSLNanoTime0;
                      if(true)
                        break Success12;
                    }
                    term = term2;
                  }
                  Success13:
                  { 
                    if(cons1 == desugar._consFunCall_2)
                    { 
                      Fail57:
                      { 
                        IStrategoTerm arg5 = term.getSubterm(0);
                        if(arg5.getTermType() != IStrategoTerm.STRING || !"new".equals(((IStrategoString)arg5).stringValue()))
                          break Fail57;
                        IStrategoTerm arg6 = term.getSubterm(1);
                        if(arg6.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6).isEmpty())
                          break Fail57;
                        term = desugar.constSLNewObject0;
                        if(true)
                          break Success13;
                      }
                      term = term2;
                    }
                    Success14:
                    { 
                      if(cons1 == desugar._consFunCall_2)
                      { 
                        Fail58:
                        { 
                          IStrategoTerm d_73 = null;
                          IStrategoTerm arg7 = term.getSubterm(0);
                          if(arg7.getTermType() != IStrategoTerm.STRING || !"println".equals(((IStrategoString)arg7).stringValue()))
                            break Fail58;
                          IStrategoTerm arg8 = term.getSubterm(1);
                          if(arg8.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8).isEmpty())
                            break Fail58;
                          d_73 = ((IStrategoList)arg8).head();
                          IStrategoTerm arg9 = ((IStrategoList)arg8).tail();
                          if(arg9.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg9).isEmpty())
                            break Fail58;
                          term = termFactory.makeAppl(desugar._consSLPrintln_1, new IStrategoTerm[]{d_73});
                          if(true)
                            break Success14;
                        }
                        term = term2;
                      }
                      Success15:
                      { 
                        if(cons1 == desugar._consFunCall_2)
                        { 
                          Fail59:
                          { 
                            IStrategoTerm arg10 = term.getSubterm(0);
                            if(arg10.getTermType() != IStrategoTerm.STRING || !"readln".equals(((IStrategoString)arg10).stringValue()))
                              break Fail59;
                            IStrategoTerm arg11 = term.getSubterm(1);
                            if(arg11.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg11).isEmpty())
                              break Fail59;
                            term = desugar.constSLReadln0;
                            if(true)
                              break Success15;
                          }
                          term = term2;
                        }
                        if(cons1 == desugar._consFunCall_2)
                        { 
                          IStrategoTerm arg12 = term.getSubterm(0);
                          if(arg12.getTermType() != IStrategoTerm.STRING || !"stacktrace".equals(((IStrategoString)arg12).stringValue()))
                            break Fail52;
                          IStrategoTerm arg13 = term.getSubterm(1);
                          if(arg13.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg13).isEmpty())
                            break Fail52;
                          term = desugar.constSLStacktrace0;
                        }
                        else
                        { 
                          break Fail52;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if(true)
            break Success8;
        }
        term = term1;
      }
      if(true)
        return term;
    }
    return null;
  }
}