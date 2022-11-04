import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    public String InsertMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("Masukkan pilihan menu: ");

    }
    public void ShowMenu(){
        System.out.println("1. Bakso (Makanan) Rp. 10000");
        System.out.println("2. Es Teh (Minuman) Rp. 5000");
        System.out.println("3. Brownies (Dessert) Rp. 15000");
    }
    public void SearchMenu(String search){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pilihan menu: ");
        if (search == "Bakso"){
            String cariBakso = "1. Bakso (Makanan) Rp. 10000";
            System.out.println(cariBakso);
        }
        else if (search == "Es Teh"){
            String cariTeh = "2. Es Teh (Minuman) Rp. 5000";
            System.out.println(cariTeh);
        }
        else if (search == "Brownies"){
            String cariBrownies = "3. Brownies (Dessert) Rp. 15000";
            System.out.println(cariBrownies);
        }
    // TODO Create Method to Insert Menu to Database

    // TODO Create Method to Show Menu from Database

    // TODO Create Method to Search Menu from Database


    }
}