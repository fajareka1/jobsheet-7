import java.util.Scanner;

public class Percobaan3TransaksiKafe0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int kopi, teh, roti, totalBayar;

        do {
            System.err.print("Masukkan nama anda (ketik 'batal' jika ingin berhenti) : ");
            nama = sc.nextLine();

            if(nama.equalsIgnoreCase("batal")){
                System.out.println("terimaksih");
                break;
            }

            System.out.print("Masukkan jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.println("Masukkan jumlah teh : ");
            teh = sc.nextInt();
            System.out.println("Masukkan jumlah roti : ");
            roti = sc.nextInt();

            totalBayar = (kopi * 12000) + (teh * 7000) + (roti* 20000);
            System.out.println("Total bayar : " + totalBayar);
            sc.nextLine();
        } while (true);

    }
}
