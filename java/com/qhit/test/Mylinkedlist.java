package com.qhit.test;

/**
 * Created by HP on 2019/4/28.
 */
public class Mylinkedlist {

    public Mylinkedlist() {
        headNode = new Node();
        Nullpiont=headNode;
    }

    private  Node headNode;
    private int  size =0;
    private  Node Nullpiont;

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public Node find(int index){
        if (index>=size||index<0){
            return null;
        }
        Node next=headNode.getNext();
         if (next==null){
             return headNode;
         }
        for (int i = 1; i <= index; i++) {
            next=next.getNext();
        }
        return  next;
    }

    public  void add(Object data){
      Node node=new Node(data);
        Nullpiont.setNext(node);
      Nullpiont=node;
      size++;
    }
     public Object get(int index){
         Node node = find(index);
         if (node!=null){
             return node.getDeta();
         }
         return null;
     }

    public void dele(int index){
        if (index==0&&size==1){
            headNode=null;
            size=0;
        } else if(index==0){
            headNode.setNext(find(index+1));
            size=size-1;
        }else if (index==size-1){
            find(index-1).setNext(null);
            size=size-1;
        }
        else {
            find(index-1).setNext(find(index+1));
            size=size-1;
        }
    }

}
