package lv0.d;

public class CheckMultiple2 {

	public static void main(String[] args) {
		System.out.println(solution(30,5,19));
	}
    public static int solution(int number, int n, int m) {
        if(number%n==0 && number%m==0)
            return 1;
        else
            return 0;
    }
}
