import java.util.Calendar;

public class Person {

  String personName;
  int personBirthYears;
  double PersonVikt;

  public Person(String innamn, int inbirthYear, double inWeight) {
    personBirthYears = inbirthYear;
    personName = innamn;
    PersonVikt = inWeight;
  }

  public String name() {
    return personName;
  }

  public int age() {
    return Calendar.getInstance().get(Calendar.YEAR) - personBirthYears;
  }

  public double weight() {
    return PersonVikt;
  }

  public String toString() {
    return personName + " " + age() + " years old " + PersonVikt + " kg" ;
  }

}

