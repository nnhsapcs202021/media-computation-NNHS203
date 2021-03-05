
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
/**
 * Write a description of class Collage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Collage
{
     public static void main(String[] args)

  {
    Picture canvas = new Picture(2000,1000);  
    Picture dog = new Picture("dog.jpg");
    Picture dog_green = new Picture("dog.jpg");
    Picture dog_noblue = new Picture("dog.jpg");
    Picture dog_nored = new Picture("dog.jpg");

    dog_green.zeroBlue();
    dog_green.zeroRed();
    dog_noblue.zeroBlue();
    dog_nored.zeroRed();
    dog_nored.mirror();
    dog_noblue.mirror();
    dog_green.mirror();

    canvas.cropAndCopy(dog,0,350,0,450,0,0);
    canvas.cropAndCopy(dog_noblue,0,350,0,450,0,460);
    canvas.cropAndCopy(dog_nored,0,350,0,450,360,460);
    canvas.cropAndCopy(dog_green,0,350,0,450,360,0);
    canvas.explore();
    canvas.write("C:\\Users\\liuha\\media-computation\\hliu.jpg");
  }
}
