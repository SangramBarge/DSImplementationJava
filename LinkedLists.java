



public class LinkedLists {

	Node head;
	public void insert(int data){
		Node node = new Node();
		node.data = data;
		//check if this is the first node
		if(head == null){
			head = node;
		}else {
			Node n = head;
			if(n.next !=null){
				n = n.next;
			}
			n.next = node;
		}
	}

	
	public void reverse(){
		
		Node curr = head;
		Node prev = null;
		Node next = null ;
		while(curr !=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		//print reverse linkedlist
		show();		
	}
	
	public void show(){
		Node node = head;
		while(node.next!=null){
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}