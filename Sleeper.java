
public class Sleeper implements Runnable
{
    public void run()
    {
        try
        {
            for (int i = 0; i < 5; i++)
            {
                Thread.currentThread().sleep(1000);
                System.out.println("Sleeping for " + (i + 1) + " second(s)");
            }
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        Runnable sleeper = new Sleeper();
        Thread t = new Thread(sleeper);
        t.start();
    }
}
