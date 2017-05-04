public class TestAllClasses{

  public static void main(String[] args)
  {
    Period p1 = new Period(90);
    Period p2 = p1.clone();
    System.out.println(p1.toString());

    p2.change(30);
    System.out.println(p2.toString());

    PointInTime t1 = new PointInTime(2015, 365, 22);
    PointInTime t2 = t1.clone();
    System.out.println(t1.toString());

    t2.change(17);
    System.out.println(t2.toString());

    Date d1 = new Date("Practice", t1, p1);
    Date d2 = d1.clone();
    System.out.println(d1.toString());
  }





}
