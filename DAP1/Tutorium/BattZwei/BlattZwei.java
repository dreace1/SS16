public class BlattZwei{

  public static void main (String[] args )
  {
    //countNegatives
    int[] b = {-1,2,-3,4,5};
    System.out.println("countNegatives " + countNegatives(b));

    //sumUpNegatives
    int[] c = {-1,-2,-1,3,5};
    System.out.println("sumUpNegatives " + sumUpNegatives(c));

    //maximum
    int[] d = {9,1,2,3,4,5};
    System.out.println("maximum " + maximum(d));

    //countMaximum
    int[] e = {1,2,3,4,5};
    System.out.println("countMaximum " + countMaximum(e));

    //isSorted
    System.out.println("isSorted " + isSorted(e));

    //checkArray
    int[] f = {12,34,78,34,12};
    int[] f1 = {5,17,88,88,17,5};
    System.out.println("checkArray " + checkArray(f1));

    //increaseArray
    int[] f2 = {1,2,3,4,5};
    increaseArray(f2, 1);
    System.out.println("increaseArray:");
    for(int i = 0; i < f2.length; i++)
    {
    System.out.print(f2[i] + " ");
    }
    System.out.println();

    //doubleIfcontainsPositive
    int[] f3 ={1,-2,3,4,5};
    doubleIfcontainsPositive(f3);
    System.out.println("doubleIfcontainsPositive:");
    for(int i = 0; i < f3.length; i++)
    {
    System.out.print(f3[i] + " ");
    }
    System.out.println();

    //copyStartingValues
    int[] f4 = {1,2,3,4,5};
    int[] f5 = {1,2};
    System.out.println("copyStartingValues:");
    for(int i = 0; i < copyStartingValues(f4).length; i++)
    {
    System.out.print(copyStartingValues(f4)[i] + " ");
    }
    System.out.println();

    //selectNegatives
    int[] f6 = {80,-7,1,56,-11,-72,0,37};
    System.out.println("selectNegatives:");
    for(int i = 0; i < selectNegatives(f6).length; i++)
    {
    System.out.print(selectNegatives(f6)[i] + " ");
    }
    System.out.println();

    //copyAndInvert
    int[] f7 = {80,-7,1,56,-11,-72,0,37};
    System.out.println("copyAndInvert:");
    for(int i = 0; i < copyAndInvert(f7).length; i++)
    {
    System.out.print(copyAndInvert(f7)[i] + " ");
    }
    System.out.println();

    //addArrays
    int[] a1 = {1,2,3,4,5};
    int[] a2 = {1,2,3,4,5};
    System.out.println("addArrays:");
    for(int i = 0; i < addArrays(a1, a2).length; i++)
    {
      System.out.print(addArrays(a1, a2)[i] + " ");
    }
    System.out.println();

    //countSequences
    int[] a3 = {80,7,1,0,11,72,0,0,37,61};
    System.out.println("countSequences: " + countSequences(a3));

    //oneInBoth
    System.out.println("oneInBoth: " + oneInBoth(a1, a1));

    //countValuesInBoth
    System.out.println("countValuesInBoth: " + countValuesInBoth(f7, a2));

    //oneIsGreater
    int[] a5 = {9,8,7,6,5};
    System.out.println("oneIsGreater: " + oneIsGreater(a5, a1));








  }

  //Aufgabe 1
  public static int countNegatives(int[] a)
  {

    int count = 0;
    for(int i = 0; i < a.length; i++)
    {

      if(a[i] < 0)
      {
        count++;
      }

    }
    return count;
  }


  //Aufgabe 2
  public static int sumUpNegatives(int[] a)
  {
    int sum = 0;
    for(int i = 0; i < a.length; i++)
    {
      if(a[i] > 0)
      {
      sum+= a[i];
      }
    }
    return sum;
  }


  //Aufgabe 3
  public static int maximum(int[] a)
  {
    int max = a[0];
    for(int i = 0; i < a.length; i++)
    {
      if(max < a[i])
      {
        max = a[i];
      }
    }
    return max;
  }


  //Aufgabe 4
  public static int countMaximum(int[] a)
  {
    int max = a[0];
    int count = 1;
    for(int i = 0; i < a.length; i++)
    {
      if(max < a[i])
      {
        max = a[i];
        count++;
      }
    }
    return count;
  }


  //Aufgabe 5
  public static boolean isSorted(int[] a)
  {
    for(int i = 1; i < a.length; i++)
    {
      if(a[i] < a[i-1])
      {
        return false;
      }

    }
    return true;
  }


  //Aufgabe 6
  public static boolean checkArray(int[] a)
  {
    int j = a.length;
    for(int i = 0; i < a.length; i++)
    {
      j--;
      if(a[i]!=a[j])
      {
        return false;
      }
    }
    return true;
  }


  //Aufgabe 7
  public static int[] increaseArray(int[] a, int b)
  {
    for(int i = 0; i < a.length; i++)
    {
      a[i] = a[i] + b;
    }
    return a;
  }


  //Aufgabe 8
  public static int[] doubleIfcontainsPositive(int[] a)
  {
    int pos = 0;
    for(int i = 0; i < a.length; i++) //Prüfen ob mindestens ein Positiver Wert
    {                                 //vorkommt
      if(a[i] > 0)
      {
        pos++;
      }
    }

    if(pos > 0)
    {
      for(int i = 0; i < a.length; i++)
      {
        a[i] += a[i];
      }
    }
    return a;
  }


  //Aufgabe 9
  public static int[] copyStartingValues(int[] a)
  {
    int[] b = new int[3];
    if(a.length > 3)
    {
      for(int i = 0; i < b.length; i++)
      {
        b[i] = a[i];
      }
      return b;
    }
    return a;
  }


  //Aufgabe 10
  public static int[] selectNegatives(int[] a)
  {
    int[] b = new int[(countNegatives(a))];
    int j = 0;
    for(int i = 0; i < a.length; i++)
    {
      if(a[i] < 0)
      {
        b[j] = a[i];
        j++;
      }
    }
    return b;
  }


  //Aufgabe 11
  public static int[] copyAndInvert(int[] a)
  {
    int[] b = new int[a.length];
    int j = a.length;
    for(int i = 0; i < a.length; i++)
    {
      j--;
      b[j] = a[i];
    }
    return b;
  }


  //Aufgabe 12
  public static int[] addArrays(int[] a, int[] b)
  {
    int[] sum = new int[a.length];
    if(a.length == b.length)
    {
      for(int i = 0; i < a.length; i++)
      {
        sum[i] = a[i] + b[i];
      }
      return sum;
    }
    else
    {
      return sum;
    }
  }


  //Aufgabe 13
  public static int countSequences(int[] a)
  {
    int count = 0;
    for(int i = 0; i < a.length; i++)
    {
      if(a[i] == 0)
      {
        count++;
      }
    }
    return count;
  }


  //Aufgabe 14
  public static boolean oneInBoth(int[] a, int[] b)
  {
    for(int i = 0; i < a.length; i++)
    {
      for(int j = 0; j < b.length; j++)
      {
      if(a[i] == b[j])
      {
        return true;
      }
    }
    }
    return false;
  }


  //Aufgabe 15
  public static int countValuesInBoth(int[] a, int[] b)
  {
    int count = 0;
    //für a
    for(int i = 0; i < a.length; i++)
    {
      count++;
    }
    //für b
    for(int i = 0; i < a.length; i++)
    {
      count++;
    }
    return count;
  }


  //Aufgabe 16
  public static boolean oneIsGreater(int[] a, int[] b)
  {
    int max = maximum(a);
    for(int i = 0; i < a.length; i++)
    {
      if(max < b[i])
      {
        return false;
      }
    }
    return true;
  }


  //Augabe 17
  public static boolean allAreGreater(int[] a, int[]b)
  {
    for(int i = 0; i < a.length; i++)
    {
      if(a[i] < b[i])
      {
        return false;
      }
    }
    return true;
  }


  //Testat 02 "Arrays"
  public static int[] testatTwo(int[] a)
  {
    if(a.length % 2 != 0 && a.length > 0)
    {
      for(int i = 0; i < a.length; i++)
      {
        if(i % 2 != 0)
        {
          a[i] *= 3;
        }
      }
      return a;
    }
    else
    {
    return a;
    }



  }



}
