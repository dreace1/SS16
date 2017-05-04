public class TestatSumOfSecondStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int count;
  private int sum;

  public TestatSumOfSecondStrategy()
  {
    count = 1;
    sum = 0;
  }

  public void inspect(Integer ref)
  {
    if(count % 2 == 0)
    {
      count++;
      sum += ref;
    }
    else
    {
      count++;
    }
  }

  public int getSum()
  {
    return sum;
  }




}
