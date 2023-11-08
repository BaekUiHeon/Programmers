
public class LastElement {

	public static void main(String[] args) {	//26번
		// TODO Auto-generated method stub

	}
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int index=0;
        for(int i: num_list){
            answer[index++]=i;
        }
        int last=answer[--index];
        int prev=answer[--index];
        if(prev<last)
            answer[index+2]=last-prev;
        else
            answer[index+2]=last*2;
            
        return answer;
    }
}
