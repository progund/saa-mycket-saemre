public class TestPerson {

  static List<Person> initPerson() {
    Scanner sc = new Scanner(System.in);
    List<Person> persons = new ArrayList<>();
    System.out.println("Welcome.");
    System.out.println("Quit by entering 'sluta' as the name.");
    boolean readMorePersons = true;
    while (readMorePersons) {
      System.out.print("Name: ");
      String name = sc.nextLine();
      if ("sluta".equals(name)) {
        readMorePersons = false;
        continue;
      }
      System.out.print("Birth year: ");
      int birthYear = Integer.parseInt(sc.nextLine());
      System.out.print("Weight (use . as decimal point): ");
      double weight = Double.parseDouble(sc.nextLine());
      persons.add(new Person(name, birthYear, weight));
    }
    return persons;
  }

  public static void main(String[] args) {
    List<Person> persons = initPerson();
    System.out.println(persons);
  }

}
