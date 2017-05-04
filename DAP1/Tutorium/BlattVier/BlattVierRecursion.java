public class BlattVierRecursion{

  public static int maximum(int[] a, int i)
  {
    if(i < 0 || i >= a.length)
    {
      throw new RuntimeException();
    }

    if(i == 0)
    {
      return a[0];
    }
    else
    {
      int max = maximum(a, i-1);
      if(a[i] > max)
      {
        return a[i];
      }
      return max;
    }
  }

    public static boolean isSorted(int[] a, int i)
    {
      if(i < 0 || i >= a.length)
      {
        throw new RuntimeException();
      }

      if(i == 0)
      {
        return true;
      }
      else
      {
        if(a[i] >= a[i-1])
        {
          return isSorted(a, i-1);
        }
        else
        {
          return false;
        }
      }
    }

    public static boolean contains(int[] a, int i, int x)
    {
      if(i < 0 || i >= a.length)
      {
        throw new RuntimeException();
      }

      if(i == 0)
      {
        if(a[0] == x)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
      else
      {
        if(a[i] == x)
        {
          return true;
        }
        else
        {
          return contains(a, i-1, x);
        }
      }
    }

    public static int countPositives(int[] a, int d, int t)
    {
      if(d > t || t >= a.length)
      {
        throw new RuntimeException();
      }

      if(t == d)
      {
        if(a[t] > 0) //für den fall von 0
        {
          return 1;
        }
        else
        {
          return 0;
        }
      }
      else
      {
        if(a[t] > 0)
        {
          return 1 + countPositives(a,d, t-1); //bei int beachten das pro aufruf ein int wert zurück gegeben wird
        }
          return countPositives(a,d, t-1);
      }
    }

    public static boolean contenCheck(int[] a, int[] b, int i)
    {
      if(i == 0)
      {
        return true;
      }
      else
      {
        if(a[i] != b[i])
        {
          return false;
        }
        else
        {
          return contenCheck(a, b, i-1);
        }
      }
    }

    public static int digitSum(int n)
    {
      int sum = 0;
      if(n < 10)
      {
        return n;
      }
      else
      {
        sum = digitSum(n%10 + n/10);
        return sum;
      }
    }

    public static double harm(int n)
    {
      double sum = 0.0;
      if(n == 1)
      {
        return 1.0;
      }
      else
      {
        return 1.0 /n + harm(n-1);
      }
    }







  public static void main(String[] args)
  {
    int[] a = {3,4,5,6,1,3};
    int[] b = {1,2,3,4,5,6};
    int[] c = {1,2,3,4,5,2};
    int[] d = {1,2,3,4,5,6};
    System.out.println(maximum(a, 5));
    System.out.println(isSorted(b, 5));
    System.out.println(contains(c, 5, 6));
    System.out.println(countPositives(b, 0, 5));
    System.out.println(contenCheck(b, c, 5));
    System.out.println(harm(5));
  }






}
