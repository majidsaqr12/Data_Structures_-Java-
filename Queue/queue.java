/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

/**
 *
 * @author majidsaqr
 */
public class queue {
    
    public Node front;
    public Node rear;
    
    public queue()
    {
        front = rear = null;
    }
    
    public boolean isEmpty()
    {
        return (front == null);
    }
    
    public void Enqueue(int newvalue)
    {
        Node newnode = new Node();
        newnode.data = newvalue;
        
        if(isEmpty())
        {
            front = newnode;
            rear = newnode;
        }
        else
        {
            rear.next = newnode;
            rear = newnode;
        }
    }
    
    public void Display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty , no thing to print");
        }
        else
        {
            Node ptr = front;
            while(ptr != null)
            {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
    
    public int Dequeue()
    {
        int delvalue = -1;
        if (isEmpty())
        {
            System.out.println("Queue is empty , no thing to delete");
        }
        else if (front == rear)
        {
            front = rear = null;  
        }
        else
        {
            Node ptr = front;
            front = front.next;
            delvalue = ptr.data;
            ptr = null;
        }
        return delvalue;
    }
    
    public int getFront()
    {
        return front.data;
    }
    
    public int grtRear()
    {
        return rear.data;
    }
    
    public int Count()
    {
        int count = 0;
        Node ptr = front;
        while(ptr != null)
        {
            count++;
            ptr = ptr.next;
        }
        return count;
    }
    
    public boolean isFound(int value)
    {
        boolean found = false;
        Node ptr = front;
        while(ptr!=null)
        {
            if(ptr.data==value)
            {
                found = true;
            }
            ptr = ptr.next;
        }
        return found;   
    }
    
    public void Clear()
    {
        while(!isEmpty())
        {
            Dequeue();
        }
    }
}
