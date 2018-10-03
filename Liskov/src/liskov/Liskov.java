/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov;
public class Liskov{

    public static void main(String[] args) {
     
    Elipszis ellipse = new Elipszis(); // Létrehozunk egy Elipszis objektumot
    Kor circle = new Kor(); // Illetve egy kört 
      
        
    circle.tengely(); //Ezzel a paranccsal a tengelyeket 
                    //10 egysegre illetve 20-ra modositjuk
                    // amiből következik hogy ez az alakzat nem lehet kör, mégis elfogadja a program
                    // Sértve ezzel a Liskov elvet

     
    }
    
}
