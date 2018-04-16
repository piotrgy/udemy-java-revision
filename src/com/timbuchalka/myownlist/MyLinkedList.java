package com.timbuchalka.myownlist;

public class MyLinkedList {
    private MyListItem head;

    public boolean addInOrder(MyListItem newItem){
        int comparing = head.compareTo(newItem);
        if (comparing == 0) {
            System.out.println("The same item, as the new one already exists on the list.   ");
            return false;
        }
        else if(comparing > 0){
            while (/*head.compareTo()*/){}

            return true;
        }
        else {

            return true;
        }
    }
}
