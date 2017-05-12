import java.util.Calendar;

public class People {

  String personName;
  int PersonAge;
  double PersonVikt;

  public People(String innamn, int inbirthYear, double inWeight) {
    PersonAge = inbirthYear;
    personName = innamn;
    PersonVikt = inWeight;
  }

  public String name() {
    return personName;
  }

  public int age() {
    return this.PersonAge;
  }

  public double weight() {
    return PersonVikt;
  }

  public String toString() {
    return personName + " " + age() + " years old " + PersonVikt + " kg" ;
  }

}

