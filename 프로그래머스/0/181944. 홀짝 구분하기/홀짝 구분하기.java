import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "is even";
        String str2 = "is odd";
        int n = sc.nextInt();
        String str3 = (n % 2 == 0) ? str1 : str2;
        System.out.println(n + " " + str3);
        
    }
}