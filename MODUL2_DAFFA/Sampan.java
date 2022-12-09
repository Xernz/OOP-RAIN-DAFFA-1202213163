public class Sampan extends TransportasiAir{
    protected int layar;
    Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan " + jumlahKursi + " ditetapkan dengan biaya sebesar " + biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air Sampan sedang berlayar menggunakan "+layar+" layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air Sampan berlabuh tanpa jangkar di pantai");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh dengan " + jangkar + " jangkar di pantai");
    }

}
