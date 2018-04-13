package com.timbuchalka.myownlist;

public class MyLinkedList {
    private MyListItem head;

    public boolean addInOrder(MyListItem newItem){
        int comparing  = head.compareTo(newItem);
        if (comparing == 0) return false;
        else if(comparing > 0){

            return true;
        }
        else {

            return true;
        }
    }
}
