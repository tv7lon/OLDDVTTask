/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.*;

/**
 *
 * @author dhiyas
 */
public class JSONArrays {

    public static void main(String[] args) {
        boolean continueLoop = true;
        String nameInput;
        int ageInput;
        double weightInput;

        JSONArray parray = new JSONArray();
        while (continueLoop) {

            nameInput = JOptionPane.showInputDialog("Enter the person's name.");
            ageInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the person's age."));
            weightInput = Double.parseDouble(JOptionPane.showInputDialog("Enter the person's weight."));

            JSONObject person = new JSONObject();

            person.put("name", nameInput);
            person.put("age", ageInput);
            person.put("weight", weightInput);
            parray.put(person);
            //you have the person array now
            writeToFile(parray);
        }
    }

    public static void writeToFile(JSONArray parry) {
        File f = new File("\"C:\\Users\\dhiyas\\Documents\\NetBeansProjects\\School2024\\src\\main\\java\\JSON\\Data\\Hi.json\"");

        try {
          //  FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(f);
            pw.write(parry.toString());
            pw.close();

        } catch (IOException ex) {
            Logger.getLogger(JSONArrays.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
