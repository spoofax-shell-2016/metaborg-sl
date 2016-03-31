package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.TypesGen;
import org.metaborg.lang.sl.interpreter.generated.terms.IStmtTerm;
import org.metaborg.lang.sl.interpreter.generated.terms.U_0_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.expandBoolV_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.ArgRead;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.RelationDispatch;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.premises.reduction.RelationAppLhs;
import org.metaborg.meta.lang.dynsem.interpreter.terms.BuiltinTypesGen;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeUtil;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public class rule_loop_3 extends Rule {

	public rule_loop_3() {
		super(SourceSection.createUnavailable("Rule", "loop"));
	}

	@CompilationFinal private Node createContext;

	protected DynSemContext getContext() {
		if (createContext == null) {
			createContext = DynSemContext.LANGUAGE.createFindContextNode0();
		}
		return DynSemContext.LANGUAGE.findContext0(createContext);
	}

	@Override
	public int getArity() {
		return 3;
	}

	@Override
	public String getConstructor() {
		return "loop";
	}

	@Override
	public String getName() {
		return "default";
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		try {
			return executeSafe(frame);
		} catch (UnexpectedResultException e) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			throw new RuntimeException(e);
		}
	}

	@Child protected RelationDispatch condDispatch;
	@Child protected RelationDispatch bodyDispatch;

	private RuleResult executeSafe(VirtualFrame frame)
			throws UnexpectedResultException {
		SourceSection ss = this.getSourceSection();
		Object[] args = frame.getArguments();

		boolean expectedValue = BuiltinTypesGen.expectBoolean(args[2]);

		if (condDispatch == null) {
			CompilerAsserts.neverPartOfCompilation();
			RuleRoot condRR = getContext().getRuleRegistry().lookupRule(
					"default", expandBoolV_1_Term.CONSTRUCTOR,
					expandBoolV_1_Term.ARITY);

			RelationAppLhs lhs = new RelationAppLhs(new ArgRead(1, ss),
					new TermBuild[0], new TermBuild[] { new ArgRead(4, ss),
							new ArgRead(5, ss) }, ss);
			condDispatch = new RelationDispatch.InlinedRelationDispatch(lhs,
					NodeUtil.cloneNode(condRR.getRule()),
					condRR.getFrameDescriptor(), ss);
			condDispatch.adoptChildren();
			adoptChildren();
		}

		if (bodyDispatch == null) {
			CompilerAsserts.neverPartOfCompilation();

			IStmtTerm body = TypesGen.expectIStmtTerm(args[3]);
			RuleRoot bodyRR = getContext().getRuleRegistry().lookupRule(
					"default", body.constructor(), body.arity());

			RelationAppLhs lhs = new RelationAppLhs(new ArgRead(3, ss),
					new TermBuild[0], new TermBuild[] { new ArgRead(4, ss),
							new ArgRead(5, ss) }, ss);
			bodyDispatch = new RelationDispatch.InlinedRelationDispatch(lhs,
					NodeUtil.cloneNode(bodyRR.getRule()),
					bodyRR.getFrameDescriptor(), ss);
			bodyDispatch.adoptChildren();
			adoptChildren();
		}

		while (evaluateCondition(frame) == expectedValue) {
			RuleResult bodyRes = bodyDispatch.execute(frame);
			Object[] bodyComps = bodyRes.components;
			args[4] = bodyComps[0];
			args[5] = bodyComps[1];
		}

		return new RuleResult(new U_0_Term(), new Object[] { args[4], args[5] });
	}

	private boolean evaluateCondition(VirtualFrame frame)
			throws UnexpectedResultException {

		RuleResult condRes = condDispatch.execute(frame);

		// update the semantic components into the frame
		Object[] args = frame.getArguments();
		args[4] = condRes.components[0];
		args[5] = condRes.components[1];

		return BuiltinTypesGen.expectBoolean(condRes.result);
	}
}