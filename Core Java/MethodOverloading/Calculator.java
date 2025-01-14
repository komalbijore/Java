//WAJP to create calculator consist of 5 methods, to perform
//1)addition of 2 numbers    2)addition of 3 numbers  3)addition of 4 numbers     4)addition of 5 numbers      5)addition of 6 numbers
//i)return result from each method ii)store the result which is return from each method  iii)print the result 

public class Calculator {
	
	//addition of 2 numbers 
	public static int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	//addition of 3 numbers 
	public static int add(int a, int b, int c) {
		int d=a+b+c;
		return d;
	}
	
	//addition of 4 numbers 
	public static int add(int a, int b, int c, int d) {
		int e=a+b+c+d;
		return e;
	}
	
	//addition of 5 numbers 
	public static int add(int a, int b, int c, int d, int e) {
		int f=a+b+c+d+e;
		return f;
	}
	
	//addition of 6 numbers 
	public static int add(int a, int b, int c,int d, int e, int f) {
		int g=a+b+c+d+e+f;
		return g;
	}
	
	public static void main(String[] args) {
		
		int r1=add(1,2);
		
		int r2=add(1,2,3);
		
		int r3=add(1,2,3,4);
		
		int r4=add(1,2,3,4,5);
		
		int r5=add(1,2,3,4,5,6);
		
		System.out.println("Add of 2 numbers : "+r1);
		System.out.println("Add of 3 numbers : "+r2);
		System.out.println("Add of 4 numbers : "+r3);
		System.out.println("Add of 5 numbers : "+r4);
		System.out.println("Add of 6 numbers : "+r5);
	}
}
