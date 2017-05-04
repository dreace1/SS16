public class AverageOfPositivesStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int sum;
  private int count;

  public void inspect(Integer ref)
  {
    if(ref > 0)
    {
      sum += ref;
      count++;
    }
  }

  public double getAverage()
  {
    return (double)sum/count;
  }




}
