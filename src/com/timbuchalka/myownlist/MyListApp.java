package com.timbuchalka.myownlist;

public class MyListApp {
    public static void main(String[] args) {
        MyNameLinkedList nameLinkedList = new MyNameLinkedList();

        String stringData = "Antek Janina Zenek Franek Andzia Justa";
        String[] data = stringData.split(" ");

        for (String s : data) {
            NameListItem nameListItem = new NameListItem(s);
            nameLinkedList.addInOrder(nameListItem);
        }
        nameLinkedList.showAll();

    }
}
