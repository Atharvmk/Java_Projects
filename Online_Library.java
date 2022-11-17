// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exists");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class Online_Library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("7 Habits of Highly Effective People");
        centralLibrary.addBook("Lifes Amazing Secrets");
        centralLibrary.addBook("Chanakya Neeti");
        centralLibrary.addBook("Wise and Otherwise");
        centralLibrary.showAvailableBooks();
    }
}
