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

  public Period(int hours, int minutes)
  {
    if(hours > 0 || minutes > 0)
    {
      this.minutes = hours*60+minutes;
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
    if(minutes < 60 && minutes < 10)
    {
      return "00:0" + getMinutes();
    }
    else if(minutes < 60 && minutes >= 10)
    {
      return "00:" + getMinutes();
    }
    else if(minutes > 60 && getHours() < 10 && getMinorMinutes() < 10)
    {
      return "0" + getHours() + ":0" + getMinorMinutes();
    }
    else if(minutes > 60 && getHours() < 10 && getMinorMinutes() >= 10)
    {
      return "0" + getHours() + ":" + getMinorMinutes();
    }
    else if(minutes > 60 && getHours() >= 10 && getMinorMinutes() < 10)
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
    return new Period(getMinutes());
  }

  public void change(int m)
  {
    if(m > 0)
    {
      minutes += m;
    }
  }


  public static void main(String[] args)
  {
    Period a = new Period(30);
    Period b = new Period(90);
    Period c = new Period(1, 40);
    System.out.println(c.toString());

    Period d = b.clone();
    d.change(40);
    System.out.println(d.toString());
  }





}
