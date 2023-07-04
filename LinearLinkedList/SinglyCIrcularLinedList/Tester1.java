package SinglyCIrcularLinedList;

public class Tester1 {

	public static void main(String[] args) {
		singlyCIrcularLinedList x= new singlyCIrcularLinedList();
		x.insertAtFirstint(10);
		x.insertAtFirstint(20);
		x.insertAtFirstint(30);
		x.Display();
		System.out.println();
		x.insertAtLastint(40);
		x.Display();
		x.DeleteAtBeg();
		x.Display();
		x.DeleteAtlast();
		x.Display();
	}

}
