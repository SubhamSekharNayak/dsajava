import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{
	static Node head; //this means SL has a Node
	static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node cur=null, ptr=null;
		char ch='y';
		int c=0;
		while(ch=='y')
		{
			c=c+1;
			cur=new Node();
			System.out.println("enter node"+c+" data:");
			cur.data=sc.nextInt();
			cur.next=null;
			if(head==null)
			{
				head=cur;
			}
			else
			{
				ptr.next=cur;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
	}
	// static void searchDel(int ele)
	// {
	// 	if(head==null)
	// 	{
	// 		System.out.println("no elements present in the linked list");
	// 		return;
	// 	}
	// 	Node temp=null;
	// 	Node ptr=head;
	// 	if(head.data==ele)
	// 	{
	// 		System.out.println("deleted element="+head.data);
	// 		head=head.next;
	// 		return ;
	// 	}

	// 	while(ptr!=null)
	// 	{

	// 		if(ptr.data==ele)
	// 		{

	// 			break; 
	// 		}
	// 		temp=ptr;
	// 		ptr=ptr.next;


	// 	}
	// 	if(ptr.next!=null)
	// 	{
	// 		temp.next=ptr.next;
	// 	}
	// 	else
	// 	{
	// 		temp.next=null;


	// 	}

	// 	System.out.println("the entered element is successfully deleted");



	// }
	static void searchDel(int ele) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

    // Case 1: The element is at the head
		if (head.data == ele) {
			System.out.println("Deleted element: " + head.data);
			head = head.next;
        return; // Exit immediately after one deletion
    }

    // Case 2: Search for the element in the rest of the list
    Node prev = head;
    Node curr = head.next;

    while (curr != null) {
    	if (curr.data == ele) {
            // Bridging the gap: point previous node to the one after current
    		prev.next = curr.next;
    		System.out.println("Deleted element: " + ele);
            return; // Exit immediately after the first match is found
        }
        // Move both pointers forward
        prev = curr;
        curr = curr.next;
    }

    System.out.println("Element " + ele + " not found in the list.");
}

static void disp()
{
	System.out.println("elements are: ");
	Node ptr=head;
	while(ptr!=null)
	{
		System.out.println(ptr.data);
		ptr=ptr.next;
	}
}
}
class SearchDel
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.searchDel(9);
		SL.disp();


	}
}









// import java.util.*;
// class Node
// {
// 	int data;
// 	Node next;
// }
// class SL
// {
// 	static Node head; //this means SL has a Node
// 	static void create()
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Node cur=null, ptr=null;
// 		char ch='y';
// 		int c=0;
// 		while(ch=='y')
// 		{
// 			c=c+1;
// 			cur=new Node();
// 			System.out.println("enter node"+c+" data:");
// 			cur.data=sc.nextInt();
// 			cur.next=null;
// 			if(head==null)
// 			{
// 				head=cur;
// 			}
// 			else
// 			{
// 				ptr.next=cur;
// 			}
// 			ptr=cur;
// 			System.out.println("Do you want to create next, if yes then press y");
// 			ch=sc.next().charAt(0);
// 		}
// 	}
// 	static void searchDel(int ele) {
// 		if (head == null) {
// 			System.out.println("No elements present in the linked list");
// 			return;
// 		}

//     // 1. Handle the case where the head itself contains the element
//     // We use a while loop in case there are multiple matches at the start
// 		while (head != null && head.data == ele) {
// 			head = head.next;
// 		}

//     // 2. Handle the rest of the list
// 		Node curr = head;
// 		Node prev = null;

// 		while (curr != null) {
// 			if (curr.data == ele) {
//             // Bypass the current node
// 				prev.next = curr.next;
// 			} else {
//             // Only move prev forward if we didn't delete a node
// 				prev = curr;
// 			}
//         // Move current forward
// 			curr = curr.next;
// 		}

// 		System.out.println("Deletions complete (if matches were found).");
// 	}

	
// 	static void disp()
// 	{
// 		System.out.println("elements are: ");
// 		Node ptr=head;
// 		while(ptr!=null)
// 		{
// 			System.out.println(ptr.data);
// 			ptr=ptr.next;
// 		}
// 	}
// }
// class SearchDel
// {
// 	public static void main(String args[])
// 	{
// 		SL.create();
// 		SL.disp();
// 		SL.searchDel(9);
// 		SL.disp();


// 	}
// }