
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
     * how we will put the Matrix into Rows via Vectors
     */
    public Vector3 getRow(int j)
    {
        if(j == 1)
        {
            return new Vector3(a,b,c);
        }
        
        if(j == 2)
        {
            return new Vector3(d,e,f);
        }
        
        if(j == 3)
        {
            return new Vector3(g,h,i);
        }
        
        return null;
    }
    
    /**
     * here we will put the Matrix into Columns via Vectors
     */
    public Vector3 getColumn(int j)
    {
        if(j == 1)
        {
            return new Vector3(a,d,g);
        }
        
        if(j == 2)
        {
            return new Vector3(b,e,h);
        }
        
        if(j == 3)
        {
            return new Vector3(c,f,i);
        }
        
        return null;
    }
    
    /**
     *  how we will be Multiplying the Vectors
     */
    public Vector3 multiplyVector(Vector3 v)
    {
        return new Vector3(this.getRow(1).dot(v), 
                           this.getRow(2).dot(v), 
                           this.getRow(3).dot(v));
    }
    
    /**
     * 
     */
    public static Matrix3 makeTransform(double angle, double p, double q)
    {
        double rad = angle * ((2*Math.PI)/360);
        double a = Math.cos(rad);
        double b = -Math.sin(rad);
        double c = Math.sin(rad);
        double d = Math.cos(rad);
        
        return new Matrix3(a,b,p,c,d,q,0,0,1);
    }
    
    /**
     * here we will be Multiplying the Matrices
     */
    public Matrix3 multiplyMatrix(Matrix3 other)
    {
        return new Matrix3(this.getRow(1).dot(other.getColumn(1)),
                           this.getRow(1).dot(other.getColumn(2)),
                           this.getRow(1).dot(other.getColumn(3)),
                           this.getRow(2).dot(other.getColumn(1)),
                           this.getRow(2).dot(other.getColumn(2)),
                           this.getRow(2).dot(other.getColumn(3)),
                           this.getRow(3).dot(other.getColumn(1)),
                           this.getRow(3).dot(other.getColumn(2)),
                           this.getRow(3).dot(other.getColumn(3)));
                           
    }
    
    public void print()
    {
       System.out.println("--------------");
       System.out.println(a + ", " + b + ", " + c);
       System.out.println(d + ", " + e + ", " + f);
       System.out.println(g + ", " + h + ", " + i);
       System.out.println("--------------");
       
    }
}
