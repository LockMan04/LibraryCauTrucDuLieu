package DoublyLinkedList;
public class Nodes {
    protected int data;
    protected Nodes next, prev;   

    public Nodes(){
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    public Nodes(int data, Nodes next, Nodes prev){ 
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setLinkNext(Nodes next) {
        this.next = next;
    }

    public void setLinkPrev(Nodes prev) {
        this.prev = prev;
    }

    public Nodes getLinkNext(){
        return next;
    }

    public Nodes getLinkPrev(){ 
        return prev;
    }
}
