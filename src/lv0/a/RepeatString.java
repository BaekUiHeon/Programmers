package lv0.a;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
           System.out.print(str); 
        }
        scanner.close();
    }
}
