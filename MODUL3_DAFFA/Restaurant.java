public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1; 

    public void run() {
        while(true){
            makeFood();
            try{
                Thread.sleep(2500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }
    public static int getFoodNumber(){
        return foodNumber;
    }
   
    public void makeFood() {
        synchronized(Restaurant.lock){
            if(this.waitingForPickup){
                try{
                    System.out.println("Chef : Memanggil pelayan");
                    Restaurant.lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Chef : Memproses pesanan no : " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Chef : Memanggil pelayan\n");
        }
    }
    public static Object getLock(){
        return lock;
    }
    
}