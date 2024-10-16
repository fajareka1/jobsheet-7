import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kali = 1, n, i;
        System.out.print("Masukkan n : ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            kali = kali * i;
        }

        System.out.println(kali);
    }
}
