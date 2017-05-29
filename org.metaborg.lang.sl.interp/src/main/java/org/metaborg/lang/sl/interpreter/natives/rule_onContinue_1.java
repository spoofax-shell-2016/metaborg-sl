package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.TypesGen;
import org.metaborg.lang.sl.interpreter.generated.terms.IStmtTerm;
import org.metaborg.lang.sl.interpreter.generated.terms.onContinue_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.DispatchNode;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.DispatchNodeGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleKind;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onContinue_1 extends Rule {

	@Child
	protected DispatchNode dispatchNode;

	public rule_onContinue_1() {
		super(SourceSection.createUnavailable("Rule", "onContinue"), new FrameDescriptor(), RuleKind.TERM, DEFAULT_NAME,
				onContinue_1_Term.class);
		this.dispatchNode = DispatchNodeGen.create(getSourceSection(), DEFAULT_NAME);
	}

	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();

		onContinue_1_Term reducedTerm = TypesGen.asonContinue_1_Term(arguments[0]);

		IStmtTerm stmt = reducedTerm.get_1();

		Object[] args = new Object[] { stmt, arguments[1], arguments[2] };

		return invoke(frame, args);
	}

	private RuleResult invoke(VirtualFrame frame, Object[] args) {
		try {

			return (RuleResult) dispatchNode.execute(frame, args[0].getClass(), args);
		} catch (ContinueException cex) {
			Object[] components = cex.getComponents();
			System.arraycopy(components, 0, args, args.length - components.length, components.length);
			// FIXME eliminate this recursive call
			return invoke(frame, args);
		}
	}

}
