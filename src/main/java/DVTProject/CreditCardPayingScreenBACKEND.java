/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DVTProject;

/**
 *
 * @author dhiyas
 */
public class CreditCardPayingScreenBACKEND {

    //CVV verification
    public static String checkCVV(String CVVNum) {
        String message = "";
        boolean isValidLength = false;
        boolean onlyNumbers = false;
        String numbers = "123456789";
        System.out.println("the length is "+ CVVNum.length());
        //checks the length
        if (CVVNum.length() == 3) {
            //check only ints 
            for (int i = 0; i < CVVNum.length(); i++) {
                char currentChar = CVVNum.charAt(i);
                String currentCharStr = String.valueOf(currentChar);
                if (!numbers.contains(currentCharStr)) {
                    message = "No numbers or special characters may be used.";
                    break;
                } else {
                    onlyNumbers = true;
                }
            }
        } else {
            message = "CVVs may only have 3 digits.";
            
        }

        if (isValidLength && onlyNumbers) {
            message = "valid";
        }
        return message;
    }

    public static String checkCardHolderName(String input, int minLength) {
        String message = "";
        String letters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM ";
//checks the LENGTH and that no other characters are entered
        if (input.length() > minLength) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                String currentCharStr = String.valueOf(currentChar);
                if (!letters.contains(currentCharStr)) {
                    message = "No numbers or special characters may be used.";
                    break;
                } else {
                    message = "valid";
                }

            }
        } else {
            message = "This is a required field. It cannot be left empty.";
        }

        return message;
    }

}
