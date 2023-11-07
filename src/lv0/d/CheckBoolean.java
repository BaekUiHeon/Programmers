package lv0.d;

public class CheckBoolean {
	    public int solution(int a, int b, boolean flag) {
	        int answer = 0;
	        if(flag)
	            answer=a+b;
	        else
	            answer=a-b;
	        return answer;
	    }
	}
