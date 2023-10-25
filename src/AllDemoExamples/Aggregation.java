package AllDemoExamples;

class Author{
    String authorname;
    String place;
    int age;

    Author(String authorname, String place, int age){
        this.authorname = authorname;
        this.place = place;
        this.age = age;
    }
}
class Publisher{
    String name;
    int publisherID;
    String city;

    Publisher(String name, int publisherID, String city){
        this.name = name;
        this.publisherID = publisherID;
        this.city = city;
    }
}
class Book{
    String bookname;
    int price;
    Author auth;
    Publisher publish;

    Book(String bookname, int price, Author auth, Publisher publish){
        this.bookname = bookname;
        this.price = price;
        this.auth = auth;
        this.publish = publish;
    }
    public static void main(String[] args) {
    Author obj = new Author("VISHNU VARDHAN REDDY", "NELLORE", 28);
    Publisher obj1 = new Publisher("VISHNU VARDHAN REDDY", 4205234, "NELLORE");
    Book obj2 = new Book("MAHABHARATH", 2000, obj, obj1);
    System.out.println("-------------------------------BOOK DETAILS----------------------------");
    System.out.println("BOOk NAME = " + obj2.bookname);
    System.out.println("BOOK PRIZE = " + obj2.price);
    System.out.println("-------------------------------AUTHOR DETAILS--------------------------");
    System.out.println("AUTHOR NAME = " + obj.authorname);
    System.out.println("AUTHOR PLACE = " + obj.place);
    System.out.println("AUTHOR AGE = " + obj.age);
    System.out.println("--------------------------------PUBLISHER-------------------------------");
    System.out.println("NAME OF THE PUBLISHER = " + obj1.name);
    System.out.println("PUBLISHER ID = " + obj1.publisherID);
    System.out.println("PLACE OF PUBLISHER = " + obj1.city);
    }
}

