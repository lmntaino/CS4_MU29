/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enzot224
 */
public class MainMethod {

    public static void main(String[] args) {
        PersonClass sir = new PersonClass("Sir");
        PersonClass flip = new PersonClass("Flip");
        PersonClass enzo = new PersonClass("Enzo");
        Song s1 = new Song("Medisina", "Zild");
        Song s2 = new Song("Mundo", "IV of Spades");
        Singer blaster = new Singer("Blaster");
        Singer unique = new Singer("Unique");
        blaster.performForAudience(12);
        blaster.changeFavSong(s2);
    }
}