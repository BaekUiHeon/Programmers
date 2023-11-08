package lv0.e;

public class DiceGame {

	public static void main(String[] args) {	//23번 주사위 문제
		
	}
    public int solution(int a, int b, int c) {
        int count=0;
        if(a==b)
            count++;
        if(a==c)
            count++;
        if(b==c)
            count++;
        if(count==0)
            return a+b+c;
        if(count==1)
            return (a+b+c)*(a*a+b*b+c*c);
        return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            
    }
}
