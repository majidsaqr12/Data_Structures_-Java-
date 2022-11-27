/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.double_linked_list;

/**
 *
 * @author DELL
 */
public class Double_Linked_List {

    public static void main(String[] args) {
        
        doubleLinkedList L1 = new doubleLinkedList();
        
        L1.Insert(10);
        L1.Insert(20);
        L1.Insert(5);
        L1.Insert(100);
        L1.insertBefore(10, 20);
        L1.Append(60);
        L1.insertFirst(20);
        L1.Delete(100);
        L1.Delete(20);
        L1.Delete(20);
        L1.Delete(20);
        L1.Display();
    }
}
