/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4Q1;

/**
 *
 * @author fa16-bse-081
 */
public class shapeFactory {
    
    public shape getshape(String s){
        if(s==null){
            System.out.println("No shape");
        }
        if(s.equalsIgnoreCase("circle")){
            new circle().draw();
        }
        if(s.equalsIgnoreCase("square")){
            new square().draw();
        }
        if(s.equalsIgnoreCase("rectangle")){
            new rectangle().draw();             
        }
        return null;
    }
}
