class panggilMobil {
     public static void main(String[] args) {
          	// Membuat object
        Mobil bike = new Mobil();
	      
		//memanggil atribut  dan memberi nilai
	    bike.kondiimesin(true);
        bike.speed=10;
		bike.gear=2;
	   	// Memanggil method dan menunjuk nilai parameter
      	bike.Kecepatan(10);
      	bike.gantigigi(2);

        bike.kondiimesin(false);
	}
}
