package SinglyCIrcularLinedList;

public class singlyCIrcularLinedList {
		private SCNode head,tail;
		
	public singlyCIrcularLinedList() {
		this.head=tail=null;
	}

	public SCNode gethead() {
		return head;
	}

	public void sethead(SCNode head) {
		this.head = head;
	}

	public SCNode getTail() {
		return tail;
	}

	public void setTail(SCNode tail) {
		this.tail = tail;
	}
	

	public boolean insertAtFirstint(int v)
	{
		SCNode temp = new SCNode(v);
		
		if(temp==null)
		{
			return false;
		}
		
		if(head==null)
		{
			head=tail=temp;
			temp.setNext(head);
		}
		
		else {
			temp.setNext(head);
			sethead(temp);
			tail.setNext(head);
			
		}
		return true;
	}
	
	public boolean insertAtLastint(int v)
	{
		SCNode temp = new SCNode(v);
		
		if(temp==null)
		{
			return false;
		}
		
		if(head==null)
		{
			head=tail=temp;
			temp.setNext(head);
		}
		
		else {
			tail.setNext(temp);
			temp.setNext(head);
			setTail(temp);
			
		}
		return true;
	}
	
	public void DeleteAtBeg()
	{
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else {
			sethead(head.getNext());
			tail.setNext(gethead());
		}
	}
	
	
	public void DeleteAtlast()
	{
		SCNode temp=gethead();
		if(temp==null)
		{
			System.out.println("Empty List");
		}
		else {
			
			while(temp.getNext().getNext()!=head)
			{
				temp=temp.getNext();
			}
			temp.setNext(head);
			tail=temp;
		}
	}
	
	public void Display()
	{
		SCNode temp=head;
		
		while(temp.getNext()!=head)
		{
			System.out.print(temp.getData()+"  ");
			temp=temp.getNext();		
	    }
	
	System.out.println(temp.getData());
}
}
