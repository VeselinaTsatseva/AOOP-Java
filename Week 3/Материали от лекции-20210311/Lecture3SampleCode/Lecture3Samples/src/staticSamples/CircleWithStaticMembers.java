/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticSamples;

/**
 *
 * @author echrk
 */
public class CircleWithStaticMembers {
    double radius;// The radius of the circle 
    static int numberOfObjects = 0; //The number of objects created
   // Construct a circle with radius 1
    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }
    //Construct a circle with a specified radius
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    //* Return numberOfObjects
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    // Return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }
}
