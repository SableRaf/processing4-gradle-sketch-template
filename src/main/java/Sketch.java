// filepath: /processing-java-template/processing-java-template/src/main/java/Sketch.java
import processing.core.PApplet;

public class Sketch extends PApplet {
    @Override
    public void settings() {
        size(800, 600);
        pixelDensity(displayDensity());
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        //background(frameCount % 255 );
        circle(mouseX, mouseY, 50);
    }

    public static void main(String[] args) {
        PApplet.main(Sketch.class.getName());
    }
}