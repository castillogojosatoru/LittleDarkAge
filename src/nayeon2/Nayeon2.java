/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nayeon2;

import Calculator.calculator;
import Distance.distance;
import java.util.Scanner;


public class Nayeon2 {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int caldi = 0;
        while (caldi == 0) {
            System.out.print("Which of the two would you choose?\nType 1 if you choose Calculator\nType 2 if you choose Distance.\nType 3 to Cancel.\nAnswer: ");
            int hello = scn.nextInt();
            
            if (hello == 1) {
                System.out.print("Enter first number: ");
                int num1 = scn.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scn.nextInt();
                calculator calcu = new calculator(num1, num2);
                System.out.print("Would you like to continue?\nType 1 for Yes.\nType 2 for No.\nAnswer: ");
                int tubag = scn.nextInt();
                if (tubag == 1) {
                    hello = 1;
                }
                else if (tubag > 2) {
                    caldi = -10;
                }
                else if(tubag == 2) {
                    System.out.println("Have a great day!");
                    break;
                }
            }
//            else if (caldi > 3) {
//            System.out.println("TRY AGAIN.\n");
//            caldi = 0;
//            }
            else if (hello == 2) {
                System.out.print("Enter X1: ");
                double x1 = scn.nextDouble();
                System.out.print("Enter X2: ");
                double x2 = scn.nextDouble();
                System.out.print("Enter Y1: ");
                double y1 = scn.nextDouble();
                System.out.print("Enter Y2: ");
                double y2 = scn.nextDouble();
                System.out.print("Enter RADIUS: ");
                double rad = scn.nextDouble();
                distance distanya = new distance(x1, x2, y1, y2, rad);
                System.out.print("Would you like to continue?\nType 1 for Yes.\nType 2 for No.\nAnswer: ");
                int tubag = scn.nextInt();
                if (tubag == 1) {
                    continue;
                }
                else if(tubag == 2) {
                    System.out.println("Have a great day!");
                    break;
                }
                else if (tubag > 2) {
                    caldi = -11;
                }
            }
            else if (caldi == 3) {
                break;
            }
            else if (caldi > 3) {
                System.out.println("TRY AGAIN.");
                caldi = 0;
            }
        
        while (caldi == -10) {
            System.out.print("Try again.\nType 1 to Continue. Type 2 to Exit.\nAnswer: ");
            int tubag = scn.nextInt();
            if (tubag > 3) {
                System.out.print("Again.\n");
                caldi = -10;
            }  
            else if (tubag == 1) {
                caldi = 0;
            }
            else if (tubag == 2) {
                System.out.println("Good.");
                break;
            }
            else if (tubag > 2) {
                System.out.println("Waste of time...");
            }
        }
        while (caldi == -11) {
            System.out.print("Try again.\nType 1 to Continue. Type 2 to Exit.\nAnswer: ");
            int tubag = scn.nextInt();
            if (tubag > 3) {
                System.out.println("Again.\n");
                caldi = -11;
            }
            else if (tubag == 1) {
                caldi = 0;
            }
            else if (tubag == 2) {
                System.out.println("That's right...");
                break;
            }
            else if (tubag > 2) {
                System.out.println("You're wasting your time.");
            }
        }
            
        }
//    while (caldi == 1) {
//        System.out.print("Enter first number: ");
//        int num1 = scn.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = scn.nextInt();
//        calculator calcu = new calculator(num1, num2);
//        
//        System.out.print("Would you like to continue?\nType 1 for Yes.\nType 2 for No.\nType 3 for Exit.\nAnswer: ");
//        caldi = scn.nextInt();
//        if (caldi == 1) {
//            continue;
//        }
//        else if (caldi == 2) {
//            caldi = 2;
//        }
//        else if (caldi == 3) {
//            break;
//        }
//        if (caldi > 3) {
//            System.out.print("WRONG INPUT! Try again.\n");
//            caldi = 0;
//        }
//       
//    }
        //Calcualtor ni siya
//        System.out.print("Enter first number: ");
//        int num1 = scn.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = scn.nextInt();
//        calculator calcu = new calculator(num1, num2);
//     while (caldi == 2) {
//        System.out.print("Enter X1: ");
//        double x1 = scn.nextDouble();
//        System.out.print("Enter X2: ");
//        double x2 = scn.nextDouble();
//        System.out.print("Enter Y1: ");
//        double y1 = scn.nextDouble();
//        System.out.print("Enter Y2: ");
//        double y2 = scn.nextDouble();
//        System.out.print("Enter RADIUS: ");
//        double rad = scn.nextDouble();
//        distance distanya = new distance(x1, x2, y1, y2, rad);
//        break;
//     }   
//     while (caldi == 3) {
//         break;
//     }
//     while (caldi > 3) {
//         caldi = 0;
//     }
//        System.out.print("Enter X1: ");
//        double x1 = scn.nextDouble();
//        System.out.print("Enter X2: ");
//        double x2 = scn.nextDouble();
//        System.out.print("Enter Y1: ");
//        double y1 = scn.nextDouble();
//        System.out.print("Enter Y2: ");
//        double y2 = scn.nextDouble();
//        System.out.print("Enter RADIUS: ");
//        double rad = scn.nextDouble();
//        distance distanya = new distance(x1, x2, y1, y2, rad);
    }
    
}
