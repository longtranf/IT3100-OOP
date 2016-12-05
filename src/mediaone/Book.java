/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaone;

/**
 *
 * @author Administrator
 */
public class Book extends Product {

    private String author;
    private String publisher;
    
    public Book() {
        
    }

    public Book(String author, String publisher, String name, int quantity, int price) {
        super(name, quantity, price);
        this.author = author;
        this.publisher = publisher;
    }

    public Book(String author, String publisher, String name, int quantity, int price, int sold) {
        super(name, quantity, price, sold);
        this.author = author;
        this.publisher = publisher;
    }
    
    public void setInfor(String author, String publisher, int price) {

        this.author = author;
        this.publisher = publisher;
        this.price = price;

    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void addBook() {

    }

}
