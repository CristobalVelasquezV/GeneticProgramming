package GPpackage;

import java.util.HashMap;


abstract class Expr {
	
	abstract Expr interp(HashMap<Character, Double> env);

	public abstract int maxLevel();
	
	public abstract String toString();

	public abstract int totalNodes();
}
