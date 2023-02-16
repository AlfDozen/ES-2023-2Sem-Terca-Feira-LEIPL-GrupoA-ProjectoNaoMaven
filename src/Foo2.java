
public class Foo2 {
	
	private int total;
	
	public Foo2(int a, int b) {
		total = a - b;
	}
	
	public int getSubtractionTotal() {
		return total;
	}
	
	public static void main(String[] args) {
		Foo2 f = new Foo2(20, 10);
		System.out.println("The total is: " + f.getSubtractionTotal());
	}
}