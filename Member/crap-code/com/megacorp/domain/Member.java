/*
 *
 * This code is part of a video series making fun or bad programming. 
 * Please:
 * 1. do not use any of the code below - for your own sake
 * 2. do not hold us responsible for it - we only wrote it
 *
 * Rikard and Henrik - juneday.se
 *
 */
import java.io.*;
import java.util.*;

public class Member {

  private String   name;
  private String   email;
  private int      id;

  private static final int HASH_PRIME = 1234;

  public Member(String name, String email, int id) {
    this.name  = name;
    this.email = email;
    this.id    = id;
  }

  // default constructor
  public Member() {
    Scanner sc = new Scanner(System.in);
    int id = sc.nextInt();
    String name = sc.next();
    String email = sc.next();
    this.name  = name;
    this.email = email;
    this.id    = id;
  }

  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String toString() {
    return this.id + ", " + this.name + " <" + this.email + ">";
  }

  public boolean equals (Object obj) {

    // Is "this" the same as obj?
    if (this == obj) {
      return true;
    }

    // Is obj null, return false
    // Is obj not a Member, return false
    if (obj == null || !(obj instanceof Member)) {
      return false;
    }
        
    // .... you need to add code to check if the instances 
    // this and obj are equal
    Member m = (Member)obj;
    return this.name.equals(m.name) && this.email.equals(m.email) && this.id == m.id  ;
  }

  public Member(String names) {
    Scanner sc = new Scanner(names);
    sc.useDelimiter(",");
    String name = sc.next();
    String email = sc.next();
    int id = sc.nextInt();
    this.name  = name;
    this.email = email;
    this.id    = id;
  }
  
  public ArrayList<Member> readFile(String fileString) {
    ArrayList<Member> member = new ArrayList<Member>();
    try {
      File fileName = new File(fileString);
      Scanner fs = new Scanner(fileName);
      while(fs.hasNext()) {
        String line = fs.nextLine();
        Member m = new Member(line);
        member.add(m);
      }
    } catch (Exception e) { ; }
    return member;
  }

  public static void main(String[] args) {
    Member m = new Member();
    ArrayList<Member> member = m.readFile("members.csv");
    System.out.println("Member: " + m);

    for (int i=0; i<member.size(); i++) {
      System.out.println("* " + member.get(i));
    }
    
  }
    
}
