
public class Foo {
	
	private int total;
	
	public Foo(int a, int b) {
		total = a + b;
	}
	
	public int getTotal() {
		return total;
	}
	
	public static void main(String[] args) {
		Foo f = new Foo(10, 20);
		System.out.println("The total is: " + f.getTotal());
	}
}
