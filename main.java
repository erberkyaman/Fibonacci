import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n,sum=0,a=0,b=1;
        Scanner input =new Scanner(System.in);

        System.out.print("Elaman Sayısı Giriniz : ");
        n = input.nextInt();
        for (int i=0;i<=n;i++){
            sum=a+b;
            System.out.print(a+" ");
            a=b;
            b=sum;
        }
    }
}
