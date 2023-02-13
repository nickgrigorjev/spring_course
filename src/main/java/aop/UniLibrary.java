package aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {



    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary ");
    }


//    public void returnBook() {
//        System.out.println("Мы возвращаем книгу в UniLibrary");
//    }

    protected String returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }


    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}