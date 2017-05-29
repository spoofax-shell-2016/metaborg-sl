package org.metaborg.lang.sl.interpreter.natives;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.metaborg.lang.sl.interpreter.generated.terms.BoolV_1_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.FunV_3_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.IVTerm;
import org.metaborg.lang.sl.interpreter.generated.terms.NullV_0_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.NumV_1_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.ObjV_1_Term;
import org.metaborg.lang.sl.interpreter.generated.terms.StringV_1_Term;

public class ObjData {

	private Map<String, IVTerm> store = new HashMap<>();

	public IVTerm writeProp(String prop, IVTerm v) {
		store.put(prop, v);
		return v;
	}

	public IVTerm readProp(String prop) {
		IVTerm v = store.get(prop);
		if (v == null) {
			v = NullV_0_Term.SINGLETON;
		}
		return v;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n");
		for (Entry<String, IVTerm> entry : store.entrySet()) {
			builder.append(
					entry.getKey() + " : " + v2s_1(entry.getValue()) + "\n");
		}
		builder.append("}");
		return builder.toString();
	}

	public static String v2s_1(IVTerm v) {
		if (v instanceof StringV_1_Term) {
			return ((StringV_1_Term) v).get_1();
		}

		if (v instanceof BoolV_1_Term) {
			return ((BoolV_1_Term) v).get_1() + "";
		}

		if (v instanceof NumV_1_Term) {
			return ((NumV_1_Term) v).get_1() + "";
		}

		if (v instanceof NullV_0_Term) {
			return "null";
		}

		if (v instanceof FunV_3_Term) {
			return ((FunV_3_Term) v).get_1();
		}

		if (v instanceof ObjV_1_Term) {
			return ((ObjV_1_Term) v).get_1() + "";
		}

		return v + "";
	}
}