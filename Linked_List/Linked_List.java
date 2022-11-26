/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures;

/**
 *
 * @author DELL
 */
public class Linked_List {
    
    Node_linkedList head;
    
    public Linked_List() 
    {
        head = null;
    }
    
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    public void Insert(int newvalue)
    {
        Node_linkedList newnode = new Node_linkedList();
	newnode.data = newvalue;
        
        Node_linkedList ptr1 = null;
        Node_linkedList ptr2 = head;
        
        if (isEmpty())
        {
            head = newnode;
        }
        else if (head.data >= newvalue)
        {
            newnode.next = head;
            head = newnode;
        }
        else
        {
            while(ptr2 != null && ptr2.data <= newvalue)
            {
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
            if ( ptr2 == null)
            {
                ptr1.next = newnode;
            }
            else
            {
                newnode.next = ptr2;
                ptr1.next = newnode;
            }
        }
        
    }
    
    public void insertFirst( int newvalue)
    {
        Node_linkedList newnode = new Node_linkedList();
	newnode.data = newvalue;

	if (isEmpty())
	{
		newnode.next = null;  // First Element
		head = newnode; // newnode = first elemnt = head
	}
	else 
	{
		newnode.next = head; // already there is element
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
			Node_linkedList newnode = new Node_linkedList();
			newnode.data = newvalue;
			Node_linkedList temp = head;
			while (temp != null && temp.next.data != item)
			{
				temp = temp.next;
			}
			newnode.next = temp.next;
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
		Node_linkedList newnode = new Node_linkedList();
		newnode.data = newvalue;
		Node_linkedList temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;
		newnode.next = null;
	}
    }
    
    public boolean isFound( int key)
    {
        boolean found = false;
	Node_linkedList temp = head;
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
        Node_linkedList temp = head;
	while (temp != null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
    }
    
    public int Counter()
    {
        int counter = 0;
	Node_linkedList temp = head;
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
		Node_linkedList delptr = head;
		head = head.next;
		delptr = null;
	}
	else
	{
		Node_linkedList delptr = head;
		Node_linkedList prev = null;
		while (delptr.data != item)
		{
			prev = delptr;
			delptr = delptr.next;
		}
		prev.next = delptr.next;
		delptr = null;
	}
    }
}
