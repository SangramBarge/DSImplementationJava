



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

	public void show(){
		Node node = head;
		while(node.next!=null){
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}


}