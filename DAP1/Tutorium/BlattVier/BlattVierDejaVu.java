public class BlattVierDejaVu{

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
      else
      {
        return max;
      }
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
      if(a[i] < a[i-1])
      {
        return false;
      }
      else
      {
        return isSorted(a, i-1);
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

  public static boolean contentCheck(int[] a, int[] b, int i)
  {
    if(i < 0 || i >= a.length)
    {
      throw new RuntimeException();
    }

    if(i == 0)
    {
      if(a[0] == b[0])
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
      if(a[i] != b[i])
      {
        return false;
      }
      else
      {
        return contentCheck(a, b, i-1);
      }
    }
  }

  public static int countPositives(int[] a, int d, int t)
  {
    if(t < d || t >= a.length)
    {
      throw new RuntimeException();
    }

    if(t == d)
    {
      if(a[d] > 0)
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
        return 1 + countPositives(a, d, t-1);
      }
      else
      {
        return countPositives(a, d, t-1);
      }
    }
  }

  public static int countSomething(int[] a, int i)
  {
    if(i < 0 || i >= a.length)
    {
      throw new RuntimeException();
    }

    if(i == 1)
    {
      if(a[1] % a[i-1] == 0)
      {
        return 1;
      }
      else return 0;
    }
    else
    {
      if(a[i] % a[i-1] == 0)
      {
        return 1 + countSomething(a, i-1);
      }
      else
      {
        return countSomething(a, i-1);
      }
    }
  }

  public static void main(String[] args)
  {
    int[] a = {-1,2,7,4,5,6};
    int[] b = {9,2,7,4,5,6};
    System.out.println(maximum(a, 5));
    System.out.println(isSorted(a, 5));
    System.out.println(contains(a, 5 ,6));
    System.out.println(contentCheck(a, b, 5));
    System.out.println(countPositives(a, 0, 5));
    System.out.println(countSomething(a, 5));
  }




}
