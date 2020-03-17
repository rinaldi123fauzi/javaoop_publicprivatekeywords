package com.tutorial;

class Player{
    String name; //default, dia bisa dibaca dan ditulis dari luar class
    public int exp; //public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; //private, hanya akan bisa dibaca dan ditulis didalam class saja
    //constructor
    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    //method default modifier access
    void display(){
        tambahExp(); //untuk mengakses private method diluar class
        System.out.println("\nName \t:" + this.name);
        System.out.println("Exp \t:" + this.exp);
        System.out.println("Health \t:" + this.health);//membaca, tapi didalam class
    }

    //public (bisa diakses dari dalam maupun dari luar class)
    public void ubahNama(String namaBaru){
        this.name = namaBaru;
    }

    //private (hanya bisa diakses dari dalam class)
    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Marni",0,100);

        //default
        System.out.println(player1.name);//membaca data
        player1.name = "Surti";//menulis data
        System.out.println(player1.name);

        //public
        System.out.println(player1.exp);//membaca data
        player1.exp = 100;//menulis data
        System.out.println(player1.exp);
        
        //private
        // System.out.println(player1.health);//membaca data
        // player1.health = 100;//menulis data
        // System.out.println(player1.health);

        //method
        
        //default
        player1.display();

        //public
        player1.ubahNama("Tejo");
        player1.display();

        //private
        // player1.tambahExp();
    }
}