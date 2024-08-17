/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicelungs;

/**
 *
 * @author Rhodz
 */
public class Dog {
    String name;
    String breed;
    
    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    public void iro() {
        System.out.println("The name and breed of the dog is "+name+" "+breed+".");
    }
}
