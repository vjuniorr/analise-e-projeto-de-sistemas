package br.com.ufc.model.person;

public class Employee extends Person {
  private String login;
  private String password;
  
  public Employee(String name, Integer registration) {
    super(name, registration);
  }

  public Employee() {}

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
