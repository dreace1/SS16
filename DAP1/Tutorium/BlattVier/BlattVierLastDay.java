public class BlattVierLastDay{

  //Aufhabe aus der Uebung
  public static boolean Uebung(int[] a, int i)
  {
    if(i < 0 || i >= a.length)
    {
        throw new RuntimeException();
    }

    if(i == 1)
    {
      return a[1] == a[0];
    }
    else
    {
      if(a[i] == a[0])
      {
        return true;
      }
      else
      {
        return Uebung(a, i-1);
      }
    }
  }

  public static int countInt(int[] a, int i, int x)
  {
    if(i < 0 || i >= a.length)
    {
      throw new RuntimeException();
    }

    if(i == 0)
    {
      if(a[i] == x)
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
      if(a[i] == x)
      {
        return 1 + countInt(a, i-1, x);
      }
      else
      {
        return countInt(a, i-1, x);
      }
    }
  }

  public static int countMiddle(int[] a, int i)
  {


    if(i == 0)
    {
      if(a[0] == a[a.length/2])
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
      if(a[i] == a[a.length/2]) //WICHTIG i!=a.length muss am anfang stehen -> Reihenfolge beachten
      {
        return 1 + countMiddle(a, i-1);
      }
      else
      {
        return countMiddle(a, i-1);
      }
    }
  }

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

  public static boolean contentCheck(char[] a1, char[] a2, int i)
  {
    if(i < 0 || i >= a1.length)
    {
      throw new RuntimeException();
    }

    if(i == 0)
    {
      return a1[0] == a2[0];
    }
    else
    {
      if(a1[i] != a2[i])
      {
        return false;
      }
      else
      {
        return contentCheck(a1, a2, i-1);
      }
    }
  }

  public static int countMinusOne(int[] a, int i)
  {
    if(i < 0 || i >= a.length)
    {
      return 0;
    }

    if(i == 0)
    {
      if(a[0] == a[a.length-2])
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
      if(a[i] == a[a.length-2])
      {
        return 1 + countMinusOne(a, i-2);
      }
      else
      {
        return countMinusOne(a, i-2);
      }
    }
  }

  public static int sumTestat(int[] a, int i)
  {
    if(i < 0 || i >= a.length)
    {
      return 0;
    }


    if(i == 0)
    {
      if(a[0] > 0)
      {
        return a[0];
      }
      else
      {
        return 0;
      }
    }
    else
    {
      if(a[i] > 0)
      {
        return a[i] + sumTestat(a, i-1);
      }
      else
      {
        return sumTestat(a, i-1);
      }
    }
  }

  public static void main(String[] args)
  {
    int[] a = {1,2,3,1,5,6};
    int[] b = {2,1,3,1,6,7,1};
    int[] c = {-1,2,3,7,5,6};
    System.out.println(Uebung(a, 5));
    System.out.println(countInt(a, 5, 1));
    System.out.println(countMiddle(a, 5));
    System.out.println(maximum(c, 5));
    System.out.println(contains(c, 5, 7));
    System.out.println(countPositives(c, 0, 5));
    char[] e = {1,2,3,4,5,6};
    char[] f = {1,2,3,4,5,7};
    System.out.println(contentCheck(e, f, 5));
    int[] g = {1,2,3,4,5,6,5,6,5,7,8,5,10};
    System.out.println(countMinusOne(g, 12));
    int[] testat = {1,1,-1,1,1,1};
    System.out.println(sumTestat(testat, 6));
  }




}
