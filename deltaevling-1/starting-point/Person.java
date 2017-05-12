import java.util.Calendar;

public class Person {

  private String name;
  private int birthYear;
  private double weight;

  public Person(String name, int birthYear, double weight) {
    this.birthYear = birthYear;
    this.name = name;
    this.weight = weight;
  }

  public String name() {
    return name;
  }

  public int age() {
    return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
  }

  public double weight() {
    return weight;
  }

    @Override
    public String toString() {
      return new StringBuilder(name)
        .append(" ")
        .append(age())
        .append(" years old ")
        .append(weight)
        .append(" kg")
        .toString();
    }
}
  /*
Test runs:
$ javac Person.java && java TestPerson
Welcome.
Quit by entering 'sluta' as the name.
Name: Henrik
Age: 46
Weight (use . as decimal point): 85.2
Name: Rikard
Age: 45
Weight (use . as decimal point): 85
Name: sluta
[Henrik 46 years old 85.2 kg, Rikard 45 years old 85.0 kg]

// Enter zero persons:
$ javac Person.java && java TestPerson
Welcome.
Quit by entering 'sluta' as the name.
Name: sluta
[]

// Proof of why we really should have error handling:
$ javac Person.java && java TestPerson
Welcome.
Quit by entering 'sluta' as the name.
Name: 1123
Age: lastgammal
Exception in thread "main" java.lang.NumberFormatException: For input string: "lastgammal"
at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
at java.lang.Integer.parseInt(Integer.java:580)
at java.lang.Integer.parseInt(Integer.java:615)
at TestPerson.initPerson(Person.java:74)
at TestPerson.main(Person.java:83)
  */
}
