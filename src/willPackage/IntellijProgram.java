package willPackage;

import willPackage.model.Cat;

import java.util.Objects;

public class IntellijProgram {
  public static void main(String[] args) {
    /*int firstNumber = 22;
    int secondNumber = 32;
    System.out.println("Hello Intellij! " + (firstNumber + secondNumber));*/
    Cat kitty = new Cat();
    Book braveNewWorld = new Book("Brave New World", 311);

    System.out.println(braveNewWorld);
//    System.out.println(kitty);
  }
}

class Book {
  private String name;
  private Integer pagesAmount;

  public Book(String name, Integer pagesAmount) {
    this.name = name;
    this.pagesAmount = pagesAmount;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPagesAmount() {
    return pagesAmount;
  }

  public void setPagesAmount(Integer pagesAmount) {
    this.pagesAmount = pagesAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(name, book.name) && Objects.equals(pagesAmount, book.pagesAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pagesAmount);
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", pagesAmount=" + pagesAmount +
        '}';
  }
}
