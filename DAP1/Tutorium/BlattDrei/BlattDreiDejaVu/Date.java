public class Date{

  private String describtion;
  private PointInTime start;
  private Period duration;

  public Date(String describtion, PointInTime start, Period duration)
  {
    this.describtion = describtion;
    this.start = start;
    this.duration = duration;
  }

  public String getDescribtion()
  {
    return describtion;
  }

  public PointInTime getStart()
  {
    return start;
  }

  public Period getDuration()
  {
    return duration;
  }

  public Date clone()
  {
    return new Date(getDescribtion(), getStart(), getDuration());
  }

  public void change(int h, int m)
  {
    start.change(h);
    duration.change(m);
  }

  public String toString()
  {
    return "Beschreibung: " + getDescribtion() + " Beginn: " + getStart() + " Dauer: " + getDuration();
  }

  





}
