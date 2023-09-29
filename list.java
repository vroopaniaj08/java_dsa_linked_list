package Linked_list.java_dsa_linked_list;

public class list {
    private node head;
    private node tail;
    private int size;
    public list (){
        this.size = 0;
    }
    public node insert_at_start(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
        if (tail == null){
            tail = head;
        }
        size +=1;
        return head;
    }
    public void insert_at_last(int data){
        if(tail == null){
            insert_at_start(data);
            return;
        }
        node newnode = new node (data);
        tail.next = newnode;
        tail = newnode;
        size++;
    }
    public void insert_at_middle(int data,int index){
        if(index == 0){
            insert_at_start(data);
            return;
        }
//        if(index == size){
//            insert_at_last(data);
//            return;
//        }
        node temp = head;
        node newnode = new node(data,temp.next);
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }
    public int delete_from_starting(){
        if(head == null){
            System.out.println("linked list is empty");
            return -1;
        }
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int delete_from_last(){
        if(size <= 1){
            return delete_from_starting();
        }
        node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete_from_index(int index){
        if(index == 0){
            return delete_from_starting();
        }
        if(index == size -1){
            return delete_from_last();
        }
        node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public node get (int index){
        node newnode = head;
        for (int i=0;i<index;i++){
            newnode = newnode.next;
        }
        return newnode;
    }
    public void display(){
        node temp = head;
        for (int i=0;i<size;i++){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    private  class node {
        private int value;
        private node next;
        public node (int val){
            this.value = val;
        }
        public node (int val, node next){
            this.value = val;
            this.next = next;
        }
    }
}