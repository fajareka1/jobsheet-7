import java.util.Scanner;

public class Tugas1Jobsheet704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml, allJml = 0 ;
        String lanjut;
        double diskon = 0, harga = 50000, total, allTotal = 0;
        boolean berhenti = false;

        while(berhenti == false){
            System.out.print("Ingin melanjutkan y/n : ");
            lanjut = sc.nextLine();
            if(lanjut.equalsIgnoreCase("n")){
                berhenti = true;
                continue;
            }
            System.out.print("Masukkan jumlah tiket : ");
            jml = sc.nextInt();

            if(jml > 1){
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }else if(jml > 4){
                diskon = 0.1;
            }else if(jml > 10){
                diskon = 0.15;
            }
            allJml += jml;

            total = harga * jml - ((harga * jml) * diskon);

            allTotal += total;
        }

        System.out.println("Jumlah penjualan tiket hari ini : "+ allJml);
        System.out.println("Jumlah pemasukan penjualan tiket hari ini : Rp."+ allTotal);
    }
}
