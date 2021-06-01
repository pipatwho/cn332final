/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Craditcard extends Payments{
    private double cradit;
    
    public Craditcard(double cash){
        this.cradit = cash;
    }
    
    public Craditcard(){
        this.cradit = 1000000;
    }
    
    @Override
    public void withdraw(double cost) {
        cradit -= cost;
        System.out.println("Paid done, Thank you.");
        
    }
}
