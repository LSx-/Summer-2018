import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.beans.value.*;
import javafx.event.*; 
import javafx.animation.*;
import javafx.geometry.*;
import java.util.*;
import java.io.*;

import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;
import javafx.scene.text.Font;

public class LineGrapher extends Application
{
    public static void main(String[] args) 
    {
        try
        {
            launch(args);
        }
        catch (Exception error)
        {
            error.printStackTrace();
        }
        finally
        {
            System.exit(0);
        }
    }

    public void start(Stage mainStage) 
    {
        mainStage.setTitle("Function Grapher");

        BorderPane root = new BorderPane();
        Scene mainScene = new Scene(root);
        mainStage.setScene( mainScene );

        // -----------------------------

        // GET INPUT FUNCTIONS!

        root.setStyle( "-fx-font-size: 20" );

        VBox centerBox = new VBox();
        centerBox.setSpacing(10);
        centerBox.setAlignment( Pos.CENTER );

        root.setCenter(centerBox);

        Canvas canvas = new Canvas(800,800);
        GraphicsContext context = canvas.getGraphicsContext2D();
        context.setFill( Color.GRAY );
        context.fillRect(0,0, 800,800);

        centerBox.getChildren().addAll( canvas );

        // fill background
        context.setFill(Color.CYAN);
        context.fillRect(0,0, 800,800);

        // draw axes
        context.setStroke(Color.NAVY);
        context.strokeLine(0,400, 800,400);
        context.strokeLine(400,0, 400,800);

        /*
         * calculate x
         * calculate y
         * using the exp4j library
         */
        for (double t = -4; t < 4; t += 0.001)
        {
            double x = Math.pow(t,3) - 3*t;
            double y = Math.pow(t,4) - 4*t*t;
            Point p = new Point(x,y);
            graphPoint(p, context, Color.BLACK, 3);
        }
        
        double t = 1.5;
        double x = Math.pow(t,3) - 3*t;
        double y = Math.pow(t,4) - 4*t*t;
        Point p = new Point(x,y);
        graphPoint(p, context, Color.RED, 16);
        

        // -----------------------------
        mainStage.show();
    }

    public Point mathToCanvas(Point p)
    {
        Point c = new Point();
        c.x = 800.0 / 10.0 * p.x + 400;
        c.y = -800.0 / 10.0 * p.y + 400;
        return c;
    }

    public void graphPoint(Point mathPoint, GraphicsContext context, Color pointColor, int pointSize)
    {
        Point canvasPoint = mathToCanvas(mathPoint);   
        context.setFill(pointColor);
        context.fillOval(canvasPoint.x, canvasPoint.y, pointSize,pointSize);
    }

    
    
    
    
    
    
}
