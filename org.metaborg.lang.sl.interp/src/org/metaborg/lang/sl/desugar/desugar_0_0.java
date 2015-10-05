package org.metaborg.lang.sl.desugar;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

@SuppressWarnings("all")
public class desugar_0_0 extends Strategy {
	public static desugar_0_0 instance = new desugar_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term) {
		ITermFactory termFactory = context.getFactory();
		context.push("desugar_0_0");
		Fail1: {
			IStrategoTerm term10 = term;
			IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl) term)
					.getConstructor() : null;
			Success0: {
				if (cons0 == desugar._consProgram_1) {
					Fail2: {
						IStrategoTerm m_3 = null;
						m_3 = term.getSubterm(0);
						term = desugar_funcs_0_0.instance.invoke(context, m_3);
						if (term == null)
							break Fail2;
						term = termFactory
								.makeAppl(desugar._consProgramDesug_2,
										new IStrategoTerm[] { term,
												desugar.constStmt0 });
						if (true)
							break Success0;
					}
					term = term10;
				}
				Success1: {
					if (cons0 == desugar._consFunDef_3) {
						Fail3: {
							IStrategoTerm h_3 = null;
							IStrategoTerm i_3 = null;
							IStrategoTerm j_3 = null;
							h_3 = term.getSubterm(0);
							i_3 = term.getSubterm(1);
							j_3 = term.getSubterm(2);
							term = desugar_params_0_0.instance.invoke(context,
									i_3);
							if (term == null)
								break Fail3;
							term = termFactory.makeAppl(
									desugar._consFunDefDesug_3,
									new IStrategoTerm[] { h_3, term, j_3 });
							if (true)
								break Success1;
						}
						term = term10;
					}
					Success2: {
						if (cons0 == desugar._consFunCall_2) {
							Fail4: {
								IStrategoTerm d_3 = null;
								IStrategoTerm e_3 = null;
								d_3 = term.getSubterm(0);
								e_3 = term.getSubterm(1);
								term = desugar_args_0_0.instance.invoke(
										context, e_3);
								if (term == null)
									break Fail4;
								term = termFactory.makeAppl(
										desugar._consFunCallDesug_2,
										new IStrategoTerm[] { d_3, term });
								if (true)
									break Success2;
							}
							term = term10;
						}
						Success3: {
							if (cons0 == desugar._consMethodCall_3) {
								Fail5: {
									IStrategoTerm y_2 = null;
									IStrategoTerm z_2 = null;
									IStrategoTerm a_3 = null;
									y_2 = term.getSubterm(0);
									z_2 = term.getSubterm(1);
									a_3 = term.getSubterm(2);
									term = desugar_args_0_0.instance.invoke(
											context, a_3);
									if (term == null)
										break Fail5;
									term = termFactory.makeAppl(
											desugar._consMethodCallDesug_3,
											new IStrategoTerm[] { y_2, z_2,
													term });
									if (true)
										break Success3;
								}
								term = term10;
							}
							Success4: {
								if (cons0 == desugar._consFunCallDesug_2) {
									Fail6: {
										IStrategoTerm x_2 = null;
										IStrategoTerm arg14 = term
												.getSubterm(0);
										if (arg14.getTermType() != IStrategoTerm.STRING
												|| !"defineFunction"
														.equals(((IStrategoString) arg14)
																.stringValue()))
											break Fail6;
										IStrategoTerm arg15 = term
												.getSubterm(1);
										if (arg15.getTermType() != IStrategoTerm.APPL
												|| desugar._consArgSeq_2 != ((IStrategoAppl) arg15)
														.getConstructor())
											break Fail6;
										x_2 = arg15.getSubterm(0);
										IStrategoTerm arg16 = arg15
												.getSubterm(1);
										if (arg16.getTermType() != IStrategoTerm.APPL
												|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg16)
														.getConstructor())
											break Fail6;
										term = termFactory
												.makeAppl(
														desugar._consSLDefineFunction_1,
														new IStrategoTerm[] { x_2 });
										if (true)
											break Success4;
									}
									term = term10;
								}
								Success5: {
									if (cons0 == desugar._consFunCallDesug_2) {
										Fail7: {
											IStrategoTerm arg17 = term
													.getSubterm(0);
											if (arg17.getTermType() != IStrategoTerm.STRING
													|| !"nanoTime"
															.equals(((IStrategoString) arg17)
																	.stringValue()))
												break Fail7;
											IStrategoTerm arg18 = term
													.getSubterm(1);
											if (arg18.getTermType() != IStrategoTerm.APPL
													|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg18)
															.getConstructor())
												break Fail7;
											term = desugar.constSLNanoTime0;
											if (true)
												break Success5;
										}
										term = term10;
									}
									Success6: {
										if (cons0 == desugar._consFunCallDesug_2) {
											Fail8: {
												IStrategoTerm arg19 = term
														.getSubterm(0);
												if (arg19.getTermType() != IStrategoTerm.STRING
														|| !"new"
																.equals(((IStrategoString) arg19)
																		.stringValue()))
													break Fail8;
												IStrategoTerm arg20 = term
														.getSubterm(1);
												if (arg20.getTermType() != IStrategoTerm.APPL
														|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg20)
																.getConstructor())
													break Fail8;
												term = desugar.constSLNewObject0;
												if (true)
													break Success6;
											}
											term = term10;
										}
										Success7: {
											if (cons0 == desugar._consFunCallDesug_2) {
												Fail9: {
													IStrategoTerm w_2 = null;
													IStrategoTerm arg21 = term
															.getSubterm(0);
													if (arg21.getTermType() != IStrategoTerm.STRING
															|| !"println"
																	.equals(((IStrategoString) arg21)
																			.stringValue()))
														break Fail9;
													IStrategoTerm arg22 = term
															.getSubterm(1);
													if (arg22.getTermType() != IStrategoTerm.APPL
															|| desugar._consArgSeq_2 != ((IStrategoAppl) arg22)
																	.getConstructor())
														break Fail9;
													w_2 = arg22.getSubterm(0);
													IStrategoTerm arg23 = arg22
															.getSubterm(1);
													if (arg23.getTermType() != IStrategoTerm.APPL
															|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg23)
																	.getConstructor())
														break Fail9;
													term = termFactory
															.makeAppl(
																	desugar._consSLPrintln_1,
																	new IStrategoTerm[] { w_2 });
													if (true)
														break Success7;
												}
												term = term10;
											}
											Success8: {
												if (cons0 == desugar._consFunCallDesug_2) {
													Fail10: {
														IStrategoTerm arg24 = term
																.getSubterm(0);
														if (arg24.getTermType() != IStrategoTerm.STRING
																|| !"readln"
																		.equals(((IStrategoString) arg24)
																				.stringValue()))
															break Fail10;
														IStrategoTerm arg25 = term
																.getSubterm(1);
														if (arg25.getTermType() != IStrategoTerm.APPL
																|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg25)
																		.getConstructor())
															break Fail10;
														term = desugar.constSLReadln0;
														if (true)
															break Success8;
													}
													term = term10;
												}
												if (cons0 == desugar._consFunCallDesug_2) {
													IStrategoTerm arg26 = term
															.getSubterm(0);
													if (arg26.getTermType() != IStrategoTerm.STRING
															|| !"stacktrace"
																	.equals(((IStrategoString) arg26)
																			.stringValue()))
														break Fail1;
													IStrategoTerm arg27 = term
															.getSubterm(1);
													if (arg27.getTermType() != IStrategoTerm.APPL
															|| desugar._consNoArgSeq_0 != ((IStrategoAppl) arg27)
																	.getConstructor())
														break Fail1;
													term = desugar.constSLStacktrace0;
												} else {
													break Fail1;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			context.popOnSuccess();
			if (true)
				return term;
		}
		context.popOnFailure();
		return null;
	}
}