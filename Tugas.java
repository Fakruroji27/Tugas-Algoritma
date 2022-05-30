import com.sun.javafx.sg.prism.NodePath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class urutanhewan {
    public class urutanhewan {
        public void main(String[] args) throws Exception {
            BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
            // Class Buffered menjadi variabel baru bernama kata
            int a; // Mendeklarasikan variable bernama a bertipe data integer
            System.out.println("Jumlah Hewan Yang Di Inputkan ;");
            a = Integer.parseInt(kata.readLine()); // mengconvert a yang asalnya

            String[] Array; // mendeklarasikan array yang bertipe data string
            Array = new String[a]; // instansiasi dan inisialisasi variable a
            String temp; // mendeklarasikan variabel temp yang bertipe data string
            // penginputan hewan
            for (int i = 0; i < a; i++) {
                System.out.print("Hewan " + (i + 1) + " adalah: ");
                NodePath input = null;
            }
            // proses penyortingan
            for (int x = 1; x < a; x++) {
                for (int y = 0; y < a - x; y++) {
                    if (Array[y].compareTo(Array[y + 1]) > 0) {
                        temp = Array[y];//ayam, ikan, singa, burung, harimau, landak, ular, kerbau, sapi, kambing nyamuk, lalat, paus, kucing
                        Array[y] = Array[y + 1];//singa, harimau, burung, ular, sapi, kerbau, paus, jerapah, gajah, babi, anjing, monyet,kucing,kuda
                        Array[y + 1] = temp; //kuda laut, ular, sapi, ikan, ayam, kucing, anjing, monyet, laba-laba, lumba-lumba, gajah, jerapah,beruang,naga
                    }
                }
            }
            // output pengurutan nama
            System.out.println("");
            System.out.println("Urutannya ");

            for (int i = 0; i < a; i++) {
                System.out.println((i + 1) + ". " + Array[i]);
            }
            // output dari jumlah siswa
            System.out.println("Jumlah kandang : " + a);
            System.out.println("hewan 2 terbawah : " + Array[a - 2]);
            System.out.println("hewan 2 teratas : " + Array[1]);
        }
    }
}