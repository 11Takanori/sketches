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

public class sketch_190505a extends PApplet {
  public void setup() {
int numA = 12;
int numB = 17;
float ratio = (float) numB / numA;
float xPos = 0;
float yPos = 0;
int itr = 0;


colorMode(HSB, 1);
float wd = width;

while (wd > 0.1f) {
  itr++;
  if (itr % 2 == 1) {
    while (xPos + wd * ratio < width + 0.1f) {
      fill(color(random(1), 1, 1));
      rect(xPos, yPos, width * ratio, wd);
      xPos += wd * ratio;
    }
    wd = width - xPos;
  } else {
    while (yPos + wd / ratio < width + 0.1f) {
      fill(color(random(1), 1, 1));
      rect(xPos, yPos, wd, wd / ratio);
      yPos += wd / ratio;
    }
    wd = width - yPos;
  }
}    
    noLoop();
  }

  public void settings() { 
size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_190505a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
