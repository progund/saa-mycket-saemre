package com.megacorp.domain;

public class Member {

  private String   name;
  private String   email;
  private int      id;

  private static final int HASH_PRIME = 17;

  public Member(String name, String email, int id) {
    this.name  = name;
    this.email = email;
    this.id    = id;
  }
  public Member(String name, String email) {
    this.name  = name;
    this.email = email;
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

  public int hashCode () {
    int result = HASH_PRIME;
    result = 31 * result + name.hashCode();
    result = 31 * result + email.hashCode();
    result = 31 * result + id;
    return result;
  }

    
}
