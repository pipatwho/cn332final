/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Onlinebanking extends Payments{
    private double bankingMoney;
    
    public Onlinebanking(double cash){
        this.bankingMoney = cash;
    }
    
    public Onlinebanking(){
        this.bankingMoney = 1000000;
    }
    
    @Override
    public void withdraw(double cost) {
        bankingMoney -= cost;
        System.out.println("Paid done, Thank you.");
        
    }
}
