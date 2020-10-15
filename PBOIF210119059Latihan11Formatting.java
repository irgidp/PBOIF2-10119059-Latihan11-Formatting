/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi program untuk menampilkan penulisan formatting
 */
package pboif2.pkg10119059.latihan11.formatting;

public class PBOIF210119059Latihan11Formatting {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3456764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n" , i);
        System.out.printf("%%10d : %10d%n" , i);
        System.out.printf("%%+10d : %+10d%n" , i);
        System.out.printf("%%+10d : %+10d%n" , iMinus);
        System.out.printf("%%,10d : %,10d%n" , i);
        System.out.printf("%%-10d : %-10d%n" , i);
        
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n" , f);
        System.out.printf("%%.2f : %.2f%n" , f);
        System.out.printf("%%12.2f : %12.2f%n" , f);
        System.out.printf("%%,12.2f : %,12.2f%n" , f);
    }
    
}
