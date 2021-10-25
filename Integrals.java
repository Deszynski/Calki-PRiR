
public class Integrals 
{
	public static void main(String[] args) 
	{
		double sum = 0;
		
		MetodaTrapezow thread1 = new MetodaTrapezow(); 
		MetodaProstokatow thread2 = new MetodaProstokatow();              
        MetodaSimpsona thread3 = new MetodaSimpsona();
        
        thread1.start();
        thread2.start();
        thread3.start();

        try 
        {
        	thread1.join();
        	thread2.join();
        	thread3.join();
        } 
        catch (Exception e)
        {
        	e.printStackTrace();
        }

        sum += thread1.integral;
        sum += thread2.integral;
        sum += thread3.integral;
        
        System.out.println("Suma calek: " + sum);
	}
}
