import java.util.Scanner;

public class Pangkat {
    public static int pangkatDua(int angka){
        int hasil =1;
        for(int i=1;i<=2;i++){
            hasil *= angka;
        }
        return hasil;  
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int angka = input.nextInt();

        int hasilPangkat = pangkatDua(angka);

        System.out.println("Hasil Pangkat Dua dari " + angka + " Adalah : " + hasilPangkat );
    }
}
