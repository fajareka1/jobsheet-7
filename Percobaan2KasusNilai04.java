import java.util.Scanner;

public class Percobaan2KasusNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml, i = 0;
        double nilai;

        System.out.print("Input jumlah mahasiswa : ");
        jml = sc.nextInt();

        while (i < jml) {
            int a = i+1;
            System.out.print("Masukkan nilai mahasiswa ke "+ a + " : ");
            nilai = sc.nextDouble();

            if(nilai < 1 || nilai > 100){
                System.out.println("Nilai tidak valid");
                continue;
            }

            if(nilai <= 100 && nilai > 80){
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah A") ;
                System.out.println("Bagus Pertahankan Nilainya") ;
            }else if(nilai <= 80 && nilai > 73){
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah B+") ;
            }else if(nilai <= 73 && nilai > 65){
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah B") ;
            }else if(nilai <= 65 && nilai > 60){
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah C+") ;
            }else if(nilai <= 60 && nilai > 50){
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah C") ;
            }else if(nilai <= 50 && nilai > 39){
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah D") ;
            }else{
                System.out.println("Kategori huruf nilai mahasiswa ke-" + a + " adalah E") ;
            }

            i++;
        }
    }
}
