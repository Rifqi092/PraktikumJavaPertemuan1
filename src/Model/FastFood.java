package Model;

public class FastFood {
    private int id;
    private String nama;
    private int kalori;
    private double harga;

    public FastFood() {
    }

    public FastFood(int id, String nama, int kalori, double harga) {
        this.id = id;
        this.nama = nama;
        this.kalori = kalori;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKalori() {
        return kalori;
    }

    public void setKalori(int kalori) {
        this.kalori = kalori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void viewData(){
        System.out.println("================ Struk ================");
        System.out.println("ID   \t:"+id);
        System.out.println("Nama  \t:"+nama);
        System.out.println("Kalori\t:"+kalori);
        System.out.println("Harga \t:"+harga);
        System.out.println("================ Struk ================");
        System.out.println("");
    }
}
