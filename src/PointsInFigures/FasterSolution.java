package PointsInFigures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carmen
 */
public class FasterSolution {

    public static void main(String[] args) {
        List<String[]> figures;
        figures = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        int j =0;
        double x, y, x1,x2,y1,y2,r;
        boolean contained = false;
        while (!line.equals("*")) {
            figures.add(line.split(" "));
            line = scn.nextLine();
        }
        while (scn.hasNext()) {
            x = scn.nextDouble();
            y = scn.nextDouble();
            if(x==9999.9&&y==9999.9) {
                break;
            }
            j++;
            for(int i = 0; i < figures.size(); i++) {
                String[] get = figures.get(i);
                if(get[0].equals("r")) {
                    x1=Double.parseDouble(get[1]);
                    y1=Double.parseDouble(get[2]);
                    x2=Double.parseDouble(get[3]);
                    y2=Double.parseDouble(get[4]);
                    if(x>x1&&x<x2&&y<y1&&y>y2) {
                       System.out.println("Point "+j+" is contained in figure "+(i+1));
                       contained=true;
                    }
                }
                if(get[0].equals("c")) {
                   x1=Double.parseDouble(get[1]);
                   y1=Double.parseDouble(get[2]);
                   r=Double.parseDouble(get[3]); 
                   if((x1-x)*(x1-x)+(y1-y)*(y1-y)<r*r) {
                       System.out.println("Point "+j+" is contained in figure "+(i+1));
                       contained=true;
                    }
                }
            }
            if(!contained) {
               System.out.println("Point "+j+" is not contained in any figure"); 
            }
            contained = false;
        }
    }
}
