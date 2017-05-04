public class RemoveAllInIntervalStrategy
extends DoublyLinkedList.DeletionStrategy<Integer>
{
  private int bottom, top;

  public RemoveAllInIntervalStrategy(int bottom,int top)
  {
    this.bottom = bottom;
    this.top = top;
  }

  public boolean select(Integer ref)
  {
    return ref >= bottom && ref <= top;
  }




}
