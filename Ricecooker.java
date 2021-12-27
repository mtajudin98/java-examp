import java.util.Scanner;

/**
 *
 * @author tazzdev
 */
public class Ricecooker {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean status;
        int berat;
        System.out.println("Mengukur kematangan");
        System.out.println("Masukan berat nasi :");
        berat = input.nextInt();
        if(berat>100){
            System.out.println("Belum Matang");
        }
        else if(berat<100){
            System.out.println("Matang");
        }
    }
}
