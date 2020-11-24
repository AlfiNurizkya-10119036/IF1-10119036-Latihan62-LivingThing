/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan62.livingthing;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program : Memasukkan Semua Data
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Alfi Nurizkya");
        System.out.print(human.getNama());
        human.walk();
        System.out.print(human.getNama());
        human.breath();
        System.out.print(human.getNama());
        human.eat();
    }
}
