/*

 */
package PointsInFigures;

import java.util.Scanner;

/**
 *
 * @author Carmen
 */
public class Main {
    class Rectangle {
            double x1, y1, x2, y2;
            Rectangle(double x1, double y1, double x2, double y2) {
                this.x1=x1;
                this.y1=y1;
                this.x2=x2;
                this.y2=y2;
            }
            boolean contains(double x, double y) {
                return (x>x1&&x<x2&&y<y1&&y>y2);
            }
        }
        class Circle {
            double xc, yc, r;
            Circle(double x, double y, double r) {
                xc=x;
                yc=y;
                this.r=r;
            }
            boolean contains(double x, double y) {
                return ((xc-x)*(xc-x)+(yc-y)*(yc-y)==r*r);
            }
        }
    public static Rectangle rectangles[];
    public static Circle circles[];
    
    public static void main(String[] args) {
        rectangles = new Rectangle[10];
        circles = new Circle[10];
        Scanner scn = new Scanner(System.in);
        String line = "";
        line = scn.nextLine();
        while(!line.equals("*")) {
            
            line = scn.nextLine();
        }
    }
}
