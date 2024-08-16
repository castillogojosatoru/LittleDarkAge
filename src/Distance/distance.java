/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Distance;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 *
 * @author Rhodz
 */
public class distance {
    double x1;
    double x2;
    double y1;
    double y2;
    double rad;
    
    public distance(double x1, double x2, double y1, double y2, double rad) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.rad = rad;
        
        answer();
    }
    public void answer() {
        double answer = rad*Math.acos(sin(x1)*sin(x2)+cos(x1)*cos(x2)*cos(y1-y2));
        System.out.println("The distance between two points on the earth's surface is: " + answer);
    }
}
