public class TestKendaraan {
    static void KendaraanMelaju(PKendaraan vehicle) {
        vehicle.JalanLurus();
    }

    public static void main(String[] args) {
        Sepeda Coba = new Sepeda();
        KendaraanMotor MV1 = new KendaraanMotor();
        MotorCy COL = new MotorCy();
        MobilQ Cek = new MobilQ();

        Coba.BunyiBell();
        KendaraanMelaju(Coba);

        MV1.Tes();
        KendaraanMelaju(MV1);

        COL.AturGearFoot(2);
        COL.Cek();
        KendaraanMelaju(COL);

        Cek.AturSeatBelt(1);
        System.out.println("Sabuk Sekarang Bernilai : "+ Cek.DapatSeatBelt());
        KendaraanMelaju(Cek);
        
        
    }
    
}