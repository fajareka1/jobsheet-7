import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  bill = 3, n, i;

        System.out.print("masukkan n : ");
        n = sc.nextInt();


        for(i = 1; bill <= n; i+=2){
            System.out.println(bill);
            bill = bill + i;
        }

    }
}
