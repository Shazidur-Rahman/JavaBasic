

public class LinkedListBasic {
    private Node head;
    private Node tail;

    private int size;

    public LinkedListBasic() {
        this.size = 0;
    }

    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(String val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(String val) {
        Node node = new Node(val);

        if(tail == null){
            insertFirst(val);
            return;
        }

        tail.next = node;
        node = tail;
        size++;
    }

    public void showVal(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertMiddle(String val, int index){
        if ( index == 0){
            insertFirst(val);
        }
        else if( index == size ){
            insertLast(val);
        }
        else{
            Node temp = head;
            for (int i=1; i<index; i++){
                temp=temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next=node;
            size++;

        }
    }

    public void deleteFirst(){
        String val = head.data;
        head = head.next;
        if( head == null ){
            tail=null;
        }
        size--;
    }

    public Node get(int index){
        Node node = head;
        for (int i=0; i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void deleteLast(){
        if (size<=1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        String val = tail.data;
        tail = secondLast;
        tail.next = null;

    }
    public void deleteMiddle(int index){
        if (index==0){
            deleteFirst();
        }
        else if (index == (size - 1)){
            deleteLast();
        }
        else{
           Node prev = get(index -1);
           String val = prev.next.data;
           prev.next = prev.next.next;
        }

    }

    public static void main(String[] args) {
        LinkedListBasic list = new LinkedListBasic();
        list.insertFirst("1");
        list.insertFirst("2");
        list.insertFirst("3");
        list.insertFirst("4");
        list.insertFirst("5");

        list.showVal();

        list.insertLast("7");
        list.insertMiddle("6",5);

        list.deleteFirst();
        list.showVal();

        list.deleteLast();
        list.showVal();

        list.deleteMiddle(3);
        list.showVal();

    }
}
