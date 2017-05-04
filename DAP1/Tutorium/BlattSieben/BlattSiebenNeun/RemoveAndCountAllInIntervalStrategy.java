public class RemoveAndCountAllInIntervalStrategy
extends DoublyLinkedList.DeletionStrategy<Integer>
{
  private int bottom, top;
  private int count;

  public RemoveAndCountAllInIntervalStrategy(int bottom, int top)
  {
    this.bottom = bottom;
    this.top = top;
    count = 0;
  }

  public boolean select(Integer ref)
  {
    if(ref >= bottom && ref <= top)
    {
      count++;
      return true;
    }
    else
    {
      return false;
    }
  }

  public int getCount()
  {
    return count;
  }





}
