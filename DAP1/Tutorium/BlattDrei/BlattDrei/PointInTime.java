public class PointInTime{

 private int year;
 private int number; //Nummer eines Tages im Jahr
 private int hour;

 public PointInTime(int year, int number, int hour)
 {
   if(year > 999 && year < 10000) //Immer vierstellig, keine Schaltjahre
   {
     this.year = year;
   }

   if(number > 0 && number < 365)
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
   if(getNumber() < 100 && getHour() < 10 && getNumber() >= 10)
   {
     return getYear() + "/0" + getNumber() + "/0" + getHour();
   }

   if(getNumber() < 100 && getHour() >= 10 && getNumber() >= 10)
   {
     return getYear() + "/0" + getNumber() + "/" + getHour();
   }

   if(getNumber() > 100 && getHour() < 10)
   {
     return getYear() + "/" + getNumber() + "/0" + getHour();
   }

   if(getNumber() < 10 && getHour() < 10)
   {
     return getYear() + "/00" + getNumber() + "/0" + getHour();
   }

   if(getNumber() < 10 && getHour() >= 10)
   {
     return getYear() + "/00" + getNumber() + "/" + getHour();
   }

   return getYear() + "/" + getNumber() + "/" + getHour();
 }

 public PointInTime clone()
 {
   return new PointInTime(getYear(), getNumber(), getHour());
 }



 public void change(int h)
 {
    int ueberTragY, ueberTragD;
    if (h > 0)
    {
        ueberTragD = (hour + h) / 24;
        hour = (hour + h) % 24;
        if (number + ueberTragD < 366)
        {
            ueberTragY = 0;
            number += ueberTragD;
         }
         else
         {
             ueberTragY = 1 + (number + ueberTragD - 366) / 365;
             number = (number + ueberTragD) % 365;
             year += ueberTragY;
         }
     }
 }

// public void change(int m)
// {
//   if(hour > 0)
//   {
//     hour +=m;
//     if(hour > 23)
//     {
//       hour = hour - 24;
//       number++;
//     }
//
//     if(number > 365)
//     {
//       number = number - 365;
//       year++;
//     }
//   }

// }












  //Main Methode
  public static void main(String[] args)
  {
    PointInTime g = new PointInTime(2016, 58, 12);
    System.out.println("Jahr von g: " + g.getYear());
    System.out.println("Nummer des Tages von g: " + g.getNumber());
    System.out.println("Stunde des Tages von g: " + g.getHour());
    System.out.println("Mein Geburtsag ist am: " + g.toString());
    System.out.println("Eine Kopie von meinem Geburtsag: " + g.clone());

    PointInTime a = new PointInTime(2015, 365, 23);
    a.change(2);
    System.out.println(a);





  }
}
