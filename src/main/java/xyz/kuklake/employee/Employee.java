package xyz.kuklake.employee;

import lombok.ToString;

import java.util.Set;

@ToString
public class Employee {

    private static long count = 0;
    private long id;
    private String firstName;
    private String lastName;
    private Set<String> favoriteWords;

    private Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id = ++count;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFavoriteWords (String favoriteWord) {
        favoriteWords.add(favoriteWord);
    }

    public Set<String> getFavoriteWords() {
        if (favoriteWords.isEmpty()) {
            throw new RuntimeException("Pracownik nie ma ulubionych wyrazów.");
        } else
            return favoriteWords;
    }
}
