import java.util.*;
class Node
{
	int data;
	Node next;
}
class NodeTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null, cur=null, ptr=null;
		char ch='y';
		int c=0;
		while(ch=='y')
		{
			c=c+1;
			cur=new Node();
			System.out.println("enter node: "+c+" data");
			cur.data=sc.nextInt();
			cur.next=null;
			if(head==null)
			{
				head=cur;
			}
			else{
				ptr.next=cur;
			}
			ptr=cur;
			System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
		}
		System.out.println("elements are: ");
		ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}

	}
}



// import java.util.*;

// class Node {
//     int data;
//     Node next;

//     // Adding a constructor simplifies node creation
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class NodeTest {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Node head = null, ptr = null;
//         char ch = 'y';
//         int count = 0;

//         while (ch == 'y' || ch == 'Y') {
//             System.out.print("Enter node " + (++count) + " data: ");
//             int value = sc.nextInt();
            
//             Node cur = new Node(value);

//             if (head == null) {
//                 head = cur; // First node becomes the head
//             } else {
//                 ptr.next = cur; // Link the previous node to the new one
//             }
//             ptr = cur; // Move the pointer to the new end of the list

//             System.out.print("Continue? (y/n): ");
//             ch = sc.next().charAt(0);
//         }

//         // Displaying the list
//         System.out.println("\nLinked List Elements:");
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("NULL");
        
//         sc.close();
//     }
// }