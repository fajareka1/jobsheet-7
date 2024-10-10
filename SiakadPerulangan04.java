import java.util.Scanner;

public class SiakadPerulangan04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for(int i = 1; i<= 10;){
            System.out.print("Masukkan nilai mahasiswa ke " + i + " : ");
            nilai = sc.nextDouble();

            if(nilai > tertinggi){
                tertinggi = nilai;
            }if(nilai < terendah){
                terendah = nilai;
            }
            if(nilai < 60){
                tidakLulus +=1;
            }
            i ++;
        }

        System.out.println("Nilai tertinggi : "+ tertinggi);
        System.out.println("Nilai terendah : "+ terendah);
        System.out.println("Jumlah Mahasiswa yang tidak lulus : "+ tidakLulus);
    }
}