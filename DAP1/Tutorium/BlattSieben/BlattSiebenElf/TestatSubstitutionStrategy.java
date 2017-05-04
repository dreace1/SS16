public class TestatSubstitutionStrategy
extends DoublyLinkedList.SubstitutionStrategy<Integer>
{
  public Integer substitute(Integer ref)
  {
    if(ref % 2 == 0)
    {
      return ref*2;
    }
    else
    {
      return ref;
    }
  }







}
