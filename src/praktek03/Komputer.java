package praktek03;
public class Komputer extends Laptop{
    private String jenisKomputer;
    
    void throttle (){
        System.out.println("Kualitas OK...");
    }

    public String getJenisKomputer() {
        return jenisKomputer;
    }

    public void setJenisKomputer(String jenisKomputer) {
        this.jenisKomputer = jenisKomputer;
    }
    
    
}
