public class MainApp {
    public static void main(String[] args){
        TransportasiAir objSuper = new TransportasiAir(2,100000);
        objSuper.informasi();
        objSuper.berlabuh();
        objSuper.berlayar();

        Sampan objSub = new Sampan(5, 10000, 2);
        objSub.informasi();
        objSub.berlayar();
        objSub.berlabuh();
        objSub.berlabuh(2);

        Kapal objSub2 = new Kapal(50, 200000, "Diesel");
        objSub2.informasi();
        objSub2.berlayar();
        objSub2.berlayar(20);
        objSub2.berlabuh();
    }

}
