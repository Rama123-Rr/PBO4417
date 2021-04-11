public class MobilQ extends KendaraanMotor{
    boolean seatbelt = false;


    MobilQ(){

    }
    public void AturSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }
        else{
            this.seatbelt = false;
        }
        
    }
    public boolean DapatSeatBelt(){
        return seatbelt;
    }

}