public class MotorCy extends KendaraanMotor{
    int numGear = 0;

    MotorCy(){

    }
    public void AturGearFoot(int nmGear){
        this.numGear = nmGear;
    }
    public int DapatGearFoot(){
        return numGear;
    }
    public void Cek() {
        System.out.println(numGear);

    }
}