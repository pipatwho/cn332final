
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;
        Room room;
        Reservation reservation;
        
        while (true) {
            System.out.println("Please login : choose login type");
            System.out.println("1.) normal login");
            System.out.println("2.) email login");
            System.out.println("3.) facebook login");
            int loginType = sc.nextInt();
            if(loginType == 1){
                account = new NormalLogin();
                break;
            }
            else if(loginType == 2){
                account = new EmailLogin();
                break;
            }
            else if(loginType == 3){
                account = new FacebookLogin();
                break;
            }
            else{
                System.out.println("Wrong choice! try again.\n");
            }
            
        }
        
        
        
        System.out.println("\n\nHello! welcome to out sweet hotel.");
        
        Promotion promotion = new Promotion();
        
        System.out.println("First, I prefer to tell you a good promotion.\n");
        
        promotion.showPromotion();
        
        System.out.print("\nWould you prefer this good promotions? (1=yes/0=no) : ");
        
        int prom = sc.nextInt();
        
        if(prom==1){
            
            String bedString = promotion.getBed();
            int isWifi = promotion.getIsWifi();
            int guest = promotion.getGuest();
            int isBreakfast = promotion.getIsBreakfast();
            int bed = 0;
            int days = promotion.getDays();
            double discount = promotion.getDiscountPercents();
            
            if(bedString == "single"){
                bed = 1;
            }
            else if(bedString == "suite"){
                bed = 2;
            }
            else{
                bed = 3;
            }
            room = new Room(bed,isWifi,guest,isBreakfast);
            reservation = new Reservation(account,room,days,discount);
        }
        else{
            System.out.println("What kind of room dou you want?");
            System.out.println("1.) single bed");
            System.out.println("2.) suite bed");
            System.out.println("3.) king bed");
            int bed = sc.nextInt();
            System.out.print("\nHow many guest in this room? : ");
            int guest = sc.nextInt();

            System.out.print("\nWould you like wifi? (y/n) : ");
            String temp = sc.nextLine();
            int isWifi =  temp == "y" ? 1:0;

            System.out.print("\nWould you like wifi? (y/n) : ");
            String wifi = sc.nextLine();
            int isBreakfast =  temp == "y" ? 1:0;

            System.out.print("\n How many days do you want to stay? : ");
            int days = sc.nextInt();

            room = new Room(bed, isWifi, guest, isBreakfast);
            reservation = new Reservation(account,room,days,1);
        }
        reservation.billing();
    }
    
}
