//Section 10, Lecture 82 challenge

package com.timbuchalka.myownlist;

public abstract class MyListItem {

    private MyListItem prevItem, nextItem;
    private Object heldValue;

    public MyListItem moveToNextItem() {
        return nextItem;
    }

    public MyListItem moveToPrevItem() {
        return prevItem;
    }

    public void setPrevItem(MyListItem prevItem) {
        this.prevItem = prevItem;
    }

    public void setNextItem(MyListItem nextItem) {
        this.nextItem = nextItem;
    }

    public Object getHeldValue() {
        return heldValue;
    }

    public void setHeldValue(Object heldValue) {
        this.heldValue = heldValue;
    }

    public abstract int compareTo(MyListItem comparedItem);

    public abstract boolean addInOrder(MyListItem newItem);
}
