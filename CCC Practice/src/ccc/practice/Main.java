
import java.util.Scanner;

/**
 *
 * @author vand5950
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positionOne = input.nextInt();
        int positionTwo = input.nextInt();
        int positionThree = input.nextInt();
        int positionFour = input.nextInt();

        if ((positionOne == 8)||(positionOne == 9)) {
            System.out.println("ignore");
            } else if ((positionFour == 8)||(positionFour==9)) {
                System.out.println("ignore");
            } else if (positionThree == positionFour) {
                System.out.println("ignore");
            } else {
                System.out.println("answer");
            }
        }
    }


