import java.util.Scanner;

public class TugasJobsheet704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("Jenis Kendaraan\n1. Mobil\n2. Motor\n0. Keluar");
            System.out.print("Masukkan jenis kendaraan : ");
            jenis = sc.nextInt();
            System.out.print("Masukkan lama parkir (jam) : ");
            durasi = sc.nextInt();

            if(durasi > 5){
                total += 12500;
            }
            if(jenis == 1){
                total += durasi * 3000;
            }
            if(jenis == 2){
                total += durasi* 2000;
            }
        } while (jenis != 0);
        
        System.out.println("Jumlah yang harus dibayar : Rp."+total);

    }
}
