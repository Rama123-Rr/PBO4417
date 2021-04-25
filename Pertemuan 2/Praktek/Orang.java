public class Orang {
    String nama = "TanpaNama";
    boolean punyaTV = false;

    public Orang(){
    }

    public Orang(String newname) {
        nama = newname;
    }

    public void namaku() {
        System.out.println(nama);
    }

    void buyTV() {
        punyaTV = true;
    }

    void sellTV() {
        punyaTV = false;
    }

    public void checkTV() {
        System.out.println(punyaTV);
    }

    public static void main(String[] args) {
        Orang man1 = new Orang("Erik");
        man1.namaku();
        RemoteTv tvku = new RemoteTv();
        man1.buyTV();
        man1.checkTV();
        man1.sellTV();
        man1.checkTV();
    }
}