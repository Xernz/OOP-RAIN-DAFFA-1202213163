public class Waiters implements Runnable{
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters (int customerID, int orderQty){
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    public void run(){
        while(true){
            getFood();
            try{
                Thread.sleep(7000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void orderInfo(){
        System.out.println("===========================================================");
        System.out.println("Nomor Meja : " + this.customerID);
        System.out.println("Jumlah pesanan : " + this.orderQty);
        System.out.println("Total tagihan : " + this.orderQty * foodPrice);
        System.out.println("===========================================================");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Pelayan : Mengantar makanan");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Pelayan : Ditunggu pesanan selanjutnya\n");
        }
    }
}