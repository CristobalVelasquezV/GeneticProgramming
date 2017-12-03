package GPpackage;

import java.util.HashMap;

public class Sub extends Expr {
	private Expr left;
	private Expr right;

	public Sub(Expr number, Expr number2) {
		left=number;
		right=number2;
	}
	@Override
	public Number interp(HashMap<Character, Double> env) {
		return ((Number)left.interp(env)).Sub((Number)right.interp(env));
	}
	@Override
	public int maxLevel() {
		return Math.max(left.maxLevel(), right.maxLevel())+1;
	}
	@Override
	public String toString() {
		return "("+left.toString() + " - " +right.toString()+")";
	}
	
	@Override
	public int totalNodes() {
		return 1+left.totalNodes()+right.totalNodes();
	}


}
