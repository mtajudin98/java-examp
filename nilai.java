import java.util.Scanner;

/**
 *
 * @author tazzdev
 */
public class nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.println("Menilai Hasil Ujian");
        System.out.println("Masukan nilai : ");
        nilai = input.nextInt();
        if(nilai>80){
            System.out.print("A");
        }
        else if(nilai >= 71 && nilai <= 80){
            System.out.print("B");
        }
        else if(nilai >= 51 && nilai <= 70){
            System.out.print("C");
        }
        else if (nilai >= 31 && nilai <= 50){
            System.out.print("D");
        }
        else if (nilai <=31 ){
            System.out.print("E");
        }
    }
}
