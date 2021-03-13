class Kalkulatorr{
      int hasil;

      public void pertambah(int a, int b){
            hasil = a + b;
            System.out.println("Hasil Dari Pertambahan :" + a + "+" + b + "=" + hasil);
      }
      public void perkurang(int a, int b){
            hasil = a - b;
            System.out.println("Hasil Dari Pengurangan :" + a + "-" + b + "=" + hasil);
      }
      public void perkali(int a, int b){
            hasil = a * b;
            System.out.println("Hasil Dari Perkalian   :" + a + "*" + b + "=" + hasil);
      }
      public void perbagi(int a, int b){
            hasil = a / b;
            System.out.println("Hasil Dari Permbagian  :" + a + "/" + b + "=" + hasil);
      }
}

public class Kalkulator {
      public static void main(String[] args){
      Kalkulatorr mtk = new Kalkulatorr();
      mtk.pertambah(10, 2);
      mtk.perkurang(11, -1);
      mtk.perkali(5, 2);
      mtk.perbagi(10, 5);
      }
}