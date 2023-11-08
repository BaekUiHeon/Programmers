package lv0.e;

public class ArithmeticSequence_Add {

	public static void main(String[] args) { //22번

	}
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int index=0;
        for(boolean torf: included){
            if(torf)
                answer+=a+d*index;
             index++;
        }
        return answer;
    }
}
