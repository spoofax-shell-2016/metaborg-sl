package org.metaborg.lang.sl.interpreter.natives;

import org.metaborg.lang.sl.interpreter.generated.TypesGen;
import org.metaborg.lang.sl.interpreter.generated.terms.IStmtTerm;
import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.onReturn_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.DispatchNode;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.DispatchNodeGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleKind;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public class rule_onReturn_1 extends Rule {

	@Child protected DispatchNode dispatchNode;

	public rule_onReturn_1() {
		super(SourceSection.createUnavailable("Rule", "onReturn"),
				new FrameDescriptor(), RuleKind.TERM, DEFAULT_NAME,
				onReturn_1_Term.class);
		this.dispatchNode = DispatchNodeGen.create(getSourceSection(),
				DEFAULT_NAME);
	}

	@Override
	public RuleResult execute(VirtualFrame frame) {
		Object[] arguments = frame.getArguments();
		IStmtTerm stmt = TypesGen.asonReturn_1_Term(arguments[0]).get_1();

		Object[] args = new Object[] { stmt, arguments[1], arguments[2] };

		RuleResult rr = null;
		try {
			RuleResult rrSub = dispatchNode.execute(frame, args[0].getClass(),
					args);
			rr = new RuleResult(NullV_0_Term.SINGLETON, rrSub.components);
		} catch (ReturnException rex) {
			rr = rex.getResult();
		}
		return rr;
	}
}
