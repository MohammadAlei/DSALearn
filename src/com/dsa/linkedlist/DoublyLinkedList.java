package com.dsa.linkedlist;

import java.util.Scanner;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoubleNode<Integer> dLL = takeInput();
        //printdll(dLL);
        dLL = insertDLL(dLL, 10, 3);
        printdll(dLL);
    }

    private static DoubleNode<Integer> insertDLL(DoubleNode<Integer> head, int value, int pos) {
        DoubleNode<Integer> newNode = new DoubleNode<>(value);

        if (pos == 0) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        int i = 0;
        DoubleNode<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
//            //1 2 3 10 4
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        return head;


    }

    private static void printdll(DoubleNode<Integer> head) {
        while (head != null) {
            System.out.println(head.prev + " - " + head.data + " - " + head.next);
            head = head.next;
        }
    }

    private static DoubleNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        DoubleNode<Integer> head = null, tail = null;
        //1 2 3
        while (val != -1) {
            DoubleNode<Integer> newNode = new DoubleNode<>(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                DoubleNode<Integer> temp = tail;

                tail.next = newNode;
                tail = newNode;

                tail.prev = temp;
            }
            val = sc.nextInt();
        }
        return head;
    }
}
