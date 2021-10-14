import java.util.Scanner;
public class Challenge2 {
     // tentang if else
    public static void main(String args[]) {
        int nilai;
        Scanner skor = new Scanner(System.in);
        System.out.print("Masukkan Skor Anda:");
        nilai = skor.nextInt();

        if (nilai>=100){
             System.out.println("Nilai Salah");

        }  else if (nilai>=91){
             System.out.println ("Nilai Anda: A");
        }  else if (nilai>=76){
             System.out.println ("Nilai Anda: B");
        }  else if (nilai>=51){
             System.out.println ("Nilai Anda: C");
        }  else if (nilai>=26){
             System.out.println ("Nilai Anda: D");
        }  else if (nilai>=0){
             System.out.println ("Nilai Anda: E");
        }  else {
            System.out.println ("Anda Gagal");
        }
            System.out.println ("Selesai");

    }
}

