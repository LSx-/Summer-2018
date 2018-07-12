
/**
 * The Vector class was made to work with the martix3 class
 * and to help HW14C function
 *
 * @author Michael Castillo
 * @version (1.0)
 */
public class Vector3
{
    // instance variables - replace the example below with your own
    double x;
    double y;
    double z;

    /**
     * The 'blank' Constructor for class Vector2
     */
    public Vector3()
    {
        // initialise instance variables
        x = 0;
        y = 0;
        z = 1;
    }
    
    /**
     * The filled perameter Constructor for class Vector2
     */
    public Vector3(double X, double Y, double Z)
    {
        x = X;
        y = Y;
        z = Z;
    }
    
    /**
     * This is the dot formula!
     * how the dot product works:
     * V (dot) W = (v1*w1) + (v2*w2) + (v3*w3);
     */
    double dot (Vector3 other)
    {
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
    }
}

