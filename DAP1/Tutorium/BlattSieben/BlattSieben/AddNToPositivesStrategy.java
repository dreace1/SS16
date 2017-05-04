public class AddNToPositivesStrategy
extends DoublyLinkedList.SubstitutionStrategy<Integer>
{
  private int n;

  public AddNToPositivesStrategy(int n)
  {
    this.n = n;
  }

  public Integer substitute(Integer ref)
  {
    if(ref > 0)
    {
      return ref + 1;
    }
    else
    {
      return ref;
    }
  }




}
