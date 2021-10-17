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
public class BookExt extends bookpack.Book{
    private String publisher;

    public BookExt(String title, String author, int pubDate, String publisher) {
        super(title, author, pubDate);
        this.publisher = publisher;
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // These are OK because subclasses can acces a protected number.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }
    
    
}
