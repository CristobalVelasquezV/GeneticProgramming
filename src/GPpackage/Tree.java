package GPpackage;

public class Tree {
	Expr root;
	
	
	public Tree(Expr r){
		root=r;
	}
	
	public void print(){
		System.out.println(root.toString());
	}
	
	public int maxLevel(){
		return root.maxLevel();
	}
	public int totalNodes(){
		return root.totalNodes();
	}

}
