/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Room {
    private int bed;
    private int isWifi;
    private int guest;
    private int isBreakfast;

    public Room(int bed, int isWifi, int guest, int isBreakfast) {
        this.bed = bed;
        this.isWifi = isWifi;
        this.guest = guest;
        this.isBreakfast = isBreakfast;
    }
    public double billCalculate(){
        double bill = 0;
        if(this.bed == 1){
            bill+=300;
        }
        else if(this.bed == 2){
            bill += 500;
        }
        else if(this.bed == 3){
            bill += 600;
        }
        bill+= (100*this.isWifi)+(this.guest*150)+(this.isBreakfast*this.guest*200);
        
        return bill;
    }
    
    
}
