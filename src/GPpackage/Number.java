package GPpackage;

import java.util.HashMap;

public class Number extends Expr {
	private double num;
	
	public Number (double d){
		num=d;
	}


	public Number Sum(Number a){
		return new Number(a.num+this.num);
	}
	public Number Mult(Number a){
		return new Number(a.num*this.num);
	}
	public Number Div(Number a){
		return new Number(a.num/this.num);
	}

	public Number Sub(Number a) {
		return new Number(-a.num+this.num);
	}
	public boolean SameNumber(Number a){
		return a.num==this.num;
	}
	@Override
	public String toString(){
		return '\u0022'+Double.toString(num)+'\u0022';
	}
	
	
	@Override
	Number interp(HashMap<Character, Double> env) {
		return this;
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
