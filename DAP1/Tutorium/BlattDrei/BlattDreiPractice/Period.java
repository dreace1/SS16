public class Period{

  int minutes;

  public Period(int minutes)
  {
    if(minutes > 0)
    {
      this.minutes = minutes;
    }
    else
    {
      this.minutes = 0;
    }
  }

  public Period(int minutes, int hours)
  {
    if(minutes > 0 || hours > 0)
    {
      this.minutes = hours * 60 + minutes;
    }
    else
    {
      this.minutes = 0;
    }
  }

  public int getMinutes()
  {
    return minutes;
  }

  public int getHours()
  {
    return minutes/60;
  }

  public int getMinorMinutes()
  {
    if(minutes < 60)
    {
      return minutes;
    }
    else
    {
      return minutes%60;
    }
  }

  public String toString()
  {
    if(minutes < 60)
    {
      return "00:" + getMinutes();
    }
    else if(getMinorMinutes() < 10 && getHours() < 10)
    {
      return "0" + getHours() + ":0" + getMinorMinutes();
    }
    else if(getMinorMinutes() > 10 && getHours() < 10)
    {
      return "0"+getHours()+":"+getMinorMinutes();
    }
    else if(getMinorMinutes() < 10 && getHours() >= 10)
    {
      return getHours() + ":0" + getMinorMinutes();
    }
    else
    {
      return getHours() + ":" + getMinorMinutes();
    }
  }

  public Period clone()
  {
    if(minutes < 60)
    {
      return new Period(minutes);
    }
    else
    {
      return new Period(getMinorMinutes(), getHours());
    }
  }

  public void change(int m)
  {
    if(m > 0)
    {
      minutes += m;
    }
  }



  public static void main (String[] args)
  {
    Period a = new Period(30);
    Period b = new Period(30, 1);
    System.out.println("b als Text: " + b.toString());
    System.out.println("a als Text: " + a.toString());
    System.out.println("Kopie von a: " + a.clone());
    System.out.println("Kopie von b: " + b.clone());

    a.change(40);
    System.out.println("40 Minuten später a: " + a.toString());
  }










}
