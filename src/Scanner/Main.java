/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class Main {
    
    public static void main(String[] args) {
        getset GETSET = new getset();
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scn.nextLine();
        GETSET.setName(name);
        System.out.print("Enter age: ");
        int age = scn.nextInt();
        GETSET.setAge(age);
        scn.nextLine();
        System.out.print("Enter birthdate (MM/dd/yyyy): ");
        String birthdate = scn.nextLine();
        GETSET.setBirthdate(birthdate);
        
        LocalDate birthday = GETSET.getBirthdate();
        if (birthdate != null) {
        System.out.println("Your data:\n"+GETSET.getName()+"\n"+GETSET.getAge()+"\n"+birthday);
        }
        scn.close();
    }
}
