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
    void NewC() {
    
        this.age = 1;
        
        noStroke();
        fill(255,0,0);
        rect(x,y,h,w);
        
    }

    // Runs every frame(in the draw function) and completes all the other code 
    void update() {
    
      x += xspeed;
      y += yspeed;
      
      this.age += 1;
      
      Bounce();
      
      isDead();
     
    
    
    }

    // looks if a Cell has past surten age and if true then removes it
    void isDead() {
        
      if (this.age >= 80) {
      
         c.remove(0);
      
      }
        
    
    
    } 
    
    

    //Makes the Cell bounce of the borders
    void Bounce() {
    
       if (x > width || x < 0) {
       
           xspeed *= -1;
       
       
       }
    
       if (y > height || y < 0) {
       
           yspeed *= -1;
       
       
       }
    
    
    
    
    }





}
