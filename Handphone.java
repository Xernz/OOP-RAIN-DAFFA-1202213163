public class Handphone extends Perangkat{
    protected boolean fingerprint;

    Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void informasi(){
        if (fingerprint == true){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " Gb dan processor secepat " + processor + " Ghz. selain itu handphone ini memiliki fingerprint");
        } else if(fingerprint == false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " Gb dan processor secepat " + processor + " Ghz. selain itu handphone ini tidak memiliki fingerprint");
        }
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke no " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim sms ke no " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim sms ke no " + no_hp1 + " dan " + no_hp2 + "\n");
    }
}
