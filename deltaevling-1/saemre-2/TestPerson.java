import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;  // vi behöver printa ut på printenheter (t ex skärm, skrivare, virtual reality) */

public class TestPerson {

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
      double weight = 0.0;
      System.out.print("Weight (use . as decimal point): ");
      try {
        weight = Double.parseDouble(sc.nextLine());
      } catch (NumberFormatException nfe) {
        System.out.println("Please enter a valid weight. Start over with name.");
        continue;
      }
      persons.add(new Person(name, birthYear, weight));
    }
    return persons;
  }

  public static void main(String[] args) {
    List<Person> persons = readPersonsFromConsole();
    System.out.println(persons);
  }

}
