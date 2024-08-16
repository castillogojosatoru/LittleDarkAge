/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author Rhodz
 */
public class calculator {
    int num1;
    int num2;
    
    public calculator(int num1, int num2) {
    
        this.num1 = num1;
        this.num2 = num2;
        
        addition();
        subtraction();
        multiplication();
        division();
        modulus();
    }
    public void addition() {
        int addition = num1 + num2;
        System.out.println("Addition: "+addition);
    }
    public void subtraction() {
        int subtraction = num1 - num2;
        System.out.println("Subtraction: "+subtraction);
    }
    public void multiplication() {
        int multiplication = num1 * num2;
        System.out.println("Multiplication: "+multiplication);
    }
    public void division() {
        double division = num1 / num2;
        System.out.println("Division: "+division);
    }
    public void modulus() {
        double modulus = num1 % num2;
        System.out.println("Remainder: "+modulus);
    }
}

