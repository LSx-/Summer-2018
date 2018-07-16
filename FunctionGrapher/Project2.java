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

import java.util.Scanner;
import net.objecthunter.exp4j.*;

public class Project2 extends Application
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
        Scanner scan = new Scanner(System.in);
        String x;
        String y;
        
        mainStage.setTitle("Function Grapher");

        BorderPane root = new BorderPane();
        Scene mainScene = new Scene(root);
        mainStage.setScene( mainScene );

        // -----------------------------
        root.setStyle( "-fx-font-size: 20" );

        //adding the new Vbox for all the HBoxes
        VBox topBox = new VBox();
        topBox.setSpacing(10);
        topBox.setAlignment(Pos.CENTER);
        
        Label example = new Label("f(t) = <x(t),y(t),z(t)>");
        
        root.setTop(topBox);
        
        //first HBox with a label and textfield (x(t))
        HBox xBox = new HBox();
        xBox.setSpacing(10);
        xBox.setAlignment(Pos.CENTER);
        
        Label xLabel = new Label("x(t) = ");
        TextField xField = new TextField("");
        
        xBox.getChildren().addAll(xLabel, xField);
        
        //second HBox with a label and textfield (y(t))
        HBox yBox = new HBox();
        yBox.setSpacing(10);
        yBox.setAlignment(Pos.CENTER);
        
        Label yLabel = new Label("y(t) = ");
        TextField yField = new TextField("");
        
        yBox.getChildren().addAll(yLabel, yField);
        
        //third HBox with a label and textfield (z(t))
        HBox zBox = new HBox();
        zBox.setSpacing(10);
        zBox.setAlignment(Pos.CENTER);
        
        Label zLabel = new Label("z(t) = ");
        TextField zField = new TextField("");
        
        zBox.getChildren().addAll(zLabel,zField);
        
        //fourth HBox with a label and textfield (t range)
        HBox tBox = new HBox();
        tBox.setSpacing(10);
        tBox.setAlignment(Pos.CENTER);
        
        Label tLabel = new Label("t range = ");
        TextField tField = new TextField("t");
        
        tBox.getChildren().addAll(tLabel,tField);
        
        //fifth HBox with a label and textfield (axis range)
        HBox axisBox = new HBox();
        axisBox.setSpacing(10);
        axisBox.setAlignment(Pos.CENTER);
        
        Label axisLabel = new Label("axis range = ");
        TextField axisField = new TextField("");
        
        axisBox.getChildren().addAll(axisLabel,axisField);
        
        //the sixth HBox with a label and textfield (camera z)
        HBox camBox = new HBox();
        camBox.setSpacing(10);
        camBox.setAlignment(Pos.CENTER);
        
        Label camLabel = new Label("Camera z = ");
        TextField camField = new TextField("");
        
        camBox.getChildren().addAll(camLabel,camField);
        
        //adding all the HBoxes into the VBox
        topBox.getChildren().addAll(xBox,yBox,zBox,tBox,axisBox,camBox);
        
        //the old VBox stuff!
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
        //Expression f1 = new ExpressionBuilder(x).variables("t").build();
        //Expression f2 = new ExpressionBuilder(y).variables("t").build();
        /*
        for (double t = -4; t < 4; t += 0.001)
        {
            double x1 = f1.setVariable("t", t).evaluate();
            double y1 = f2.setVariable("t", t).evaluate();
            Point p = new Point(x1,y1);
            graphPoint(p, context, Color.BLACK, 3);
        }
        */
        double t = 1.5;
        double x2 = Math.pow(t,3) - 3*t;
        double y2 = Math.pow(t,4) - 4*t*t;
        Point p = new Point(x2,y2);
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

    /**
     *   
         * Change to a 3D point!
         * calculate x
         * calculate y
         * calculate z
         * using the exp4j library
         
        
        for (double t = -tRange; t < tRange; t += 0.001)
        {
            double x = Math.pow(t,3) - 3*t;
            double y = Math.pow(t,4) - 4*t*t;
            Point p = new Point(x,y);
            
            /*
             *  when t = -tRange, set hue = 0 so c = RED
             *  when t = +tRange, set hue = 1 so c = VIOLET
             *
            Color c;
            
            float hue = (t + tRange) / (2 * tRange);
            c = Color. getHSBColor( hue, 1.0f, 1.0f );
            graphPoint(p, context, c, 3);
        }
        

        // -----------------------------
        mainStage.show();
    }

    public Point mathToCanvas(Point p)
    {
        Point c = new Point();
        c.x = 800.0 / axisRange * p.x + 400;
        c.y = -800.0 / axisRange * p.y + 400;
        return c;
    }

     */
    
    
    
    
    
}