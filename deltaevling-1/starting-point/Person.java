import java.util.Calendar;

/**
 * <p>
 * A class representing a Person in some API.
 * </p>
 * <p>
 * A Person has a name, an age (represented by the age() method),
 * and a weight.
 * </p>
 */
public class Person {

  private String name;
  private int birthYear;
  private double weight;

  /**
   * <p>Constructs a new Person.
   * </p>
   * @param name The name of this Person
   * @param birthYear The birthYear of this Person
   * @param weight The weight of this Person
   */
  public Person(String name, int birthYear, double weight) {
    this.birthYear = birthYear;
    this.name = name;
    this.weight = weight;
  }

  /** 
   * <p>Returns the name of this Person.
   * </p>
   * @return The name Person
   */
  public String name() {
    return name;
  }

  /**
   * Returns the age of this Person, only taking into consideration the birthYear.
   * @return The of this Person, only taking into consideration the birthYear
   */
  public int age() {
    return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
  }

  /**
   * Returns the weight of this Person in Kg.
   * @return The weight of this Person in Kg
   */
  public double weight() {
    return weight;
  }

  /**
   * <p>
   * Returns a String representation of this Person in the format:
   * <pre>
   * Super Lenny 37 years old 59 kg
   * </pre>
   * </p>
   * <p>
   * Note that the age is a function only taking into consideration the birth year of this Person.
   * </p>
   * @return A String representation of this Person
   */
  @Override
  public String toString() {
    return new StringBuilder(name)
      .append(" ")
      .append(age())
      .append(" years old ")
      .append(String.format("%.2f",weight))
      .append(" kg")
      .toString();
  }

}

