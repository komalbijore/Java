public class P1 {

	public static void test(int a) {
		System.out.println("int");
	}
	
	public static void test(char a) {
		System.out.println("char");
	}
	
	public static void test(double a) {
		System.out.println("double");
	}
	
	public static void test(float a) {
		System.out.println("float");
	}
	
	public static void test(long a) {
		System.out.println("long");
	}
	
	public static void main(String[] args) {
		test('c');
		test(10f);
	}
}
