public class Date{

  private String name; //Bezeichnung
  private PointInTime start; //Startzeitpunkt
  private Period duration; //Dauer

  public Date(String name, PointInTime start, Period duration)
  {
    this.name = name;
    this.start = start;
    this.duration = duration;
  }

  public PointInTime getStart()
  {
    return start;
  }

  public String getName()
  {
    return name;
  }

  public Period getDuration()
  {
    return duration;
  }

  public Date clone()
  {
    return new Date(getName(), getStart(), getDuration());
  }

  public void change(int h, int m) //h Stunden die den Startzeitpunkt verschieben
                                  //m Minuten die die Dauer (Period) ändern
  {
    start.change(h); //Aufruf der verschiedenen change Methoden
    duration.change(m);
  }

  public String toString()
  {
    return "Beschreibung: " + name + " Startzeitpunkt: " + start.toString() + " Dauer: " + duration.toString();
  }




















}
