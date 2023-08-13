class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "has been added");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are :");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
              }
           }
        System.out.println("This book does not exist");
        }
    }
    public class Exercise4 {
        public static void main(String[] args) {
            // You have to implement a library using java class Library
            // Methods : addBooks,issueBook, returnBook,showAvailableBooks
            // Properties Array to store the available books,
            //Array to store the issue books

            Library l = new Library();
            l.addBooks("C++ books");
            l.addBooks("Java with oops");
            l.addBooks("Algorithms");
            l.showAvailableBooks();
            l.issueBook("c++");
        }
    }
