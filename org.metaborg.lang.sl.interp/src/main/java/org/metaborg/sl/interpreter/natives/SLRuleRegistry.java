package org.metaborg.sl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.Rule;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleUnionRoot;

public class SLRuleRegistry extends RuleRegistry {

	public SLRuleRegistry() {
		super();
	}

	@Override
	protected void init() {
		registerRule(new rule_onReturn_1());
		registerRule(new rule_doReturn_1());
		registerRule(new rule_doBreak_0());
		registerRule(new rule_onBreak_1());
		registerRule(new rule_onContinue_1());
		registerRule(new rule_doContinue_0());
	}

	private void registerRule(Rule r) {
		registerJointRule(r.getArrowName(), r.getDispatchClass(),
				new RuleUnionRoot(r.getSourceSection(), r.getArrowName(),
						r.getDispatchClass(), new Rule[] { r }));
	}
}