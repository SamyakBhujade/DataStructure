package LinearLinkedList;

public class operations {
	private Node head;
	
	public operations() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	
	public boolean insertElementAtFirst(int num)
	{
		Node temp= new Node(num);
		
		if(temp==null)
		{
			return false;
		}
		if(head==null)
		{
			head=temp;
		}
		
		else
		{
			temp.setNext(getHead());
			head=temp;
			
		}
		return true;
	}

	
	public void Display() {
		Node temp=getHead();
		
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}

}
