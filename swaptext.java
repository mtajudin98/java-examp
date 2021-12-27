import java.util.Scanner;

/**
 *
 * @author tazzdev
 */
public class swaptext {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        var input = new Scanner(System.in);
        String a, b,c="kosong";
        System.out.println("Masukan text");
        System.out.println("Masukan berat a :");
        a = input.next();
        System.out.println("Masukan berat b :");
        b = input.next();
        c = a;
        a = b;
        b =c;
        System.out.println("hasil dari a"+a);
        System.out.println("hasil dari b"+b);
    }
}
