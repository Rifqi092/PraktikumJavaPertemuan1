package praktikumjava;
import Model.Mahasiswa;
import Model.FastFood;
import Model.MahasiswaTransfer;

public class PraktikumJava {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010254");
        mahasiswa.setNama("Muhammad Rifqi Faisal");
        mahasiswa.setIPK(3.9);
        mahasiswa.viewData();

        Mahasiswa m1 = new Mahasiswa (
                2,
                "21110010255",
                "Muhammad RIfqi",
                4.0);
        m1.viewData();

        FastFood fastfood = new FastFood();
        fastfood.setId(1);
        fastfood.setNama("Burger");
        fastfood.setKalori(300);
        fastfood.setHarga(16000);
        fastfood.viewData();

        FastFood fastfood1 = new FastFood(
                2,
                "French Fries",
                500,
                10000);
        fastfood1.viewData();

        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110010256");
        mt.setNama("Muhammad Faisal");
        mt.setIPK(3.8);
        mt.viewData();
        mt.inputKRS();
    }
}
