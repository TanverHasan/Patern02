/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patern02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1410453
 */
public class Patern02 {

    /**http://www.vincehuston.org/dp/ObserverDemosJava
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subject sub = new Subject();
        // 7. Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
//        while (true) {
//            //System.out.print("\nEnter a number: ");
//            //sub.setState(test());
//            test();
//
//        }
        for(int i=0; i<100; i++){
            System.out.print("\nEnter a number");
        sub.setState(test());
        }
    

    }

    private static int test() {
        
        int number=0;
        Random r = new Random();
        //for (int i = 0; i < 100; i++) {
            number = r.nextInt(100);
            System.out.println(" : " + number);
        //}
        return number;

    }

}
