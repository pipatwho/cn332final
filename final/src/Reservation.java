
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Reservation {
    private Room room;
    private String timein;
    private String timeout;
    private Account account;
    private int days;
    private double promotionPercents;
    
    public Reservation(Account account,Room room,int days,double discount){
        this.room = room;
        this.account = account;
        this.days = days;
        this.promotionPercents = 1-discount;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	Calendar cal = Calendar.getInstance();
	timein = sdf.format(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, this.days);  
	timeout = sdf.format(cal.getTime());  
        
        
    }
    
    public void billing(){
        double cost = room.billCalculate();
        Payments payment;
        System.out.print("cost : ");
        System.out.println(String.format("%.2f",cost*days*promotionPercents)+" baht.");
        System.out.println("What would you like to pay with");
        System.out.println("1.) cash");
        System.out.println("2.) credit cards");
        System.out.println("3.) online banking");
        System.out.println("4.) promt pay\n: ");
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(true){
            if(i == 1){
                payment = new Cash();
                break;
            }

            else if (i == 2){
                payment = new Craditcard();
                break;
            }

            else if (i == 3){
                payment = new Onlinebanking();
                break;
            }

            else if (i == 4){
                payment = new Promtpay();
                break;
            }

            else{
                System.out.println("Wrong choice, try again.");
            }
                        
        }
        payment.withdraw(cost*days*promotionPercents);
    }
    
}
