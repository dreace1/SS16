public class DoubleAllInIntervalStrategy
extends DoublyLinkedList.SubstitutionStrategy<Integer>
{
  private int bottom, top;

  public DoubleAllInIntervalStrategy(int bottom, int top)
  {
    this.bottom = bottom;
    this.top = top;
  }

  public Integer substitute(Integer ref)
  {
    if(ref >= bottom && ref <= top)
    {
      return ref*2;
    }
    else
    {
      return ref;
    }
  }




}
