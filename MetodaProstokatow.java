
public class MetodaProstokatow extends Thread
{
	public double integral = 0;
	public double a = 3;
	public double b = 5;
	public double h;
	public int n = 4;

	private static double value(double x) 
    {
        return Math.pow(x, 2)+3*x+9;
    }

    @Override
	public void run() 
    {	
        h = (b - a) / n;
        
        for (int i=1; i<=n; i++) 
        {
            integral += value(a + i * h);
        }
        
        integral *= h;
    }
}
