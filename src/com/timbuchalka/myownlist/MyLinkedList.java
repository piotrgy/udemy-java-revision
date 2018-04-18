package com.timbuchalka.myownlist;

public class MyLinkedList {
    private MyListItem head;

    public boolean addInOrder(MyListItem newItem) {
        if (head == null) {
            head = newItem;
            System.out.println("This is first item added to the list.");
            return true;
        }

        while (head.moveToPrevItem() != null) {
            head = head.moveToPrevItem();
        }

        int comparing = head.compareTo(newItem);
        if (comparing == 0) {
            System.out.println("The same item, as the new one already exists on the list.");
            return false;
        }
        else if (comparing > 0) {
            head.moveToPrevItem().setNextItem(newItem);
            newItem.setNextItem(head);
            return true;
        } else {

            return true;
        }
    }
}
