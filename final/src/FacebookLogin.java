

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipat
 */
public class FacebookLogin extends Account{
    private Facebook facebookAccount;
    private String name;
    
    public FacebookLogin(){
        this.facebookAccount = new Facebook();
        login();
    }
    
    public void login() {
        this.name = facebookAccount.getName();    
    }
}
