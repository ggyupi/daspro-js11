import java.util.Scanner;
/**
 * Square
 */
public class Square {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input05.nextInt();
        for(int iOuter=1; iOuter<=N; iOuter++){
            for (int i=0; i<=N; i++){
                System.out.print("*");
            } System.out.println();
        }
        input05.close();
    }
}
