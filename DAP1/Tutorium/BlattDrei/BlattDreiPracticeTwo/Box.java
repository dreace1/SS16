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

  public double getVolumenSize()
  {
    return width * depth * height;
  }

  public double getAreaSize()
  {
    return 2*(width * depth + depth * height + width * height);
  }

  public double getEdgesLength()
  {
    return 4*(width + depth + height);
  }

  public boolean isCube()
  {
    return (width == height && width == depth);
  }

  public int compareTo(Box f)
  {
    if(getVolumenSize() > f.getVolumenSize())
    {
      return 1;
    }
    else if(getVolumenSize() == f.getVolumenSize())
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
		// teste alle moeglichen Kombinationen
		return (width >= f.width  && height >= f.height && depth >= f.depth)
			|| (width >= f.width  && height >= f.depth  && depth >= f.height)
			|| (width >= f.height && height >= f.width  && depth >= f.depth)
			|| (width >= f.height && height >= f.depth  && depth >= f.width)
			|| (width >= f.depth  && height >= f.width  && depth >= f.height)
			|| (width >= f.depth  && height >= f.height && depth >= f.width);
	}



  public static void main(String[] args)
  {
    Box a = new Box(2,2,2);
    Box b = new Box(3,3,3);
    Box c = new Box(1,2,3);
    System.out.println("Volumen von c: " + c.getVolumenSize());
    System.out.println("Oberflächeninhalt von c: " + c.getAreaSize());
    System.out.println("Kantenlaenge von c: " + c.getEdgesLength());
    System.out.println("Ist c ein Würfel?: " + c.isCube());
    System.out.println("Ist a ein Würfel?: " + a.isCube());
    System.out.println("passt b in a?: " + a.encloses(b));
    



  }








}
