package lv0.b;
import java.util.Scanner;

public class PrintVertical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}