import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;  // vi behöver printa ut på printenheter (t ex skärm, skrivare, virtual reality) */

public class TestPerson {

  private static ArrayList<People> initPerson() {
    Scanner sc = new Scanner(System.in);
    ArrayList<People> person = new ArrayList<>();
    System.out.println("Welcome.");
    System.out.println("Quit by entering 'Stop' as the name.");
    System.out.println(" ... be careful with the format - we brake for no one");
    boolean readMorePersons = true;
    while (readMorePersons) {
      System.out.print("Name: ");
      String name = sc.nextLine();
      if ("Stop".equalsIgnoreCase(name)) {
        readMorePersons = false;
        continue;
      }
      System.out.print("Aalder: ");
      int birthYear = 0;
      birthYear = Integer.parseInt(sc.nextLine());
      double weight = 0.0;
      System.out.print("Weight (use . as decimal point): ");
      weight = Double.parseDouble(sc.nextLine());
      person.add(new People(name, birthYear, weight));
    }
    return person;
  }

  public static void main(String[] args) {
    ArrayList<People> person = initPerson();
    for(int i=0; i<person.size(); i++) {
      System.out.println(person.get(i));
    }
  }

}
