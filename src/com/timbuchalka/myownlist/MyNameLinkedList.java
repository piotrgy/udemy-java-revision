package com.timbuchalka.myownlist;

public class MyNameLinkedList {
    private MyListItem head;

    public boolean addInOrder(MyListItem newItem) {
        if (head == null) {
            head = newItem;
            System.out.println("This is first item added to the list.");
            return true;
        }

        goToBeginning();

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
                    newItem.setPrevItem(head.moveToPrevItem());
                    head.moveToPrevItem().setNextItem(newItem);
                    head.setPrevItem(newItem);
                    System.out.println("Item is added to the list.");
                }
                newItem.setNextItem(head);
                return true;
            } else {
                if (head.moveToNextItem() == null) {
                    head.setNextItem(newItem);
                    System.out.println("Item is added to the list.");
                    return true;
                }
                head = head.moveToNextItem();
            }
        } while (head.moveToNextItem() != null);
        head.setNextItem(newItem);
        newItem.setPrevItem(head);
        System.out.println("Item is added to the list.");
        return true;
    }

    private void goToBeginning() {
        while (head.moveToPrevItem() != null) {
            head = head.moveToPrevItem();
        }
    }

    public void remove() {
        if (head.moveToNextItem() != null) {
            head.moveToPrevItem().setNextItem(head.moveToNextItem());
            head.moveToNextItem().setPrevItem(head.moveToPrevItem());
            System.out.println("Item " + head.getHeldValue() + " removed.");
            head = head.moveToPrevItem();
        }else {
            System.out.println("Item " + head.getHeldValue() + " removed.");
            head = head.moveToPrevItem();
            head.setNextItem(null);
        }
    }

    public void showAll() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        goToBeginning();
        byte counter = 1;
        do {
            System.out.println(counter + ". " + head);
            counter ++;
            head = head.moveToNextItem();
        } while (head.moveToNextItem() != null);
    }

}
