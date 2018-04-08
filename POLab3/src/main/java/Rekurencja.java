/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//

/**
 *
 * @author Wojciech
 */
public class Rekurencja {
//3.3

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rekurencja:");
        rekurencja(10);

    }

    public static int rekurencja(int liczba) {
        if (liczba == 0) {
            return 0;
        } else {
            System.out.println("Liczba = " + liczba);
            rekurencja(--liczba);
            return 0;
        }

    }

}
