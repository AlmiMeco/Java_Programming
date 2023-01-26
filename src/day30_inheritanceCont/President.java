package day30_inheritanceCont;

import java.time.LocalDate;
import java.time.LocalDateTime;
                                           /* Hierarchical Inheritance */
public class President extends Person {


    private LocalDate dateElected;

    public President(String name, char gender, LocalDate DOB, LocalDate dateElected) {
        super(name, gender, DOB);
        setDateElected(dateElected);
    }

    public LocalDate getDateElected() {
        return dateElected;
    }

    public void setDateElected(LocalDate dateElected) {
        this.dateElected = dateElected;
    }

    public void lie(){
        System.out.println(getName() + " has lied again");



    }
}
