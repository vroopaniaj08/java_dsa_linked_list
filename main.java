package Linked_list.java_dsa_linked_list;

import Linked_list.java_dsa_linked_list.list;

public class main {
    public static void main(String[] args) {
        list list = new list();
        list.insert_at_start(5);            // insert_at_start
        list.insert_at_start(8);            // insert_at_start
        list.insert_at_start(9);            // insert_at_start
        list.insert_at_start(12);           // insert_at_start
        list.insert_at_last(2);             // insert_at_last
        list.insert_at_last(1);             // insert_at_last
        list.insert_at_middle(11,1);  // insert_at_middle
        list.display();                          // display
        System.out.println(list.delete_from_starting());             // delete_from_starting
        System.out.println(list.delete_from_starting());             // delete_from_starting
        list.display();                          // display
        list.delete_from_starting();             // delete_from_starting
        list.delete_from_starting();             // delete_from_starting
        list.delete_from_starting();             // delete_from_starting
//        list.delete_from_starting();             // delete_from_starting
//        list.delete_from_starting();             // delete_from_starting
//        list.delete_from_starting();             // delete_from_starting
        list.display();                          // display
        list.delete_from_last();
        list.display();
    }
}
