package Lista11;

public class Node {

    int val;
    Node next;

    public Node(int val){
        this.val = val;
        next = null;
    }

    public void add(int wrtDoDodania){
        Node nowyNode = new Node(wrtDoDodania);

        Node pozycja = this;
        while (pozycja.next != null){
            pozycja = pozycja.next;
        }

        pozycja.next = nowyNode;
    }

    public void show(){

        Node pozycja = this;
        while (pozycja.next != null){
            System.out.println(pozycja.val);
            pozycja = pozycja.next;
        }

        System.out.println(pozycja.val);

    }

}