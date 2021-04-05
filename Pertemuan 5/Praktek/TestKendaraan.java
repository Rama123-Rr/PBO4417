

public class TestKendaraan {
    public static void main(String[] args) {
        PKendaraan kendaraan = new PKendaraan();
        Sepeda sepeda = new Sepeda();
        KendaraanMotor motor = new KendaraanMotor(3, "H 171 NO");
    

        sepeda.JalanLurus();
        sepeda.BunyiBell();
        motor.Tes();
        kendaraan.JalanKanan();
        motor.getMesin();
    }
}
