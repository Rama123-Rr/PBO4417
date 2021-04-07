public class MobilQ extends KendaraanMotor{
    boolean seatbelt;
    int setbelt;

    MobilQ(){

    }
    public void AturSeatBelt(int setbelt){
        this.setbelt = setbelt;
    }
    public boolean DapatSeatBelt(){
        return seatbelt;
    }
    public void Tesseat() {
        System.out.println(seatbelt);

    }
}