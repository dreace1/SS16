public class CountInIntervalStrategy
extends DoublyLinkedList.InspectionStrategy<Integer>
{
  private int bottom, top;
  private int count;

  public CountInIntervalStrategy(int bottom, int top)
  {
    this.bottom = bottom;
    this.top = top;
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
