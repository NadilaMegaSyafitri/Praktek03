package praktek03;
public class Laptop {
    private String nama;
    private String merk;
    private String warna;
    private double harga;
    
void cetakInfo(){
        System.out.println("Nama \t:"+nama+"\n"+"Merk \t :" +merk+"\n"+"Warna \t"
                + " :" +warna+"\n"+"harga \t :" +harga);
}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }


}
