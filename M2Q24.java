import java.util.Scanner;

public class M2Q24{
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++ ){
            sum+=i;
            if(n<sum){
                i=i-1;
                System.out.println(i);
                break;
            }
        }
    }
}