/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Promotion{
    private String bed;
    private int isWifi;
    private int isBreakfast;
    private int guest;
    int days;
    
    private double discountPercents;

    public Promotion() {
        this.bed = "suite";
        this.isWifi = 1;
        this.isBreakfast = 1;
        this.guest = 2;
        this.discountPercents = 0.1;
        this.days = 2;
    }
    
    public Promotion(String bed, int isWifi, int isBreakfast, int guest, double discountPercents,int days) {
        this.bed = bed;
        this.isWifi = isWifi;
        this.isBreakfast = isBreakfast;
        this.guest = guest;
        this.discountPercents = discountPercents;
        this.days =  days;
    }
    
    public void showPromotion(){
        System.out.println("Bed type : "+bed);
        System.out.println("Wifi : "+checkyn(isWifi));
        System.out.println("Breakfast : "+checkyn(isBreakfast));
        System.out.println("Guest : "+guest+" person(s)\n");
        
        System.out.println("Full cost : "+billCalculate()+" baht");
        System.out.println("Discounted cost : "+billCalculate()*(1-discountPercents)+" baht !");
    }
    
    
    public String checkyn(int i){
        if(i==1){
            return "yes";
        }
        else{
            return "no";
        }
    }
    
    public double billCalculate(){
        double bill = 0;
        if(this.bed == "single"){
            bill+=300;
        }
        else if(this.bed == "suite"){
            bill += 500;
        }
        else if(this.bed == "king"){
            bill += 600;
        }
        bill+= (100*this.isWifi)+(this.guest*150)+(this.isBreakfast*this.guest*200);
        
        return bill*days;
    }

    public String getBed() {
        return bed;
    }

    public int getIsWifi() {
        return isWifi;
    }

    public int getIsBreakfast() {
        return isBreakfast;
    }

    public int getGuest() {
        return guest;
    }

    public int getDays() {
        return days;
    }

    public double getDiscountPercents() {
        return discountPercents;
    }
    
    
}
