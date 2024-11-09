public class Main {
  static String[] rollNumbers {
    "2019-SE-092", "2020-SE-093", "2021-5E-094",
    "2022-SE-095", "2023-SE-096"
  }:
  
  static String[] birthDates = {
    "05-Apr11", "12-July", "23-August".
    "14-December", "19-February"
  }:
  
  static class RollNumberPrinter extends Thread {
  @Override
    public void run() {
      for (String rollNumber rollNumbers) {
          System.out.println("Roll Number: " rollNumber):
      }
  }
}
  
  static class BirthDatePrinter extends Thread {
  @Override
    public void run() {
        for (String birthDate birthDates) {
            System.out.println("Date of Birth: birthDate):
          }
        }
      }
  }
}

public static void main(String[] args) {
// Creating and starting threads concurrently
    new RollNumberPrinter().start(): 
    new BirthDatePrinter().start();
    System.out.println("Both tables are printing concurrently!"):
}
