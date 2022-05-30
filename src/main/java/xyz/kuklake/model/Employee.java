package xyz.kuklake.model;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Employee {

//    @Setter //tak jest tylko dla id, dajemy na górę do wszystkich i wywalamy niżej
    long id; //lepiej long na wszelki wypadek
    String firstName;
    String lastName;

    //usuwamy zbędne getery ale uwaga bo w niektórych frameworkach mogą być niezbędne
    //Uwaga bo mamy @Setter lombokowy, zatem to bezsensowne używać poniższe
    /*public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
*/

}
