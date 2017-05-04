public class PointInTime{

  private int year;
  private int number;
  private int hour;

  public PointInTime(int year, int number, int hour)
  {
    if(year > 999 && year < 10000)
    {
      this.year = year;
    }

    if(number > 0 && number <= 365)
    {
      this.number = number;
    }

    if(hour >= 0 && hour < 24)
    {
      this.hour = hour;
    }
  }

  public int getYear()
  {
    return year;
  }

  public int getNumber()
  {
    return number;
  }

  public int getHour()
  {
    return hour;
  }

  public String toString()
  {
    if(number < 10 && hour < 10)
    {
      return getYear() + "/00" + getNumber() + "/0" + getHour();
    }
    else if(number < 10 && hour >= 10)
    {
      return getYear() + "/00" + getNumber() + "/" + getHour();
    }
    else if(number >= 10 && number < 100 && hour < 10)
    {
      return getYear() + "/0" + getNumber() + "/0" + getHour();
    }
    else if(number >= 10 && number < 100 && hour >= 10)
    {
      return getYear() + "/0" + getNumber() + "/" + getHour();
    }
    {
      return getYear() + "/" + getNumber() + "/" + getHour();
    }
  }

  public PointInTime clone()
  {
    return new PointInTime(getYear(), getNumber(), getHour());
  }

  public void change(int h)
  {
    if(h > 0)
    {
      hour += h;
      if(hour > 24)
      {
        number++;
        hour -= 24;
        if(number > 365)
        {
          number -= 365;
          year++;
        }
      }
    }
  }





  public static void main(String[] args)
  {
    PointInTime a = new PointInTime(2015, 1, 1);
    PointInTime b = new PointInTime(2015, 13, 13);
    PointInTime c = new PointInTime(2015, 365, 13);

    c.change(27);
    System.out.println(c.toString());
  }






}
