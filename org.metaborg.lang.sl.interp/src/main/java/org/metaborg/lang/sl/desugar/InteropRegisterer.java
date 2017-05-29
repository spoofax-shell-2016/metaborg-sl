package org.metaborg.lang.sl.desugar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("unused") public class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
{ 
  @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    register(context, compiledContext, context.getVarScope());
  }

  @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
  { 
    registerLazy(context, compiledContext, classLoader, context.getVarScope());
  }

  private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("desugar");
    desugar.init(compiledContext);
    varScope.addSVar("desugar_editor_0_0", new InteropSDefT(desugar_editor_0_0.instance, context));
    varScope.addSVar("desugar_all_0_0", new InteropSDefT(desugar_all_0_0.instance, context));
    varScope.addSVar("desugar_0_0", new InteropSDefT(desugar_0_0.instance, context));
    varScope.addSVar("FunDef_3_0", new InteropSDefT($Fun$Def_3_0.instance, context));
    varScope.addSVar("FunCall_2_0", new InteropSDefT($Fun$Call_2_0.instance, context));
    varScope.addSVar("Int_1_0", new InteropSDefT($Int_1_0.instance, context));
    varScope.addSVar("String_1_0", new InteropSDefT($String_1_0.instance, context));
    varScope.addSVar("True_0_0", new InteropSDefT($True_0_0.instance, context));
    varScope.addSVar("False_0_0", new InteropSDefT($False_0_0.instance, context));
    varScope.addSVar("Add_2_0", new InteropSDefT($Add_2_0.instance, context));
    varScope.addSVar("Div_2_0", new InteropSDefT($Div_2_0.instance, context));
    varScope.addSVar("Mul_2_0", new InteropSDefT($Mul_2_0.instance, context));
    varScope.addSVar("Sub_2_0", new InteropSDefT($Sub_2_0.instance, context));
    varScope.addSVar("Eq_2_0", new InteropSDefT($Eq_2_0.instance, context));
    varScope.addSVar("Lte_2_0", new InteropSDefT($Lte_2_0.instance, context));
    varScope.addSVar("Lt_2_0", new InteropSDefT($Lt_2_0.instance, context));
    varScope.addSVar("Neq_2_0", new InteropSDefT($Neq_2_0.instance, context));
    varScope.addSVar("Gte_2_0", new InteropSDefT($Gte_2_0.instance, context));
    varScope.addSVar("Gt_2_0", new InteropSDefT($Gt_2_0.instance, context));
    varScope.addSVar("And_2_0", new InteropSDefT($And_2_0.instance, context));
    varScope.addSVar("Or_2_0", new InteropSDefT($Or_2_0.instance, context));
    varScope.addSVar("Not_1_0", new InteropSDefT($Not_1_0.instance, context));
    varScope.addSVar("VarRead_1_0", new InteropSDefT($Var$Read_1_0.instance, context));
    varScope.addSVar("VarWrite_2_0", new InteropSDefT($Var$Write_2_0.instance, context));
    varScope.addSVar("PropRead_2_0", new InteropSDefT($Prop$Read_2_0.instance, context));
    varScope.addSVar("PropWrite_3_0", new InteropSDefT($Prop$Write_3_0.instance, context));
    varScope.addSVar("MethodCall_3_0", new InteropSDefT($Method$Call_3_0.instance, context));
    varScope.addSVar("Stmt_1_0", new InteropSDefT($Stmt_1_0.instance, context));
    varScope.addSVar("Block_1_0", new InteropSDefT($Block_1_0.instance, context));
    varScope.addSVar("While_2_0", new InteropSDefT($While_2_0.instance, context));
    varScope.addSVar("IfNoElse_2_0", new InteropSDefT($If$No$Else_2_0.instance, context));
    varScope.addSVar("IfThenElse_3_0", new InteropSDefT($If$Then$Else_3_0.instance, context));
    varScope.addSVar("Return_1_0", new InteropSDefT($Return_1_0.instance, context));
    varScope.addSVar("ReturnVoid_0_0", new InteropSDefT($Return$Void_0_0.instance, context));
    varScope.addSVar("Break_0_0", new InteropSDefT($Break_0_0.instance, context));
    varScope.addSVar("Continue_0_0", new InteropSDefT($Continue_0_0.instance, context));
    varScope.addSVar("ProgramDesug_2_0", new InteropSDefT($Program$Desug_2_0.instance, context));
    varScope.addSVar("SLDefineFunction_1_0", new InteropSDefT($S$L$Define$Function_1_0.instance, context));
    varScope.addSVar("SLNanoTime_0_0", new InteropSDefT($S$L$Nano$Time_0_0.instance, context));
    varScope.addSVar("SLNewObject_0_0", new InteropSDefT($S$L$New$Object_0_0.instance, context));
    varScope.addSVar("SLPrintln_1_0", new InteropSDefT($S$L$Println_1_0.instance, context));
    varScope.addSVar("SLReadln_0_0", new InteropSDefT($S$L$Readln_0_0.instance, context));
    varScope.addSVar("SLStacktrace_0_0", new InteropSDefT($S$L$Stacktrace_0_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("desugar");
    desugar.init(compiledContext);
    varScope.addSVar("desugar_editor_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.desugar_editor_0_0", context));
    varScope.addSVar("desugar_all_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.desugar_all_0_0", context));
    varScope.addSVar("desugar_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.desugar_0_0", context));
    varScope.addSVar("FunDef_3_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Fun$Def_3_0", context));
    varScope.addSVar("FunCall_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Fun$Call_2_0", context));
    varScope.addSVar("Int_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Int_1_0", context));
    varScope.addSVar("String_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$String_1_0", context));
    varScope.addSVar("True_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$True_0_0", context));
    varScope.addSVar("False_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$False_0_0", context));
    varScope.addSVar("Add_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Add_2_0", context));
    varScope.addSVar("Div_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Div_2_0", context));
    varScope.addSVar("Mul_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Mul_2_0", context));
    varScope.addSVar("Sub_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Sub_2_0", context));
    varScope.addSVar("Eq_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Eq_2_0", context));
    varScope.addSVar("Lte_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Lte_2_0", context));
    varScope.addSVar("Lt_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Lt_2_0", context));
    varScope.addSVar("Neq_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Neq_2_0", context));
    varScope.addSVar("Gte_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Gte_2_0", context));
    varScope.addSVar("Gt_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Gt_2_0", context));
    varScope.addSVar("And_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$And_2_0", context));
    varScope.addSVar("Or_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Or_2_0", context));
    varScope.addSVar("Not_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Not_1_0", context));
    varScope.addSVar("VarRead_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Var$Read_1_0", context));
    varScope.addSVar("VarWrite_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Var$Write_2_0", context));
    varScope.addSVar("PropRead_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Prop$Read_2_0", context));
    varScope.addSVar("PropWrite_3_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Prop$Write_3_0", context));
    varScope.addSVar("MethodCall_3_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Method$Call_3_0", context));
    varScope.addSVar("Stmt_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Stmt_1_0", context));
    varScope.addSVar("Block_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Block_1_0", context));
    varScope.addSVar("While_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$While_2_0", context));
    varScope.addSVar("IfNoElse_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$If$No$Else_2_0", context));
    varScope.addSVar("IfThenElse_3_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$If$Then$Else_3_0", context));
    varScope.addSVar("Return_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Return_1_0", context));
    varScope.addSVar("ReturnVoid_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Return$Void_0_0", context));
    varScope.addSVar("Break_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Break_0_0", context));
    varScope.addSVar("Continue_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Continue_0_0", context));
    varScope.addSVar("ProgramDesug_2_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$Program$Desug_2_0", context));
    varScope.addSVar("SLDefineFunction_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$S$L$Define$Function_1_0", context));
    varScope.addSVar("SLNanoTime_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$S$L$Nano$Time_0_0", context));
    varScope.addSVar("SLNewObject_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$S$L$New$Object_0_0", context));
    varScope.addSVar("SLPrintln_1_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$S$L$Println_1_0", context));
    varScope.addSVar("SLReadln_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$S$L$Readln_0_0", context));
    varScope.addSVar("SLStacktrace_0_0", new InteropSDefT(classLoader, "org.metaborg.lang.sl.desugar.$S$L$Stacktrace_0_0", context));
  }
}