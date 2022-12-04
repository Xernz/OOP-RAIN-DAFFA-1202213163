public class MainApp {
    public static void main(String[] args){
        Perangkat objInduk = new Perangkat("Adata", 2, 3.69f);
        objInduk.informasi();

        Laptop objAnak1 = new Laptop("Samsung", 64, 3.69f, true);
        objAnak1.informasi();
        objAnak1.bukaGame("Final Fantasy VII");
        objAnak1.kirimEmail("Ayang@gmail.com");
        objAnak1.kirimEmail("ayang@gmail.com", "mantan@gmail.com");

        Handphone objAnak2 = new Handphone("Ipong", 64, 3.69f, true);
        objAnak2.informasi();
        objAnak2.telfon(621234569);
        objAnak2.telfon(621234569);
        objAnak2.kirimSMS(621234569, 621691245);

    }
}
