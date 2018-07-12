
/**
 * The Matrix2 Class is made for homework 14C
 *
 * @author Michael Castillo
 * @version 1.0
 */
public class Matrix3
{
    // instance variables - replace the example below with your own
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;

    /**
     * The 'Blank' Constructor for class Matrix2
     */
    public Matrix3()
    {
        a = 1;
        b = 0;
        c = 0;
        d = 1;
        e = 0;
        f = 0;
        g = 1;
        h = 0;
        i = 0;
    }
    
    /**
     * The filled perameter Constructor for Matrix2
     */
    public Matrix3(double A,double B,double C,double D,double E, double F,double G,double H,double I)
    {
        a = A;
        b = B;
        c = C;
        d = D;
        e = E;
        f = F;
        g = G;
        h = H;
        i = I;
    }
    
    /**
     * how we will put the Vectors into Rows
     */
    public Vector3 getRow(int i)
    {
        if(i == 1)
        {
            return new Vector3(a,b,c);
        }
        
        if(i == 2)
        {
            return new Vector3(c,d,e);
        }
        
        if(i == 3)
        {
            return new Vector3(g,h,i);
        }
        
        return new Vector3(0,0,1);
    }
    
    /**
     *  how we will be Multiplying the Vectors
     */
    public Vector3 multiplyVector(Vector3 v)
    {
        return new Vector3(this.getRow(1).dot(v), this.getRow(2).dot(v), this.getRow(3).dot(v));
    }
}
