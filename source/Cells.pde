
/*

   Have fun with this little program.
   I wrote this in an hour or a half so it is not that great;) 
   Have fun:]


*/





// the arraylist that holds the Cells
ArrayList<Cell> c = new ArrayList<Cell>();



void setup() {
    size(600,400);
    background(51);
    

}


void draw() {
      // Comment out the background line in the draw functions for a cool effect.
      background(51);
      
      
      c.add(new Cell());
  
   

    for (Cell p : c) {
    
      p.NewC();
      p.update();
    
    
    }



}
