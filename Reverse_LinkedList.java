class Reverse_LinkedList{
     Node head;
	 Node tail;
	 static class Node{
	 int data;
	 Node next;
	 Node(int d){
		data=d;
        next=null;		
	   }
	 }
	 void add(int i){
		 Node k=new Node(i);
		if(head==null){
			head=k;
			tail=k;
		}else{
			tail.next=k;
			tail=k;
		}
	 }
    void display(){
		Node k=head;
		if(k==null){
		System.out.println("Linkedlist is empty..!");
        return;		
		}
		while(k!=null){
		System.out.println(k.data+" ");	
		k=k.next;
		}
	}
	void reverse(Node n){
		if(n==null){
			System.out.println("Linkedlist is empty..!");
        return;			
		}
		if(n.next==null){
	     System.out.println(n.data+" ");
        return;		 
		}
		reverse(n.next);
		 System.out.println(n.data+" ");
	}
	int count_element(){
		Node j=head;
		int count=0;
		while(j!=null){
			j=j.next;
			count++;
		}
		return count;
	}
  
  public static void main(String [] argsss){
     Reverse_LinkedList l1=new Reverse_LinkedList();
	 l1.add(1);
	 l1.add(2);
	 l1.add(3);
	 l1.add(4);
	 l1.add(5);
	// l1.display();
	  System.out.println("First testcase:");
	  System.out.println("The number of elements in the linked list is: "+l1.count_element());
	  System.out.println("Reverse element is ::");
	  l1.reverse(l1.head);
	  l1.add(3);
	 l1.add(4);
	 l1.add(2);
	 l1.add(5);
	// l1.display();
	  System.out.println();
	  System.out.println("Second testcase:");
	  System.out.println("The number of elements in the linked list is: "+l1.count_element());
	  System.out.println("Reverse element is ::");
	   
	  l1.reverse(l1.head);
  }
  }