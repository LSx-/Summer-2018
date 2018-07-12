
/**
 * The Matrix2 Class is made for homework 14A
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Matrix2
{
    // instance variables - replace the example below with your own
    double a;
    double b;
    double c;
    double d;

    /**
     * The 'Blank' Constructor for class Matrix2
     */
    public Matrix2()
    {
        a = 1;
        b = 0;
        c = 0;
        d = 1;
    }
    
    /**
     * The filled perameter Constructor for Matrix2
     */
    public Matrix2(double A, double B, double C, double D)
    {
        a = A;
        b = B;
        c = C;
        d = D;
    }
    
    /**
     * how we will put the Vectors into Rows
     */
    public Vector2 getRow(int i)
    {
        if(i == 1)
        {
            return new Vector2(a,b);
        }
        
        if(i == 2)
        {
            return new Vector2(c,d);
        }
        
        return null;
    }
    
    /**
     *  how we will be Multiplying the Vectors
     */
    public Vector2 multiplyVector(Vector2 v)
    {
        return new Vector2(this.getRow(1).dot(v), this.getRow(2).dot(v));
    }
}
