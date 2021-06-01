/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Cash extends Payments{
    private double cash;
    
    public Cash(double cash){
        this.cash = cash;
    }
    
    public Cash(){
        this.cash = 1000000;
    }
    
    @Override
    public void withdraw(double cost) {
        cash -= cost;
        System.out.println("Paid done, Thank you.");
        
    }
    
    
}
