import java.util.Scanner;
/**
 * NestedLoop_2341720256
 */
public class NestedLoop_2341720256 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        Double[][] temps = new Double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {  System.out.print("Hari ke-" + (j + 1) + ": ");  
            temps[i][j] = input05.nextDouble();
            }
            System.out.println();
    }
    int i = 0;
    for (Double[]baris : temps) {
        System.out.print("Kota ke-" + (i + 1) + ": "); 
        double rata = 0; 
        for (Double kolom : baris) {  
            System.out.print(kolom + " ");
            rata += kolom;
        }
        rata /= baris.length;
        System.out.print("Rata-rata adalah " + rata);
        System.out.println();
        i++;
}input05.close();
    }
}