package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class desugar  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constSLStacktrace0;

  protected static IStrategoTerm constSLReadln0;

  protected static IStrategoTerm constSLNewObject0;

  protected static IStrategoTerm constSLNanoTime0;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constFunCall0;

  protected static IStrategoTerm constNil0;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consSLStacktrace_0;

  public static IStrategoConstructor _consSLReadln_0;

  public static IStrategoConstructor _consSLPrintln_1;

  public static IStrategoConstructor _consSLNewObject_0;

  public static IStrategoConstructor _consSLNanoTime_0;

  public static IStrategoConstructor _consSLDefineFunction_1;

  public static IStrategoConstructor _consProgramDesug_2;

  public static IStrategoConstructor _consContinue_0;

  public static IStrategoConstructor _consBreak_0;

  public static IStrategoConstructor _consReturnVoid_0;

  public static IStrategoConstructor _consReturn_1;

  public static IStrategoConstructor _consIfThenElse_3;

  public static IStrategoConstructor _consIfNoElse_2;

  public static IStrategoConstructor _consWhile_2;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consStmt_1;

  public static IStrategoConstructor _consMethodCall_3;

  public static IStrategoConstructor _consPropWrite_3;

  public static IStrategoConstructor _consPropRead_2;

  public static IStrategoConstructor _consVarWrite_2;

  public static IStrategoConstructor _consVarRead_1;

  public static IStrategoConstructor _consNot_1;

  public static IStrategoConstructor _consOr_2;

  public static IStrategoConstructor _consAnd_2;

  public static IStrategoConstructor _consGt_2;

  public static IStrategoConstructor _consGte_2;

  public static IStrategoConstructor _consNeq_2;

  public static IStrategoConstructor _consLt_2;

  public static IStrategoConstructor _consLte_2;

  public static IStrategoConstructor _consEq_2;

  public static IStrategoConstructor _consSub_2;

  public static IStrategoConstructor _consMul_2;

  public static IStrategoConstructor _consDiv_2;

  public static IStrategoConstructor _consAdd_2;

  public static IStrategoConstructor _consFalse_0;

  public static IStrategoConstructor _consTrue_0;

  public static IStrategoConstructor _consString_1;

  public static IStrategoConstructor _consInt_1;

  public static IStrategoConstructor _consFunCall_2;

  public static IStrategoConstructor _consFunDef_3;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consProgram_1;

  public static Context init(Context context)
  { 
    synchronized(desugar.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          context.registerComponent("desugar");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static Strategy getMainStrategy()
  { 
    return null;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consSLStacktrace_0 = termFactory.makeConstructor("SLStacktrace", 0);
    _consSLReadln_0 = termFactory.makeConstructor("SLReadln", 0);
    _consSLPrintln_1 = termFactory.makeConstructor("SLPrintln", 1);
    _consSLNewObject_0 = termFactory.makeConstructor("SLNewObject", 0);
    _consSLNanoTime_0 = termFactory.makeConstructor("SLNanoTime", 0);
    _consSLDefineFunction_1 = termFactory.makeConstructor("SLDefineFunction", 1);
    _consProgramDesug_2 = termFactory.makeConstructor("ProgramDesug", 2);
    _consContinue_0 = termFactory.makeConstructor("Continue", 0);
    _consBreak_0 = termFactory.makeConstructor("Break", 0);
    _consReturnVoid_0 = termFactory.makeConstructor("ReturnVoid", 0);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consIfThenElse_3 = termFactory.makeConstructor("IfThenElse", 3);
    _consIfNoElse_2 = termFactory.makeConstructor("IfNoElse", 2);
    _consWhile_2 = termFactory.makeConstructor("While", 2);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consStmt_1 = termFactory.makeConstructor("Stmt", 1);
    _consMethodCall_3 = termFactory.makeConstructor("MethodCall", 3);
    _consPropWrite_3 = termFactory.makeConstructor("PropWrite", 3);
    _consPropRead_2 = termFactory.makeConstructor("PropRead", 2);
    _consVarWrite_2 = termFactory.makeConstructor("VarWrite", 2);
    _consVarRead_1 = termFactory.makeConstructor("VarRead", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consOr_2 = termFactory.makeConstructor("Or", 2);
    _consAnd_2 = termFactory.makeConstructor("And", 2);
    _consGt_2 = termFactory.makeConstructor("Gt", 2);
    _consGte_2 = termFactory.makeConstructor("Gte", 2);
    _consNeq_2 = termFactory.makeConstructor("Neq", 2);
    _consLt_2 = termFactory.makeConstructor("Lt", 2);
    _consLte_2 = termFactory.makeConstructor("Lte", 2);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consSub_2 = termFactory.makeConstructor("Sub", 2);
    _consMul_2 = termFactory.makeConstructor("Mul", 2);
    _consDiv_2 = termFactory.makeConstructor("Div", 2);
    _consAdd_2 = termFactory.makeConstructor("Add", 2);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consInt_1 = termFactory.makeConstructor("Int", 1);
    _consFunCall_2 = termFactory.makeConstructor("FunCall", 2);
    _consFunDef_3 = termFactory.makeConstructor("FunDef", 3);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consProgram_1 = termFactory.makeConstructor("Program", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    const0 = termFactory.makeString("aterm");
    const1 = termFactory.makeString("'desugar-editor'");
    const2 = termFactory.makeString("main");
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constFunCall0 = termFactory.makeAppl(desugar._consFunCall_2, new IStrategoTerm[]{desugar.const2, desugar.constNil0});
    constBlock0 = termFactory.makeAppl(desugar._consBlock_1, new IStrategoTerm[]{desugar.constNil0});
    constSLNanoTime0 = termFactory.makeAppl(desugar._consSLNanoTime_0, NO_TERMS);
    constSLNewObject0 = termFactory.makeAppl(desugar._consSLNewObject_0, NO_TERMS);
    constSLReadln0 = termFactory.makeAppl(desugar._consSLReadln_0, NO_TERMS);
    constSLStacktrace0 = termFactory.makeAppl(desugar._consSLStacktrace_0, NO_TERMS);
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}