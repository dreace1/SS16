public class RemoveAllNegativesStrategy
extends DoublyLinkedList.DeletionStrategy<Integer>
{
	public boolean select(Integer ref)
	{
		return ref < 0;
	}




}
