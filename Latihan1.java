import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, i;

        System.out.print("masukkan n : ");
        n = sc.nextInt();

        for(i = n; i >= 1; i-=1)
        {
            System.out.println(i);
        }
    }
}
