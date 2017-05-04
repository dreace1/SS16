


public class Date
{

    private String description;
    private PointInTime start;
    private Period duration;

    public Date(String description, PointInTime start, Period duration)
    {
       this.description = description;
       this.start = start;
       this.duration = duration;
    }
    
    public Date clone()
    {
        return new Date(description, start.clone(), duration.clone());
    }

    public void change(int hours, int minutes)
    {        
        duration.change(minutes);
        start.change(hours);
    }
    
    public String toString()
    {
        return description + ":  start = " + start.toString() + "  duration = " + duration.toString();
    }

}
