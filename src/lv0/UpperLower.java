package lv0;
import java.util.Scanner;


public class UpperLower {
    public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        char tmp;
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<str.length();i++) {
	        	if((tmp=str.charAt(i))<97)
	        		sb.append((char)(tmp+32));
	        	else
	        		sb.append((char)(tmp-32));
	        }
	        System.out.println(sb.toString());
	        sc.close();
	}
}
