package LinearLinkedList;

public class LinkedList1
{
	Node head;
	
	public void InsertElement(int value)
	{
		Node newNode = new Node(value);
		
		if(head==null)
		{
			head = newNode;
		}
		
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next =newNode ;
		}
	}
	
	public void Display()
	{
		Node temp = head;
		while(temp.next != null)
		{
			System.out.println(temp.data +" ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
