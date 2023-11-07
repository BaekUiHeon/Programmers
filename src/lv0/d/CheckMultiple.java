package lv0.d;

public class CheckMultiple {

	public static void main(String[] args) {
		System.out.println(solution(31,3));

	}
    public static int solution(int num, int n) {
        if(num%n==0)
            return 1;
        else
            return 0;
    }
}
