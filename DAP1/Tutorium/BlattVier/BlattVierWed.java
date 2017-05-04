public class BlattVierWed{

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

    if(i == 1)
    {
      if(a[1] < a[0])
      {
        return false;
      }
      else
      {
        return true;
      }
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
      return a[0] == x;
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

  public static boolean contentCheck(int[] a, int[] b, int i)
  {
    if(i < 0 || i >= a.length)
    {
      throw new RuntimeException();
    }

    if(i == 0)
    {
      return a[0] == b [0];
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

  //Zählen des ganzahliger Vielfacher des Mittleren Wertes des Arrays
  public static int countIt(int[] a, int i)
  {
    if(i < 0 || i >= a.length)
    {
      return 0;
    }

    if(i == 0)
    {
      if(a[0] % a[a.length/2] == 0)
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
      if(a[i] % a[a.length/2] == 0)
      {
        return 1 + countIt(a, i-1);
      }
      else
      {
        return countIt(a, i-1);
      }
    }

  }



  public static void main(String[] args)
  {
    int[] a = {9,2,3,7,5,6};
    int[] a2 = {9,2,3,7,5,6};
    int[] b = {-1,2,-3,4,-5,-6};
    System.out.println(maximum(a, 5));
    System.out.println(isSorted(b, 5));
    System.out.println(contains(a, 5, 9));
    System.out.println(countPositives(b, 0, 5));
    System.out.println(contentCheck(a, a2, 5));

    int[] testatArray = {2,4,6,2,12,14,16};
    System.out.println(countIt(testatArray, 6));
  }






}
