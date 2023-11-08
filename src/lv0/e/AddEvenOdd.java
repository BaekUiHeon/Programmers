package lv0.e;

public class AddEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int solution(int[] num_list) {
        int answer = 0;
        String odd="";
        String even="";
        for(int i: num_list){
            if(i%2==0)
                even+=i;
            else
                odd+=i;
        }
        answer=Integer.parseInt(even)+Integer.parseInt(odd);
        return answer;
    }
}
