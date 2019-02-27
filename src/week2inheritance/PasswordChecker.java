package week2inheritance;


/**
 *
 * @author douglas.whalen554
 */
public class PasswordChecker {

    private String[] arr;
    private int min;
    private int max;

    public void setRequiredLength(int min, int max) {
        // code my guts
    }

    public void setReqChars(String[] reqChars) {
        arr = reqChars;
    }

    public boolean checkPassword(String pwd) {

        boolean valid = false;
        String[] reqChars;

        for (int c = 0; c < reqChars.length; c++) {
            if (pwd.indexOf(reqChars[c]) < 0) {
                
                
                
            } // close if statement
                

        } // close for loop

    } // close boolean checkPassword

} // close class PasswordChecker
