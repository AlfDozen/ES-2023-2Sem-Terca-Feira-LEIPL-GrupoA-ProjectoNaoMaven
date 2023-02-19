
public class Foo {
	
	private int sumTotal;
	
	public Foo(int a, int b) {
		sumTotal = a + b;
	}
	
	public int getTotal() {
		return sumTotal;
	}
	
	public static void main(String[] args) {
		Foo f = new Foo(10, 20);
		System.out.println("The total is: " + f.getTotal());
	}
}
