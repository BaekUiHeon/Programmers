package lv0.d;

public class CompareInt {

	public static void main(String[] args) {
		System.out.println(solution("<","=",5,3));

	}
	public static int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")){
            if(eq.equals("=")){
                if(n<=m)
                    return 1;
                else
                    return 0;
            }
            else{
                if(n<m)
                    return 1;
                else
                    return 0;
            }
        }
        else{
            if(eq.equals("=")){
                if(n>=m)
                    return 1;
                else
                    return 0;
            }
            else{
                if(n>m)
                    return 1;
                else
                    return 0;
            }    
        }
    }
}
