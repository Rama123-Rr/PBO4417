

public class TestKendaraan {
    public static void main(String[] args) {
        PKendaraan kendaraan = new PKendaraan();
        Sepeda sepeda = new Sepeda();
        KendaraanMotor motor = new KendaraanMotor(3, "H 171 NO");
        MobilQ Mobil = new MobilQ();
        MotorCy Motor2 = new MotorCy();
    

        sepeda.JalanLurus();
        sepeda.BunyiBell();
        motor.Tes();
        kendaraan.JalanKanan();
        motor.getMesin();
        System.out.println("========Motor==========");
        Motor2.Cek();
        System.out.println("=======Mobil======");
        Mobil.Tesseat();

    }
}
