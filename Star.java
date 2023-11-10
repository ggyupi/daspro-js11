import java.util.Scanner;
/**
 * Star
 */
public class Star {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input05.nextInt();
        for (int i = 1; i<=N; i--){
            System.out.print("*");
        }
        input05.close();
    }
}