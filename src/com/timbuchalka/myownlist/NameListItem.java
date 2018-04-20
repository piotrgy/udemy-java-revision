package com.timbuchalka.myownlist;

public class NameListItem extends MyListItem {

    public NameListItem(String name) {
        super.setHeldValue(new String(name));
    }

    @Override
    public int compareTo(MyListItem comparedItem) {
        String heldValue = (String) this.getHeldValue();
        return heldValue.compareToIgnoreCase((String) comparedItem.getHeldValue());
    }

    @Override
    public String toString() {
        return (String) getHeldValue();
    }
}
