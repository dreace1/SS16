public class AverageOfPositivesStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int sum;
  private int count;

  public AverageOfPositivesStrategy()
  {
    sum = 0;
    count = 0;
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
