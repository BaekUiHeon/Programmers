package lv0.c;

public class ReturnBigInt {

	public static void main(String[] args) {
		System.out.println(returnBigInt());
	}
	
	public static int returnBigInt() {
		int a = 8;
		int b = 91;
		String result1 = "" + a + b;
		String result2 = "" + b + a;
		if (Integer.parseInt(result1) > Integer.parseInt(result2)) {
			return Integer.parseInt(result1);
		}
		else {
			return Integer.parseInt(result2);
		}
	}
}
