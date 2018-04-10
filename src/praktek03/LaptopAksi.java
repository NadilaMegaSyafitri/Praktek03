package praktek03;
public class LaptopAksi {
    public static void main(String[] args) {
        Laptop s= new Laptop();
        
        s.setNama("Laptop");
        s.setMerk("Asus");
        s.setWarna("Putih");
        s.setHarga(5000000);
        
        s.cetakInfo();
        
        System.out.print("Namanya \t : ");
        System.out.println(s.getNama());
        System.out.print("Merknya \t : ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t : ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t : ");
        System.out.println(s.getHarga());
        
    }
 
}
