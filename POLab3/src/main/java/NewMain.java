/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
//1.4
/**
 *
 * @author Wojciech
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Przestudiuj następujący artykuł. Następnie napisz programy demonstrujące działanie operatorów:\n"
                + "- w lewo ze znakiem <<\n"
                + "- w prawo ze znakiem >>\n"
                + "- w prawo bez znaku >>>");
        Scanner scanner = new Scanner(System.in);
        int x, y, a, b, c, d, wynik1, wynik2, wynik3;
        System.out.println("\nPodaj liczbe x:");
        x = scanner.nextInt();
        System.out.println("Podaj o ile bitów chcesz przesunąć w lewo podaną liczbe x:");
        y = scanner.nextInt();
        wynik1 = x << y;
        System.out.println("Wynik przesunięcia w lewo = " + wynik1);

        System.out.println("\nPodaj liczbe a:");
        a = scanner.nextInt();
        System.out.println("Podaj o ile bitów chcesz przesunąć w prawo podaną liczbe b:");
        b = scanner.nextInt();
        wynik2 = a >> b;
        System.out.println("Wynik przesunięcia w prawo = " + wynik2);

        System.out.println("\nPodaj liczbe c:");
        c = scanner.nextInt();
        System.out.println("Podaj o ile bitów chcesz przesunąć w prawo wliczając bit znaku podaną liczbe d:");
        d = scanner.nextInt();
        wynik3 = c >>> d;
        System.out.println("Wynik przesunięcia w prawo = " + wynik3);

    }

}
