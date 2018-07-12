
/**
 * The Vector class was made to work with the martix2 class
 * and to help HW14A function
 *
 * @author Michael Castillo
 * @version (1.0)
 */
public class Vector2
{
    // instance variables - replace the example below with your own
    double x;
    double y;

    /**
     * The 'blank' Constructor for class Vector2
     */
    public Vector2()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * The filled perameter Constructor for class Vector2
     */
    public Vector2(double X, double Y)
    {
        x = X;
        y = Y;
    }
    
    /**
     * This is the dot formula!
     * how the dot product works:
     * V (dot) W = (v1*w1) + (v2*w2)
     */
    double dot (Vector2 other)
    {
        return (this.x * other.x) + (this.y * other.y);
    }
}
