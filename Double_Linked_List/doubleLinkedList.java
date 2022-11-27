/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.double_linked_list;

/**
 *
 * @author DELL
 */
public class doubleLinkedList {
    
    Node head;
    
    public doubleLinkedList()
    {
        head = null;
    }
    
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    public void Insert(int newvalue)
    {
        Node newnode = new Node();
        newnode.data = newvalue;        
        Node ptr = head;
        
        if ( isEmpty())
        {
            head = newnode;
        }
        else if (head.data >= newvalue)
        {
            newnode.next = head;
            head.prev = newnode;
            newnode.prev = null;
            head = newnode;
        }
        else
        {
            while(ptr.next != null && ptr.data <= newvalue)
            {
                ptr = ptr.next;
            }
            
            if( ptr.data >= newvalue )
            {
                newnode.next = ptr;
                newnode.prev = ptr.prev;
                ptr.prev.next = newnode;
                ptr.prev = newnode;
            }
            else
            {
                ptr.next = newnode;
                newnode.prev = ptr;
                newnode.next = null;
            }
        }
    }
    
    public void insertFirst( int newvalue)
    {
        Node newnode = new Node();
	newnode.data = newvalue;

	if (isEmpty())
	{
		newnode.next = null;  // First Element
                newnode.prev = null;
		head = newnode; // newnode = first elemnt = head
	}
	else 
	{
		newnode.next = head; // already there is element
                head.prev = newnode;
		head = newnode;
	}
    }
    
     public void insertBefore( int item , int newvalue )
    {
        
	if (isEmpty())
	{
		System.out.println("The List Is Empty , Your Value Is The First Item ");
		insertFirst(newvalue);
	}
	else
	{
            if (isFound(item))
            {
                Node newnode = new Node();
                newnode.data = newvalue;
		Node temp = head;
		while (temp != null && temp.next.data != item)
                    {
                        temp = temp.next;
                    }
                    newnode.next = temp.next;
                    newnode.prev = temp;
                    temp.next.prev = newnode;                    
                    temp.next = newnode;
            }
		else
		{
			System.out.println("This Item Is Not Found");
		}
	}
    }
     
    public void Append(int newvalue)
    {
        if (isEmpty())
	{
            System.out.println("The List Is Empty , Your Value Is The First Item ");
            insertFirst(newvalue);
	}
	else
	{
		Node newnode = new Node();
		newnode.data = newvalue;
		Node temp = head;
		while (temp.next != null)
		{
                    temp = temp.next;
		}
		temp.next = newnode;
                newnode.prev = temp;
		newnode.next = null;
	}
    }
     
    public boolean isFound( int key)
    {
        boolean found = false;
	Node temp = head;
	while (temp != null)
	{
		if (temp.data == key)
		{
			found = true;
		}	
		temp = temp.next;
	}
	return found;
    }
    
    public void Display()
    {
        Node temp = head;
	while (temp != null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
    }
    
    public int Counter()
    {
        int counter = 0;
	Node temp = head;
	while (temp != null)
	{
            counter++;
            temp = temp.next;
	}
	return counter;
    }
    
    public void Delete( int item )
    {
        if (isEmpty())
	{
            System.out.println("This List Is Empty , No Thing To Delete");
	}
	if (head.data == item)
	{
            Node delptr = head;
            head = head.next;
            head.prev = null;
            delptr = null;
	}
	else
	{
            Node delptr = head;
            Node prev = null;
            
            while (delptr.data != item)
		{
                    prev = delptr;
                    delptr = delptr.next;
		}
            
            prev.next = delptr.next;
            delptr.next.prev = prev;
            delptr = null;
	}
    }
}
