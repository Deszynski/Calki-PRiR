
public class MetodaTrapezow extends Thread
{
	public double integral = 0;
	public double a = 1;
    public double b = 3;
    public int n = 4;

    private static double value(double x) 
    {
        return Math.pow(x, 2)+3*x+9;
    }

    @Override
	public void run() 
    {
        double h;

        h = (b-a)/n;
        
        for (int i=1; i<n; i++) 
            integral += value(a + i * h);
        
        integral += (value(a) + value(b))/2;
        integral *= h;
    }
}
