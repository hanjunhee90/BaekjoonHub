import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // trim은 공백을 제거해줌
        System.out.println(a.trim()+b.trim());
        
    }
}