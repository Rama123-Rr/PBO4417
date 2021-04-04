import java.util.Queue;
import java.util.*;

class Coba1{
    Queue<Integer> queue = new LinkedList<>();
    
    public void TambahNilai(Integer i){
    queue.add(i);
    }
    
    public void HapusNilai(Integer i){
    queue.remove(i);
    }
}

class Coba2 extends Coba1{
    
    public void iterasi(){
    Iterator iterator = queue.iterator();
  
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
    }
    
    public void CekDataAtas(){
    System.out.println("Nilai Paling Atas: " + queue.peek());
    }
    
    public void Run(){
    System.out.println(queue);
    }

}

public class Queuee{
    public static void main(String[] args) {

        Coba2 queue1 = new Coba2();
        System.out.println("List Kosongan");
        queue1.Run();
        System.out.println("Fungsi Tambah Nilai");
        queue1.TambahNilai(3);
        queue1.TambahNilai(4);
        queue1.TambahNilai(5);
        queue1.TambahNilai(6);
        queue1.TambahNilai(7);
        queue1.Run();
        System.out.println("Kurangi Nilai");
        queue1.HapusNilai(3);
        queue1.HapusNilai(4);
        queue1.Run();
        System.out.println("Antrian Nilai");
        queue1.iterasi();
        System.out.println("");
        queue1.CekDataAtas();
        
    }
    
}