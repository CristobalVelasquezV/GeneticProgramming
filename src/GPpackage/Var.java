package GPpackage;

import java.util.HashMap;


public class Var extends Expr {
	private char v;
	
	public Var (char d){
		v=d;
	}


	@Override
	public String toString(){
		return Character.toString(v);
	}
	
	
	@Override
	public Expr interp(HashMap<Character, Double> env) {
		return new Number(env.get(v));
	}


	@Override
	public int maxLevel() {
		return 0;
	}
	
	@Override
	public int totalNodes() {
		return 1;
	}

}
