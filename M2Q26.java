import java.util.Scanner;

public class M2Q26{
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = n;
        while(n>=3){
            k=k+n/3;
            n=n/3+n%3;
        }
        System.out.println(k);
    }
}