import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> sortBook1= new TreeSet<>();

        Book book1 = new Book("Şeker Portakalı",183, "José Mauro de Vasconcelos", 1968);
        Book book2 = new Book("Martin Eden",250,"Jack London",1909);
        Book book3 = new Book("Kürk Mantolu Madonna",  177,"Sabahattin Ali", 1943);
        Book book4 = new Book("Fahrenheit 451", 350, "Ray Bradbury",1953);

        sortBook1.add(book1);
        sortBook1.add(book2);
        sortBook1.add(book3);
        sortBook1.add(book4);

        //Sort by BookName
        for(Book bookName: sortBook1){
            System.out.println("Book Name: " +bookName.getBookName() +
                    "\nPage Number: " + bookName.getPageNumber() +
                    "\nAuthor Name: " + bookName.getAuthorName() +
                    "\nDate: " + bookName.getDate());
            System.out.println("------------------------------------------------");
        }

        System.out.println("=====================================================");

        TreeSet<Book> sortBook2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.getPageNumber() == o2.getPageNumber()){
                    return o1.getBookName().compareTo(o2.getBookName());
                }
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        sortBook2.add(book1);
        sortBook2.add(book2);
        sortBook2.add(book3);
        sortBook2.add(book4);

        //Sort by pageNumber
        for(Book pageNum: sortBook2){
            System.out.println("Book Name: " +pageNum.getBookName() +
                    "\nPage Number: " + pageNum.getPageNumber() +
                    "\nAuthor Name: " + pageNum.getAuthorName() +
                    "\nDate: " + pageNum.getDate());
            System.out.println("------------------------------------------------");
        }
    }
}
