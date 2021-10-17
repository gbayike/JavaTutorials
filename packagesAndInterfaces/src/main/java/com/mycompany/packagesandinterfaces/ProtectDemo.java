/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.packagesandinterfaces;

/**
 *
 * @author Olugbayike
 */
public class ProtectDemo {
    public static void main(String[] args) {
        BookExt books[] = new BookExt[5];
        
        books[0] = new BookExt("Java: A Beginners Guide", "Schildt", 2018, "Oracle Press");
        books[1] = new BookExt("Java: The Complete Reference", "Schildt", 2018, "Oracle Press");
        books[2] = new BookExt("Introducing JavaFX 8 Programming", "Schildt", 2018, "Oracle Press");
        books[3] = new BookExt("Red Storm Rising", "Clancy", 1986,"PutNam");
        books[4] = new BookExt("On the Road", "Kerouac", 1955, "Viking");
        
        // Find books by author
        System.out.println("Showing all books by Schildt.");
        for(int i = 0;i<books.length; i++)
            if(books[i].getAuthor() == "Schildt")
                System.out.println(books[i].getTitle());
        
        // books[0].title = "test title"; // Error - not accessible
    }
}
