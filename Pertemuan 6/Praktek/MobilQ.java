public class MobilQ extends KendaraanMotor{
    
    private Boolean seatbelt = false;
    
    public MobilQ(){
    }

    public void AturSeatBelt(Boolean seatbelt) {
        this.seatbelt = seatbelt;
    }
    
    public Boolean DapatkanSeatBelt(){
        return seatbelt;
    }
}