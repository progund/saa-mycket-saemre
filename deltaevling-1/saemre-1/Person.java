import java.util.Calendar;

public class Person {

  String personName;
  int personBirthYears;
  double PersonVikt;

  public Person(String name, int birthYear, double weight) {
    personBirthYears = birthYear;
    personName = name;
    PersonVikt = weight;
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
    return new StringBuilder(personName)
      .append(" ")
      .append(age())
      .append(" years old ")
      .append(String.format("%.2f",PersonVikt))
      .append(" kg")
      .toString();
  }

}

