import java.util.*;
class Node
{
	int data;
	Node next;
}
class CL
{
	static Node head; //this means CL HAS Node
	static Node ptr;
	static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node cur=null;
			char ch='y';
			int c=0;
			while(ch=='y')
			{
				c=c+1;
				cur=new Node();
				System.out.println("enter node"+c+" data:");
				cur.data=sc.nextInt();
				cur.next=cur;
				if(head==null)
				{
					head=cur;
				}
				else{
					ptr.next=cur;
					cur.next=head;
				}
				ptr=cur;
				System.out.println("Do you want to create next, if yes then press y");
				ch=sc.next().charAt(0);
			}
	}
	static void disp()
	{
		System.out.println("elements are: ");
		ptr=head;
		System.out.println(ptr.data);
		ptr=ptr.next;


		do
		{
			System.out.println(ptr.data);
			ptr=ptr.next;

		}
		while(ptr!=head.next);

	}

}
class CircularLL
{
	public static void main(String args[])
	{
		CL.create();
		CL.disp();
		
		

	}
}









// import java.util.*;

// class Node {
//     int data;
//     Node next;
// }

// class CL {
//     static Node head; 
//     static Node ptr;

//     static void create() {
//         Scanner sc = new Scanner(System.in);
//         Node cur;
//         char ch = 'y';
//         int c = 0;

//         while (ch == 'y') {
//             c++;
//             cur = new Node();
//             System.out.println("Enter node " + c + " data:");
//             cur.data = sc.nextInt();

//             if (head == null) {
//                 head = cur;
//                 cur.next = head; // Point to itself to establish circularity early
//             } else {
//                 ptr.next = cur;  // Last node points to new node
//                 cur.next = head; // New node points back to head
//             }
//             ptr = cur; // Update ptr to the newly added node (the current last node)

//             System.out.println("Do you want to create next? (y/n)");
//             ch = sc.next().charAt(0);
//         }
//     }

//     static void disp() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }

//         System.out.println("Elements in the list (one full cycle):");
//         ptr = head;
//         do {
//             System.out.print(ptr.data + " -> ");
//             ptr = ptr.next;
//         } while (ptr != head);
//         System.out.println("(Back to Head: " + head.data + ")");
//     }

//     // THIS PROVES THE CIRCULAR PROPERTY
//     static void proveCircular(int steps) {
//         if (head == null) return;

//         System.out.println("\n--- PROVING CIRCULAR PROPERTY ---");
//         System.out.println("Following the 'next' pointer " + steps + " times continuously:");
        
//         ptr = head;
//         for (int i = 0; i < steps; i++) {
//             System.out.print("[" + ptr.data + "] -> ");
//             ptr = ptr.next; // This will never hit null; it just keeps looping
//         }
//         System.out.println("... (Infinite Loop possible)");
//     }
// }

// class CircularLL {
//     public static void main(String args[]) {
//         CL.create();
//         CL.disp();
        
//         // This shows the property: we visit more nodes than we actually created
//         CL.proveCircular(10); 
//     }
// }