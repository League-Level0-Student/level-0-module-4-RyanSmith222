package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
	PImage face;
    
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	
    	face = loadImage("cat.jpg");
    	face.resize(800,600);
    
    }

    @Override
    public void draw() {
    	background(face);
   //if(mousePressed) {
   // 	System.out.println(mouseX + ", " + mouseY);		
  //  }
    noStroke();
    fill(255,255,255);	
    ellipse(219,280, 210,160);	
    ellipse(556,266, 210,160);	 
   
    int xRight = mouseX;
    int yRight= mouseY;
    int xLeft = mouseX;
    int yLeft = mouseY;
    
    
   if(xLeft < 114) {
	   xLeft = 114;
   }
   
   if(xLeft > 324) {
	   xLeft = 324;
   }
   
   if(xRight < 451) {
	   xRight = 451;
   }
   
   if(xRight > 661) {
	   xRight = 661;
   }
//   
   if(yLeft < 200) {
	   yLeft = 200;
   }
   
   if(yLeft > 330) {
	   yLeft = 330;
   }
   
   if(yRight < 216) {
	   yRight = 216;
   }
   
   if(yRight > 316) {
	   yRight = 316;
   }
    
    noStroke();
    fill(0,0,0);
  //  ellipse(219,280, 50,50);	
  //  ellipse(556,266, 50,50);	
    ellipse(xRight,yRight, 50,50);	
      ellipse(xLeft,yLeft, 50,50);
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
