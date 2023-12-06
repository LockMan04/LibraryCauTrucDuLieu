package SinglyLinkedList;
public class NodesSingly {
    protected int data;
    protected NodesSingly link;

    public NodesSingly (){
        link = null;
        data = 0;
    }

    public NodesSingly (int data){
        link = null;
        this.data = data;
    }

    public void setData(int data){ 
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setLink(NodesSingly n){
        this.link = n;
    }

    public NodesSingly getLink() { 
        return link;
    }
}