// Algorithm:
// Draw the snowmans body
// Draw the snowmans body parts such as arms, eyes, mouth
// Make sure the mouth is in an oh shape, not a line 
// Include 3 green square buttons on the snowman, above torso
// Add a sun to the background on the top right corner 
// Draw the snowmans tophat 
// Add your name to the top left corner
// Shift your snowman 20 pixels from original spot
// Finish the setting with a blue sky


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.shape.*;

public class SnowmanFX extends Application
{
    // Shows background image of where snowman is
 
    public void start(Stage primaryStage)
    {        
    // Details of how the output will look like
    // such as the Snowmans body, accessories, mouth
    // hands, and the coordinates of the details
        Ellipse base = new Ellipse(100, 210, 80, 60);
        base.setFill(Color.WHITE);

        Ellipse middle = new Ellipse(100, 130, 50, 40);
        middle.setFill(Color.WHITE);

        Circle head = new Circle(100, 70, 30);
        head.setFill(Color.WHITE);

        Circle rightEye = new Circle(90, 60, 5);
        Circle leftEye = new Circle(110, 60, 5);
        Circle mouth = new Circle (100, 80, 5);
        mouth.setFill(Color.BLACK);

        Rectangle topButton = new Rectangle(100, 110, 6, 6);
        topButton.setFill(Color.GREEN);
        
        Rectangle middleButton = new Rectangle(100, 125, 6, 6);
        middleButton.setFill(Color.GREEN);
        
        Rectangle bottomButton = new Rectangle(100, 140, 6, 6);
        bottomButton.setFill(Color.GREEN);

        Line leftArm = new Line(130, 130, 180, 130);
        leftArm.setStrokeWidth(3);
        Line rightArm = new Line(70, 130, 0, 100);
        rightArm.setStrokeWidth(3);

        Rectangle stovepipe = new Rectangle(80, 0, 40, 50);
        Rectangle brim = new Rectangle(70, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        Group snowman = new Group(base, middle, head, leftEye, rightEye,
            mouth, topButton, middleButton, bottomButton, leftArm, rightArm, hat);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        Circle sun = new Circle(450, 35, 30);
        sun.setFill(Color.GOLD);
        
        Text name = new Text (5,35, "Frosty the Snowman");
        
        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);

        Group root = new Group(ground, sun, snowman, name);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
    // this will launch the entire code and create the finished product
        launch(args);
    }
}