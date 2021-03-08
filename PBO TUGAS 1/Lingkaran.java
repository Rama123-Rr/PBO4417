public class Lingkaran {
 double Jari; 
 
  /** Construct a circle with radius 1 */
  Lingkaran() {
    Jari = 1;
  }
  
  /** Construct a circle with a specified Jari */
  Lingkaran(double newJari) {
    Jari = newJari;
  }
  
  /** Return the area of this circle */
  double getArea() {
    return Jari * Jari * Math.PI;
  }
  
  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * Jari * Math.PI;
  }
  
  /** Set a new Jari for this circle */
  void setJari(double newJari) {
    Jari = newJari;
  }
}