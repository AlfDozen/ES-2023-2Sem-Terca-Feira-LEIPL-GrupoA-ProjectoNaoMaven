
public class Foo2 {
	
	private int subTotal;
	
	public Foo2(int a, int b) {
		subTotal = a - b;
	}
	
	public int getSubtractionTotal() {
		return subTotal;
	}
	
	public static void main(String[] args) {
		Foo2 f = new Foo2(20, 10);
		System.out.println("The total is: " + f.getSubtractionTotal());
	}
}