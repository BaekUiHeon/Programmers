package lv0.c;

public class ReturnBigInt2 {

	public static void main(String[] args) {
		System.out.println(solution(12,9));
	}
    public static int solution(int a, int b) {
        String result1=""+a+b;
        int result2=a*b*2;
        if(Integer.parseInt(result1)>=result2)
            return Integer.parseInt(result1);
        else
            return result2;
    }
}
