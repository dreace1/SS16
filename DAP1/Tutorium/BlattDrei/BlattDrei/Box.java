public class Box{

  private double width; //Länge
  private double heigth; //Höhe
  private double depth; //Breite



  public Box(double width, double heigth, double depth) //Konstruktor
  {
    this.width = width;
    this.heigth = heigth;
    this.depth = depth;
  }

  public double getWidth()
  {
    return width;
  }

  public double getHeigth()
  {
    return heigth;
  }

  public double getDepth()
  {
    return depth;
  }

  public double getVolumeSize()
  {
    return width*heigth*depth;
  }

  public double getAreaSize()
  {
    return 2*(width*heigth + width*depth + heigth*depth);
  }

  public double getEdgesLength()
  {
    return 4*(width + heigth + depth);
  }

  public boolean isCube()
  {
    if(width == heigth && depth == heigth && depth == width)
    {
      return true;
    }
    return false;
  }

  public int compareTo(Box f)
  {
    if(getVolumeSize() > f.getVolumeSize())
    {
      return 1;
    }
    else if( getVolumeSize() == f.getVolumeSize())
    {
        return 0;
    }
    else
    {
      return -1;
    }




  }

  public boolean encloses(Box f)
  {
    if(getWidth() > f.getWidth() && getHeigth() > f.getWidth() && getDepth() > f.getDepth())
    {
      return true;
    }

    if(getWidth() > f.getHeigth() && getHeigth() > f.getDepth() && getDepth() > f.getWidth())
    {
      return true;
    }

    return false;
  }














  //Main Methode
  public static void main(String[] args)
  {
    Box b1 = new Box(2,2,2);
    Box b2 = new Box(3,3,3);
    System.out.println("Volumen von b1: " + b1.getVolumeSize());
    System.out.println("Oberflächeninhalt von b1: " + b1.getAreaSize());
    System.out.println("Kantenlänge von b1: " + b1.getEdgesLength());
    System.out.println("Ist b1 ein Würfel?: " + b1.isCube());
    System.out.println("Vergleich der Volumen von b1 und b2: " + b1.compareTo(b2));
    System.out.println("Passt b2 in b1? : " + b2.encloses(b1));
  }


}
