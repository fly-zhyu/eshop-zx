package com.fly.eshop.learn.algorithms;

/**
 * 链表
 *
 * @author zhaohuayu
 * @Date 2020/3/24 17:33
 * @since 1.0
 */
public class MyLink {
    //头结点
    Node head = null;

    class Node {
        Node next = null;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public void addNode(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }


}
