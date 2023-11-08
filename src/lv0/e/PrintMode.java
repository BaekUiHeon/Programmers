package lv0.e;

public class PrintMode {

	public static void main(String[] args) {
		System.out.println(solution("avb1ldkmf"));	//21번 문제
		
	}
    public static String solution(String code) {
        int mode=0;
        String ret="";
        for(int i=0;i<code.length();i++){
        if(mode==0){
            if(code.charAt(i)=='1')
                mode=1;
             else
                if(i%2==0)
                    ret+=code.charAt(i);
        }
        else{
            if(code.charAt(i)=='1')
                mode=0;
            else
                if(i%2==1)
                    ret+=code.charAt(i);
        }
        }
        if(ret.equals(""))
            return "EMPTY";
        else
            return ret;
    }
}
