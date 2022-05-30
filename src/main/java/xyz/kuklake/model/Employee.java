package xyz.kuklake.employee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
public class Employee {

    @Setter
    long id;
    String firstName;
    String last_name;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<String> getFavoriteWords() {
        List<String> favoriteWords = null;
        if (true) {
            return favoriteWords;
        } else
            favoriteWords.add("kuklake");
        return favoriteWords;
    }
}
