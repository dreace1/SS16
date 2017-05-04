public class RemoveAndCountAllInIntervalStrategy
extends DoublyLinkedList.DeletionStrategy<Integer>
{
    private int top, bottom;
    private int count;

    public RemoveAndCountAllInIntervalStrategy(int bottom, int top)
    {
      this.top = top;
      this.bottom = bottom;
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
