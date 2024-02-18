public class List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(5);
        list.show();
    }
}
class LinkedList{
    Node heaNode;
    void insert(int d){
        Node node = new Node();
        node.data=d;
        if(heaNode==null){
            heaNode=node;
        }else{
            Node n =heaNode;
            while (n.next!=null) {
                n=n.next;
            }
            n.next=node;
        }
    }
    void show(){
        Node n=heaNode;
        while(n.next!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.err.print(n.data);
    }
}