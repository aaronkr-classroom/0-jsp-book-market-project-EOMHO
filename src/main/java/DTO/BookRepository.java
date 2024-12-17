package dao;

import java.util.ArrayList;
import dto.Book;

public class BookRepository {

      private ArrayList<Book> list0fBooks = new ArrayList<Book>();
      
      public BookRepository(){
         Book book1= new Book ("ISBN1234", "C#프로그래밍", 27000);
         book1.setAuthor("우재남");
         book1.setDescription("C#을 처음 접하는 독자를 대상으로 일대일 수업처럼 자세히 설명한 책이다.");
         
         book1.setPublisher("한빛아카데미");
         book1.setCategory("IT모바일");
         book1.setUnitsInStock(1000);
         book1.setReleaseDate("2022/10/06");
         
         Book book2 = new Book ("ISBN235", "자바마스터", 30000);
         book2.setAuthor("송미영");
         book2.setDescription("");
         
         book2.setPublisher("한빛아카데미");
         book2.setCategory("IT모바일");
         book2.setUnitsInStock(1000);
         book2.setReleaseDate("2023/01/01");
         
         Book book3= new Book ("ISBN1236", "파이썬 프로그래밍", 30000);
         book3.setAuthor("최성철");
         book3.setDescription("C#을 처음 접하는 독자를 대상으로 일대일 수업처럼 자세히 설명한 책이다.");
         
         book3.setPublisher("한빛아카데미");
         book3.setCategory("IT모바일");
         book3.setUnitsInStock(1000);
         book3.setReleaseDate("2023/01/01");
         
         list0fBooks.add(book1);
         list0fBooks.add(book2);
         list0fBooks.add(book3);
         
      }
      
      public ArrayList<Book> getAllBooks(){
         return list0fBooks;
      }
}
