import java.util.Random;
import java.util.Scanner;

class Worker extends Thread
{
    int calculatedSum=0;
    int arr[];
    int i;
    int j;
    Worker(int[] arr,int i,int j)
    {
        this.arr=arr;
        this.i=i;
        this.j=j;
    }
   public void run()
   {
      for(int p=i;p<j;p++)
      {
          calculatedSum+=arr[p];
      }
   }
   int getsum()
   {
       return calculatedSum;
   }
}

public class Calculating_sum_using_Multiple_threads{
    public static void main(String[] args)throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num_of_threads=sc.nextInt();
        int[] arr=new int[size];
        Random rand=new Random();
        for(int i=0;i<size;i++)
        {
            arr[i]=rand.nextInt(100);
        }
        int div=size/num_of_threads;
        Worker[] threads=new Worker[num_of_threads];
        int strt=0;

        for(int i=0;i<num_of_threads;i++)
        {
            int end=strt+div;
            if(i==num_of_threads-1) end=size;
           threads[i]=new Worker(arr,strt,end);
           threads[i].start();
           strt=end;
        }
        int total_um=0;
        for(Worker t:threads)
        {
            try
            {
                t.join();
                total_um+=t.getsum();
            }catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Total Sum Of the Array Using Multiple Threads: "+total_um);
    }
}
