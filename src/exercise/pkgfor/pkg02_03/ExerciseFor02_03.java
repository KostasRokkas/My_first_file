/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkgfor.pkg02_03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ExerciseFor02_03 {

    static ArrayList<Integer> randomList(int length, int limit) {
        ArrayList<Integer> result = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.add(rand.nextInt(limit + 1));
        }
        return result;
    }

    static void countOddsEvens(ArrayList<Integer> list) {
        int odd = 0, even = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd: " + odd + " even: "
                + even);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        //System.out.println(randomList(5,100));             ΓΙΑ ΤΗΝ 1η METHOD
        ArrayList<Integer> list = randomList(1000, 10000);   // ΣΥΝΔΙΑΣΜΟΣ ΛΙΣΤΩΝ
        countOddsEvens(list);

    }

}
