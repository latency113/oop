//
//
//class Book {
//    private String title;
//    private String author;
//    private Double price;
//
//    public String getTitle(){
//        return this.title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        if (price >= 0) {
//            this.price = price;
//        }
//        else {
//            System.out.println("ห้ามติดลบ !!!");
//        }
//    }
//
////    public Book() {
////        this.title = "A";
////        this.author = "AU";
////        this.price = 20.00;
////    }
//
////    public Book(String title, String author, Double price) {
////        this.title = title;
////        this.author = author;
////        this.price = price;
////    }
//
//    void showInfo() {
//        System.out.println("Title : " + getTitle());
//        System.out.println("Author : " + getAuthor());
//        System.out.println("Price : " + getPrice());
//    }
//}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("6000","Jaidee",20,3.50);
        student1.printInfo();
        System.out.println("-------");
        student2.printInfo();
//        --------------

        Book book1 = new Book();
        System.out.println("--------");
        System.out.println("Book");
        System.out.println("--------");
        book1.printInfo();
        Book book2 = new Book("B001","Java Programming","John Smith",450.00);
        System.out.println("--------");
        book2.printInfo();
    }
}