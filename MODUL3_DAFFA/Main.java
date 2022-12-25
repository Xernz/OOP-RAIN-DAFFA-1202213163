import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant();
            int customerID, orderQty;
            try{
                System.out.print("Masukkan nomor meja: ");
                customerID = input.nextInt();
                System.out.print("Jumlah pesanan: ");
                orderQty = input.nextInt();
                Thread t1 = new Thread(restaurant);
                Waiters waiters = new Waiters(customerID, orderQty);
                Thread t2 = new Thread(waiters);
                t1.start();
                t2.start();
                t1.join();
                t2.join();

            }catch(Exception e){
                System.out.println("Harus menginputkan angka");
            }
        }
    }
}