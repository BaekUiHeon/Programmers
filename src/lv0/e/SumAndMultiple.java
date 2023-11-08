package lv0.e;

public class SumAndMultiple {

	public static void main(String[] args) {	// 24번 
		// TODO Auto-generated method stub

	}
    public int solution(int[] num_list) {
        int result1=0;
        int result2=1;
        for(int i: num_list){
            result1+=i;           
            result2*=i;
        }
         result1=(result1*result1);
        if(result1>result2)
            return 1;
        return 0;
    }
}
