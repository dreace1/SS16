public class AverageOfPositivesStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int count;
  private int sum;

  public AverageOfPositivesStrategy()
  {
    count = 0;
    sum = 0;
  }

  public void inspect(Integer ref)
  {
    if(ref > 0)
    {
      count++;
      sum += ref;
    }
  }

  public double getAverage()
  {
    return (double)sum/count;
  }




}
