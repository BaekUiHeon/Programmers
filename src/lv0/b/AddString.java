package lv0.b;
import java.util.Scanner;

public class AddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a+b);
        sc.close();
    }
}