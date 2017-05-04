public class TestatStrategy
extends DoublyLinkedList.DeletionStrategy<Integer>
{
  private int count;
  private int quantity;

  public TestatStrategy()
  {
    count = 1;
    quantity = 0;
  }

  public boolean select(Integer ref)
  {
    if(count == 1||count % 3 == 0)
    {
      count++;
      quantity++;
      return true;
    }
    else
    {
      count++;
      return false;
    }
  }

  public int getQuantity()
  {
    return quantity;
  }




}
