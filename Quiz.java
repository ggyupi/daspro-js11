import java.util.Scanner;
import java.util.Random;
/**
 * Quiz
 */
public class Quiz {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        Random random = new Random(); 
        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input05.nextInt();
                input05.nextLine();
                success = (answer == number);
                if (!success) {
                    if (number < answer)
                    System.out.println("jawaban anda lebih besar dari angka");
                    if (answer < number)
                    System.out.println("jawaban anda lebih kecil dari angka");
                }

            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input05.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y'); 
        input05.close();
    }
}