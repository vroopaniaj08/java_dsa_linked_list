package Linked_list.java_dsa_linked_list;

import Linked_list.java_dsa_linked_list.list;

public class main {
    public static void main(String[] args) {
        list list = new list();
        list.insert_at_start(5);
        list.insert_at_start(8);
        list.insert_at_start(9);
        list.insert_at_start(12);
        list.insert_at_last(2);
        list.insert_at_last(1);
        list.display();
    }
}
