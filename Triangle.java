import java.util.Scanner;
/**
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input05.nextInt();
        int i = 1;
        while(i<=N){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }input05.close();
        }
        }