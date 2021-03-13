class Mobil{
	int speed = 0;
	int gear = 0;
	boolean on;
	boolean b;
	
	// method
	void kondiimesin (boolean on) {
		if (b = on){
			System.out.println("Mesin Dinyalakan");
	}
		else {
			System.out.println("MesinMati");
	}
	}
	void gantigigi(int newValue) {
	   gear = gear + newValue;
	   System.out.println(" \n Gigi:" + gear);
	}
	void Kecepatan(int increment) {
	   speed = speed + increment;
	   System.out.println(" \n Kecepatan:" + speed);
	}
}