package CCCSenior2019;
// Remove the ^^^ to grade and change name to main, then revert to save

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author TheDa
 */
public class Flipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String flips = in.nextLine();
        int countH = 0;
        int countV = 0;

        for (int i = 0; i < flips.length(); i++) {
            if (flips.charAt(i) == 'H') {
                countH++;
            } else {
                countV++;
            }
        }
        countH = countH % 2;
        countV = countV % 2;

        if (countH == 0 && countV == 0) {
            System.out.println("1 2\n3 4");
        } else if (countH == 1 && countV == 1) {
            System.out.println("4 3\n2 1");
        } else if (countH == 1) {
            System.out.println("3 4\n1 2");
        } else {
            System.out.println("2 1\n4 3");
        }
    }
}
