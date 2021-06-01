
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
public class NormalLogin extends Account{
    private String username;
    private String password;

    
    public NormalLogin(){
        login();
    }
    
    @Override
    public void login() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Username : ");
        username = sc.nextLine();
        super.name = username;
        System.out.println("");
        System.out.print("Password : ");
        password = sc.nextLine();        
    }
    
}
