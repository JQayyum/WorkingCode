
package lab4Q1;


import java.util.Scanner;
public class  factoryPatternDemo{

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s;
        
        System.out.println("Enter the shape you want to draw");
        s=input.nextLine();
        new shapeFactory().getshape(s);
        
    }
    
}
