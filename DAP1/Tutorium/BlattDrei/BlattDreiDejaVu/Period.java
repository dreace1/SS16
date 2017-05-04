public class Period{

  private int minutes;

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

  public Period clone()
  {
    return new Period(getMinutes());
  }

  public void change(int m)
  {
    if(m > 0)
    {
      minutes += m;
    }
  }

  public String toString()
  {
    if(getMinutes() < 10)
    {
      return "00:0" + getMinutes();
    }
    else if(getMinutes() < 60)
    {
      return "00:" + getMinutes();
    }
    else if(getMinutes() > 60 && getHours() < 10 && getMinorMinutes() < 10)
    {
      return "0" + getHours() + ":0" + getMinorMinutes();
    }
    else if(getMinutes() > 60 && getHours() >= 10 && getMinorMinutes() < 10)
    {
      return getHours() + ":0" + getMinorMinutes();
    }
    else if(getMinutes() > 60 && getHours() < 10 && getMinorMinutes() >= 10)
    {
      return "0" + getHours() + ":" + getMinorMinutes();
    }
    else
    {
      return getHours() + ":" + getMinorMinutes();
    }
  }


  public static void main(String[] args)
  {
    Period a = new Period(90);
    Period b = new Period(30);
    Period c = new Period(5);
    Period d = new Period(40, 1);
    Period e = a.clone();

    System.out.println(d.toString());

    e.change(60);

    System.out.println(e.toString());
  }






}
