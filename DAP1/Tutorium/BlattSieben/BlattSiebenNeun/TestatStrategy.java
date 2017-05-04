public class TestatStrategy
extends DoublyLinkedList.DeletionStrategy<Integer>
{
  private int count;

  public TestatStrategy()
  {
    count = 0;
  }

  public boolean select(Integer ref)
  {
    if(count == 0||count % 3 == 0)
    {
      count++;
      return true;
    }
    else
    {
      count++;
      return false;
    }
  }



}
