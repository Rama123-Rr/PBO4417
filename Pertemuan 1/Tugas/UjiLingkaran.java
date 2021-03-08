import java.io.*;
public class UjiLingkaran{

    public static void main(String[]args){
        Lingkaran circle1 = new Lingkaran();
        System.out.println("Jari- jari Lingkaran ini adalah " + circle1.Jari + " dan Luas nya " + circle1.getArea());
    
        Lingkaran circle2 = new Lingkaran(25);
        System.out.println("Jari- jari Lingkaran ini adalah " + circle2.Jari + " dan Luas nya "+ circle2.getArea());

        Lingkaran circle3 = new Lingkaran(125);
        System.out.println("Jari- jari Lingkaran ini adalah " + circle3.Jari + " dan Luas nya " + circle3.getArea());

        circle2.Jari = 100;
        System.out.println("Jari- jari Lingkaran ini adalah " + circle2.Jari + " dan Luas nya " + circle2.getArea());
    }
}


