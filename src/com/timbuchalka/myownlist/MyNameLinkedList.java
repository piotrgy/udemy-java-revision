package com.timbuchalka.myownlist;

public class MyNameLinkedList {
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

        do {
            int comparing = head.compareTo(newItem);
            if (comparing == 0) {
                System.out.println("The same item, as the new one already exists on the list.");
                return false;
            } else if (comparing > 0) {
                if (head.moveToPrevItem() == null) {
                    head.setPrevItem(newItem);
                    System.out.println("Item is added at the beginning of the list.");
                } else {
                    head.moveToPrevItem().setNextItem(newItem);
                    System.out.println("Item is added to the list.");
                }
                newItem.setNextItem(head);
                return true;
            } else {
                head = head.moveToNextItem();
            }
        } while (head.moveToNextItem() != null);
        head.setNextItem(newItem);
        newItem.setPrevItem(head);
        return true;
    }

    public void remove() {
        head.moveToPrevItem().setNextItem(head.moveToNextItem());
    }
}
