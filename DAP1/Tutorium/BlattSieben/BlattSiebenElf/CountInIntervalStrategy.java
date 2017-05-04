public class CountInIntervalStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int bottom, top;
  private int count;

  public CountInIntervalStrategy(int bottom, int top)
  {
    this.bottom = bottom;
    this.top = top;
    count = 0;
  }

  public void inspect(Integer ref)
  {
    if(ref >= bottom && ref <= top)
    {
      count++;
    }
  }

  public int getCount()
  {
    return count;
  }




}
