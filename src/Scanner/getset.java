/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

//import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 *
 * @author Rhodz
 */
public class getset {
    String name;
    int age;
    LocalDate birthdate;
    
//    public getset(String name, int age, Date birthdate) {
//        this.name = name;
//        this.age = age;
//        this.birthdate = birthdate;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public void setBirthdate(String birthdate) {
        DateTimeFormatter birthday = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        try {
            this.birthdate = LocalDate.parse(birthdate, birthday);
        } catch(DateTimeParseException e) {
            System.out.println("Invalide Date.");
        }
    }
}
