
public class MetodaSimpsona extends Thread
{
	public double integral = 0;
	public double a = 5;
	public double b = 7;
	public double h, sum_ti = 0, xi;
	public int n = 4;

    private static double value(double x) 
    {
    	return Math.pow(x, 2)+3*x+9;
    }

    @Override
	public void run() 
    {
        h = (b - a) / n;

        for (int i=1; i<n; i++) 
        {
            xi = a + i*h;
            sum_ti += value(xi - h / 2);
            integral += value(xi);
        }
        
        sum_ti += value(b - h / 2);
        integral = (h/6) * (value(a) + value(b) + 2*integral + 4*sum_ti);
    }
}
