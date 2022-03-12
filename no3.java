
import java.util.LinkedList;
public class no3 {
    public static void main(String[]args){
        LinkedList<String> no_bp = new LinkedList<String>();
        LinkedList<String> nama_mahasiswa = new LinkedList<String>();
        LinkedList<String> alamat = new LinkedList<String>();
       

        //Fungsi Add dan Size()
        no_bp.add("211522001");
        nama_mahasiswa.add("NIKI YULIA NADA");
        alamat.add("KAB.50 KOTA");
        System.out.println("Nim :   " + no_bp+", Ukuran : "+no_bp.size());
        System.out.println("Nama mahasiswa :   " + nama_mahasiswa+", Ukuran : "+nama_mahasiswa.size());
        System.out.println("Alamat :   " + alamat+", Ukuran : "+alamat.size());

        //Fungsi Add First dan Size()
        no_bp.addFirst("213001");
        nama_mahasiswa.addFirst("HASNATUL AINI");
        alamat.addFirst("PADANG");
        System.out.println("Nim :   " + no_bp+", Ukuran : "+no_bp.size());
        System.out.println("Nama mahasiswa :   " + nama_mahasiswa+", Ukuran : "+nama_mahasiswa.size());
        System.out.println("Alamat :   " + alamat+", Ukuran : "+alamat.size());

        //Fungsi Add Last dan Size()
        no_bp.addLast("2111122007");
        nama_mahasiswa.addLast("AISYAH");
        alamat.addLast("GUGUAK");
        System.out.println("Nim  :   " + no_bp+", Ukuran : "+no_bp.size());
        System.out.println("Nama mahasiswa :   " + nama_mahasiswa+", Ukuran : "+nama_mahasiswa.size());
        System.out.println("Alamat :   " + alamat+", Ukuran : "+alamat.size());

        //set
        no_bp.set(0, "213002");
        nama_mahasiswa.set(0, "INTAN ANNISA");
        alamat.set(0,"BATAM");
        System.out.println("Nim : "+no_bp);
        System.out.println("Nama mahasiswa: "+nama_mahasiswa);
        System.out.println("Alamat: "+alamat);

        //Is Empty
          System.out.println("Nim : "+no_bp.isEmpty());
          System.out.println("Nama mahasiswa: "+nama_mahasiswa.isEmpty());
          System.out.println("Alamat: "+alamat.isEmpty());
        
        //get
        System.out.println(no_bp.get(0));
        System.out.println(nama_mahasiswa.get(2));
        System.out.println(alamat.get(1));

        //Indeks Of
        System.out.println(no_bp.indexOf("192001"));
        System.out.println(nama_mahasiswa.indexOf("RANIA SHIMBI"));
        System.out.println(alamat.indexOf("JAKARTA"));

        //Remove
        no_bp.remove(1);
        nama_mahasiswa.remove(2);
        alamat.remove(2);

        //Fungsi POP
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();
        System.out.println("Nim "+no_bp);
        System.out.println("Nama mahasiswa:"+nama_mahasiswa);
        System.out.println("Alamat :"+alamat);
 
        //push()
        no_bp.push("2111522002");
        nama_mahasiswa.push("RAFIQATUL ULYA");
        alamat.push("BUKITTINGI");

        System.out.println("Nim : "+no_bp);
        System.out.println("Nama mahasiswa\t: "+nama_mahasiswa);
        System.out.println("Alamat: "+alamat);
        



    }
}