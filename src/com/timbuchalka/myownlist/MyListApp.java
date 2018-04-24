package com.timbuchalka.myownlist;

public class MyListApp {
    public static void main(String[] args) {
        MyNameLinkedList nameLinkedList = new MyNameLinkedList();

        String stringData = "Justa Zenek Antek Zenek Janina Franek Andzia";
        String[] data = stringData.split(" ");

        for (String s : data) {
            NameListItem nameListItem = new NameListItem(s);
            nameLinkedList.addInOrder(nameListItem);
        }
        nameLinkedList.showAll();
        nameLinkedList.remove();
        nameLinkedList.showAll();

    }
}
