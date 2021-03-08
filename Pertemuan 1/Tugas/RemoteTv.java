import java.io.*;
public class RemoteTv {
    int channel;
    int volumeLevel;
    boolean on;

    RemoteTv() {
    }

    void Hidupkan(boolean on){
        on = true;
    }
    void Matikan(boolean on){
        on = false;
    }
    void setChannel(int newChannel){
        channel = newChannel;
    }
    void setVolume(int NewVolumeLevel){
        volumeLevel = NewVolumeLevel;
    }
    void NaikanChanel(){
        ++channel;
    }
    void KecilkanChanel(){
        --channel;
    }
    void BesarkanVolume(){
        ++volumeLevel;
    }
    void KecilkanVolume(){
        --volumeLevel;
    }

    public static void main(String[] args) {
        RemoteTv tv1 = new RemoteTv();
        tv1.Hidupkan(true);
        tv1.setChannel(30);
        tv1.setVolume(3);

        RemoteTv tv2 = new RemoteTv();
        tv2.Hidupkan(true);
        tv2.NaikanChanel();
        tv2.NaikanChanel();
        tv2.NaikanChanel();
        tv2.BesarkanVolume();
        tv2.BesarkanVolume();

        System.out.println("Tv1's Channel is "+ tv1.channel +" and Volume level is " + tv1.volumeLevel );
        System.out.println("Tv2's Channel is "+ tv2.channel +" and Volume level is " + tv2.volumeLevel );    


    }
}