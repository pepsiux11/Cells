import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Cells extends PApplet {


/*

   Have fun with this little program.
   I wrote this in an hour or a half so it is not that great;) 
   Have fun:]


*/





// the arraylist that holds the Cells
ArrayList<Cell> c = new ArrayList<Cell>();



public void setup() {
    
    background(51);
    

}


public void draw() {
      // Comment out the background line in the draw functions for a cool effect.
      background(51);
      
      
      c.add(new Cell());
  
   

    for (Cell p : c) {
    
      p.NewC();
      p.update();
    
    
    }



}
class Cell {

     
     int age;
  
    //position of the Cell
    float x = random(300);
    float y = random(200);  
    
    //Speed of the Cell
    float xspeed = 1;
    float yspeed = 1;
    
    // Paremeters for the Cell
    float h = 1;
    float w = 1;
    
  
  
    // draws a new Cell to the sreen
    public void NewC() {
    
        this.age = 1;
        
        noStroke();
        fill(255,0,0);
        rect(x,y,h,w);
        
    }

    // Runs every frame(in the draw function) and completes all the other code 
    public void update() {
    
      x += xspeed;
      y += yspeed;
      
      this.age += 1;
      
      Bounce();
      
      isDead();
     
    
    
    }

    // looks if a Cell has past surten age and if true then removes it
    public void isDead() {
        
      if (this.age >= 80) {
      
         c.remove(0);
      
      }
        
    
    
    } 
    
    

    //Makes the Cell bounce of the borders
    public void Bounce() {
    
       if (x > width || x < 0) {
       
           xspeed *= -1;
       
       
       }
    
       if (y > height || y < 0) {
       
           yspeed *= -1;
       
       
       }
    
    
    
    
    }





}
  public void settings() {  size(600,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Cells" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
