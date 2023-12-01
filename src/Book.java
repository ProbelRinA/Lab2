public class Book
{
    private String title;
    private String author;
    private int numberofpages;
    private double cost;

    public Book (String title, String author, int numberofpages, double cost)
    {
        this.title=title;
        this.author=author;
        this.numberofpages=numberofpages;
        this.cost=cost;
    }

    public void print()
    {

        System.out.println("Title: " + "'" + title + "'");
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberofpages);
        System.out.println("Cost: " + cost + " USD");
    }

    public static void main(String[] args)
    {
        Book b1=new Book("Hero's name", "Julia Green", 430, 220.59);
        b1.print();
    }

}
