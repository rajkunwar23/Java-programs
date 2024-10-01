package MyMath;
interface operations
{
int getMin(int arr[], int n);
int getMax(int arr[], int n);
int getAvg(int arr[], int n);
int getCount(int arr[], int n);
}

public class stat implements operations
{
 public int getMin(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

  public int getMax(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }
  
 public  int getSum(int arr[],int n)
      {
         int sum=0;
        for (int i = 0; i < n; i++)
            sum+=arr[i];
        return sum;
      }

public  int getAvg(int arr[],int n)
      {
         int sum=0,avg;
        for (int i = 0; i < n; i++)
            sum+=arr[i];
        avg=sum/n;
        return avg;
      }

 public int getCount(int arr[],int n)
      {
        int count=0;
        for (int i = 0; i < n; i++)
            count++;
        return count;
      }
}