/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import control.Game;
import model.Result;

/**
 *
 * @author MouN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Game g = new Game();
        Result r = new Result();
        int num, con;
        boolean done = false;

        while (!done) {

            // TODO code application logic here
            System.out.print("Enter your name : ");
            String name = s.next();
            try {
                System.out.print("Hvilket spil vil du spille (1 – 3) :");
                num = Integer.parseInt(s.next());
            } catch (NumberFormatException ex) {
                System.out.println("invalid input, please try again");
                continue;
            }

            switch (num) {
                case 1:
                    g.playGame1(name);

                    System.out.println("Vil du spille igen (1 = ja, 2 = nej)?");
                    con = Integer.parseInt(s.next());
                    if (con == 1) {

                    } else {
                        done = true;
                    }
                    break;
                case 2:
                    g.playGame2(name);
                    System.out.println("Vil du spille igen (1 = ja, 2 = nej)?");
                    con = Integer.parseInt(s.next());
                    if (con == 1) {

                    } else {
                        done = true;
                    }
                    break;
                case 3:
                    g.playGame3(name);
                    System.out.println("Vil du spille igen (1 = ja, 2 = nej)?");
                    con = Integer.parseInt(s.next());
                    if (con == 1) {

                    } else {
                        done = true;
                    }
                    break;

                default:
                    System.out.println("Invalid choice, try again");
                    break;

            }
        }
    }
}
