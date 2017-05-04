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
     this.minutes = hours * 60 + minutes; //Die Übergebenen Stunden in minuten
                                          //umgerechnet
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

 public int getHours() //nur die ganzen Stunden
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
     return minutes % 60;
   }
 }

 public String toString()
 {
   if(minutes < 60)
   {
     return "00:" + minutes;
   }
   else if(getMinorMinutes() < 10)
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








 public static void main(String[] args)
 {
   Period m = new Period(40);
   Period h = new Period(30, 1);
   System.out.println("Minuten von m: " + m.getMinutes());
   System.out.println("Minuten von h: " + h.getMinutes());
   System.out.println("ganze Stunden von m: " + m.getHours());
   System.out.println("ganze Stunden von h: " + h.getHours());
   System.out.println("ganze Minuten von m: " + m.getMinorMinutes());
   System.out.println("ganze Minuten von h: " + h.getMinorMinutes());
   System.out.println("Text Ausgabe von m: " + m.toString());
   System.out.println("Text Ausgabe von h: " + h.toString());
   System.out.println("Kopie von m: " + m.clone());
   System.out.println("Kopie von h: " + h.clone());

   //change Methode
   Period test = new Period(30);
   test.change(35);
   System.out.println("35 Minuten auf test Addiert: " + test.toString());


 }



}
