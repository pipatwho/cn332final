
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

//Just simulator not the real one

public class EmailLogin extends Account{
    private String email;
    private String password;
    
    public EmailLogin(){
        login();
    }
    
    public void login() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("email : ");
        email = sc.nextLine();
        super.name = email;
        System.out.println("");
        System.out.print("Password : ");
        password = sc.nextLine();        
    }
 
    
    
}
