public class KendaraanMotor extends PKendaraan {
    int Mesin = 1;
    String PlatNomor = "H 1 IDN";

    KendaraanMotor() {

    }

    public KendaraanMotor(int UkMesin, String LiPlate) {
        this.Mesin = UkMesin;
        this.PlatNomor = LiPlate;

    }

    public void Tes() {
        System.out.println(Mesin);
        System.out.println(PlatNomor);

    }

    public int getMesin() {
        return Mesin;
    }

    public String getPlatNomor() {
        return PlatNomor;
    }

}