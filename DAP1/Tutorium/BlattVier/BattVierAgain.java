public class BattVierAgain{

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

  public static int countPositives(int[] a, int d, int t)
  {
    if(d > t || t >= a.length)
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

  public static boolean contentCheck(int[] a, int[] b, int i)
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
      return contentCheck(a, b, i-1);
    }
  }

  //ganzahlig durch eine Zahl x teilbar zaehlen
  public static int countTestat(int[] a, int i, int x)
  {
    if(i < 0 || i >= a.length)
    {
      return 0;
    }

    if(i == 0)
    {
      if(a[0] % x == 0)
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
      if(a[i] % x == 0)
      {
        return 1 + countTestat(a, i-1, x);
      }
      else
      {
      return countTestat(a, i-1, x);
      }
    }
  }





  public static void main(String[] args)
  {
    int[] a = {1,2,3,-4,5,3};
    int[] b = {1,2,3,4,5,6};
    int[] c = {2,4,6,8,10,12};
    System.out.println(isSorted(a, 5));
    System.out.println(contains(a, 5, 3));
    System.out.println(countPositives(a, 3, 5));
    System.out.println(contentCheck(a, b, 5));
    System.out.println(countTestat(b, 5, 2));
  }





}
