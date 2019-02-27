package week2inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author douglas.whalen554
 */
public class PasswordCheckerTest {
    
    
    public static void main(String [] args){
        // create a Scanner object using the imported class library
        String pwd;
	// Request user enter password
        Scanner sc = new Scanner(System.in);
	System.out.print("Please enter your password and hit ENTER: ");
            pwd = sc.nextLine();
	PasswordChecker test1 = new PasswordChecker();
        test1.setRequiredLength(8, 50);
        String[] reqChars = {"%", "&", "@"};
        test1.setReqChars(reqChars);
        test1.checkPassword(pwd);
        
        /*int ampersandJa = password.indexOf("&");
            		System.out.println("Character & is present in this password " + ampersandJa);
            		int dollahDollahBeelOuiOui = password.indexOf("$");
            		System.out.println("Character $ is present in this password " + dollahDollahBeelOuiOui);
            		// Checks to see if password contains characters
            		if (ampersandJa > 0) {
                		valid = true;
            		} else if (dollahDollahBeelOuiOui > 0) {
                		valid = true;
            		}
            		return valid; */

    
    } // close main method
    
// tool should never be responsible for getting its own data- put Scanner in the test page
    
    
} // close class
