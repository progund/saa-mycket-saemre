import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPerson {

  /**
   * <p>
   * Reads Person data from the Console and returns a List<Person> when it's done.
   * The user stops input by entering Stop as the name.
   * @return A List<Person> with the Person objects created from the user input
   */
  private static List<Person> readPersonsFromConsole() {
    Scanner sc = new Scanner(System.in);
    List<Person> persons = new ArrayList<>();
    System.out.println("Welcome.");
    System.out.println("Quit by entering 'Stop' as the name.");
    boolean readMorePersons = true;
    while (readMorePersons) {
      System.out.print("Name: ");
      String name = sc.nextLine();
      if ("Stop".equalsIgnoreCase(name)) {
        readMorePersons = false;
        continue;
      }
      System.out.print("Birth year: ");
      int birthYear = 0;
      try {
        birthYear = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException nfe) {
        System.out.println("Please enter a valid year in the format YYYY. Start over with name.");
        continue;
      }
      System.out.print("Weight (use . as decimal point): ");
      double weight = Double.parseDouble(sc.nextLine());
      persons.add(new Person(name, birthYear, weight));
    }
    return persons;
  }

  public static void main(String[] args) {
    List<Person> persons = readPersonsFromConsole();
    System.out.println(persons);
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
