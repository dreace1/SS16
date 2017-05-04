public class Box{

  private double width;
  private double height;
  private double depth;

  public Box(double width, double height, double depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public double getWidth()
  {
    return width;
  }

  public double getHeight()
  {
    return height;
  }

  public double getDepth()
  {
    return depth;
  }

  public double getVolumeSize()
  {
    return width * height * depth;
  }

  public double getAreaSize()
  {
    return 2 * (width * height + width * depth + height * depth);
  }

  public double getEdgesLength()
  {
    return 4*(width + height + depth);
  }

  public boolean isCube()
  {
    if(width == height && width == depth)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int compareTo(Box f)
  {
    if(f.getVolumeSize() > getVolumeSize())
    {
      return 1;
    }
    else if(f.getVolumeSize() == getVolumeSize())
    {
      return 0;
    }
    else
    {
    return -1;
    }
  }


  public static void main(String[] args)
  {
    Box a = new Box(2,2,2);
    Box b = new Box(3,3,3);
    Box c = new Box (1,2,3);

    System.out.println("Breite von c: " + c.getWidth());
    System.out.println("Höhe von c: " + c.getHeight());
    System.out.println("Tiefe von c: " + c.getDepth());
    System.out.println("Volumen von a: " + a.getVolumeSize());
    System.out.println("Oberflächeninhalt von a: " + a.getAreaSize());
    System.out.println("Kantenlänge von a: " + a.getEdgesLength());
    System.out.println("Ist c ein Würfel?: " + c.isCube());
    System.out.println(a.compareTo(b));
  }









}
