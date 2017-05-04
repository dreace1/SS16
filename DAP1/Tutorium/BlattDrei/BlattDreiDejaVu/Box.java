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
    return 2 * (width * depth + height * depth + width * height);
  }

  public double getEdgesLength()
  {
    return 4 * (width + depth + height);
  }

  public boolean isCube()
  {
    if(width == height && height == depth)
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
    if(getVolumeSize() > f.getVolumeSize())
    {
      return 1;
    }
    else if(getVolumeSize() == f.getVolumeSize())
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
    Box b = new Box(1,1,1);
    Box c = new Box(1,2,3);

    System.out.println(c.getVolumeSize());
    System.out.println(c.getAreaSize());
    System.out.println(c.getEdgesLength());
    System.out.println(b.compareTo(a));
    System.out.println(c.isCube());

  }






}
