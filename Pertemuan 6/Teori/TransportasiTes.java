import Transportasi.Sepeda;
import Transportasi.LaMobil;

public class TransportasiTes{
    public static void main(String[] args){
        Sepeda Jaw = new Sepeda();
        System.out.println("====== Sepeda BM ====== ");
        Jaw.JalanKanan();
        Jaw.JalanLurus();
        LaMobil Lal = new LaMobil();
        System.out.println("====== Menu Mobil ====== ");
        Lal.Menu();
    }
}