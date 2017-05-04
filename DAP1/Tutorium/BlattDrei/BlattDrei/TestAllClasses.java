public class TestAllClasses{

 public static void main(String[] args)
 {
   Period a = new Period(12);
   Period b = a.clone();
   b.change(66);
   System.out.println("a: " + a.toString());
   System.out.println("b: " + b.toString());

   PointInTime zugfahrt = new PointInTime(2016, 140, 19);
   PointInTime zugfahrtEnde = zugfahrt.clone();
   System.out.println("Meine Zugfahrt beginnt: " + zugfahrt.toString());
   zugfahrtEnde.change(3);
   System.out.println("Meine Zugfahrt endet: " + zugfahrtEnde.toString());

   Date urlaub = new Date("Urlaub", zugfahrt, a);
   Date urlaubEnde = urlaub.clone();
   System.out.println(urlaub.toString());
   urlaubEnde.change(96, 30);
   System.out.println(urlaubEnde.toString());
 }


}
