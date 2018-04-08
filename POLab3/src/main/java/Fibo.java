/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//3.4
/**
 *
 * @author Wojciech
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 0, y = 1, z, i, w = 47;
        System.out.println("Zaimplementuj algorytm obliczający wartość ciągu Fibonacciego.");
        System.out.println(x);
        System.out.println(y);
      

        for (i = 2; i < w; i++) {
            z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }

    }

}
