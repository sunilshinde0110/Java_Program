package assignment_6;

public class Book {
    private String book_Name;
    private String book_Type;
    private double book_Prize;

    public Book(String book_Name, String book_Type, double book_Prize) {
        this.book_Name = book_Name;
        this.book_Prize = book_Prize;
        this.book_Type = book_Type;
    }

    public void printInfo() {
        System.out.println("Book: Name= " + book_Name
                + ", Type= " + book_Type
                + ", Prize= " + book_Prize + " Rs");
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public String getBook_Type() {
        return book_Type;
    }

    public void setBook_Type(String book_Type) {
        this.book_Type = book_Type;
    }

    public double getBook_Prize() {
        return book_Prize;
    }

    public void setBook_Prize(double book_Prize) {
        this.book_Prize = book_Prize;
    }
}
