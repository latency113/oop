class Book {
    String bookId;
    String title;
    String author;
    double price;

    public Book() {
        this.bookId = "13u2132";
        this.title = "dada";
        this.author = "TEST";
        this.price = 132.32;
    }

    public Book(String bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo() {
        System.out.println("BookId : " + bookId);
        System.out.println("title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

}
