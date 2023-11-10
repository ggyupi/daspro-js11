import java.util.Scanner;
/**
 * TugasIndividuNo1
 */
public class TugasIndividuNo1 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input05.nextInt();        
        for (int i = 1; i <=N; i++){
            for (int j = N-1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);                 
            }
            System.out.println();
        }
    }
}
