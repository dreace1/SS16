public class AverageOfPositivesStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int sum;
  private int count;

  public void inspect(Integer ref)
  {
    if(ref > 0)
    {
      count++;
      sum+= ref;
    }
  }

  public double getSum()
  {
    return (double)sum/count;
  }




}
