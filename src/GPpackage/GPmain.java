package GPpackage;

public class GPmain {

	public static void main(String[] args) {
		Number n1=new Number(5);
		Number n2=new Number(5);
		Add a1=new Add(n1,n2);
		Add a2=new Add(a1,n2);
		Tree t=new Tree(n1);
		Tree t1=new Tree(a2);
		t1.print();
		System.out.println(t1.totalNodes());
		

	}

}
