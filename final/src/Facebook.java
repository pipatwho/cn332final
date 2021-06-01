/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class Facebook {
    private String name;
    private String password;
    
    public Facebook(){
        this.name = "Pipat Thaiyamart";
        this.password = "12345678";
    }
    
    public Facebook(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String[] getData(){
        return new String[] {name,password};
    }
    
    String getName(){
        return name;
    }
}
