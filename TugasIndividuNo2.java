import java.util.Scanner;
/**
 * TugasIndividuNo2
 */
public class TugasIndividuNo2 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input05.nextInt();
        for (int iOuter= 1; iOuter<=N; iOuter++){
            for (int j = N; j >= iOuter; j--){
                
                System.out.print("*");
              
                
            }System.out.println();
        } input05.close();
    }
}