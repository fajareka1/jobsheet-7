import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, i, hasil = 0;
        System.out.print("masukkan bilangan yang akan dikali : ");
        bil1 = sc.nextInt();
        System.out.print("masukkan dikali berapa : ");
        bil2 = sc.nextInt();

        for(i = 1; i <= bil2; i++){
            hasil = hasil + bil1;
        }
        
        System.out.println(hasil);
    }
}
