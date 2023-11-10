import java.util.Scanner;
/**
 * TugasIndividuNo3
 */
public class TugasIndividuNo3 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input05.nextInt();
        for(int i = 0; i<N; i++) {
            System.out.print(N);
            System.out.print(" ");
            for(int j = 1; j<N-1; j++){
                if (i==0 || i==N-1)
                    System.out.print(N);
                else
                for(int k =0; k < Integer.toString(N).length(); k++)
                    System.out.print(" ");
                    System.out.print(" ");

                }
                System.out.print(N);
                System.out.println();
            }
        }
    }
