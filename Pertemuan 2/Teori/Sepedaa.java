import java.io.*;
public class Sepedaa{
    int ban;
    int rangka;
    int gear;
    int rantai;
    int rem;
    boolean on;
    boolean b;

    Sepedaa() {
    }

	void kondiimesinn (boolean on) {
		if (b = on){
			System.out.println("Sepeda Dijalankan");
	}
		else {
			System.out.println("Sepeda Berhenti");
	}
	}
    void setban(int newban){
        ban = newban;
    }
    void setrangka(int newrangkaa){
        rangka = newrangkaa;
    }
    void setrem(int newremm){
        rem = newremm;
    }
    void setrantaii(int newrantai){
        rantai = newrantai;
    }
    void setVolume(int newrangka){
        rangka = newrangka;
    }
    void NaikanGearr(){
        ++gear;
    }
    void KecilkanGearr(){
        --gear;
    }


    public static void main(String[] args) {
        Sepedaa speda = new Sepedaa();
        System.out.println(" ==== Atribut ====");
        speda.setban(2);
        System.out.println(" Ban Sekarang " + speda.ban );
        speda.setrem(2);
        System.out.println(" Rem Sekarang " + speda.rem );
        speda.setrangka(1);
        System.out.println(" Rangka Sekarang " + speda.rangka );
        speda.setrantaii(1);
        System.out.println(" Rantai Sekarang " + speda.rantai );

        Sepedaa speda1 = new Sepedaa();
        System.out.println(" ==== Behavior ====");
        System.out.println("******* Menjalankan Sepeda *******");
        speda1.kondiimesinn(true);
        System.out.println("******* Menaikan Gear *******");
        speda1.NaikanGearr();
        speda1.NaikanGearr();
        speda1.NaikanGearr();
        System.out.println(" Gear Sekarang " + speda1.gear );
        System.out.println("******* Menurunkan Gear *******");
        speda1.KecilkanGearr();
        speda1.KecilkanGearr();
        System.out.println(" Gear Sekarang " + speda1.gear );
        System.out.println("******* Berhentikan Sepeda *******");
        speda1.kondiimesinn(false);


    }
}