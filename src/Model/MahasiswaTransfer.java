package Model;

public class MahasiswaTransfer extends Mahasiswa {
    private double IPKSebelumnya;

    public double getIPKSebelumnya() {
        return IPKSebelumnya;
    }
    public void setIPKSebelumnya(){
        this.IPKSebelumnya = IPKSebelumnya;
    }

    @Override
    public void inputKRS() {
        super.inputKRS();
        System.out.println("ini hasil overload");
    }
}
