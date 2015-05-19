/*
 * Tyler Schumacher
 */
import java.util.*;
public class euclidsAlgorithmAverage
{
    public static void main(String args[])
    {
        System.out.println("n    AveEst(n)    AveEstLog2(n)");
        for(int n = 10000; n <= 20000; n = n + 100)
        {
            AvEuclidEst(n);
        }
    }
    public static int Euclid(int n,int m)
    {
        int count = 1;
        int r = 0;
        while(m > 0 && m < n)
        {
            count = count+1;
            r = n%m;
            n = m;
            m = r;
        }
        return count;
    }
    public static void AvEuclidEst(int n)
    {
        Random random = new Random();
        int sum = 0;
        int m = 0;
        for(int i = 1; i<= 100 ; i= i+1)
        {
            m = random.nextInt(n);
            sum = sum + Euclid(n, m);
        }
        int avEstimate = sum/100;
        double logAvEstimate = avEstimate/(Math.log(n) / Math.log(2));
        System.out.println(n + "    " + avEstimate + "    " + logAvEstimate);
    }
}