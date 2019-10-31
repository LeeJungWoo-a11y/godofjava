public class SalaryManager {
  public static void main(String args[]) {
    SalaryManager manager=new SalaryManager();

  }

  public double getMonthlySalary(int yearlySalary){
    double monthSalary = yearlySalary/12.0;
    double tax = calculateTax(monthSalary);
    double nationalpension = calculateNationalPension(monthSalary);
    double healthinsurance = calculateHealthInsurance(nibthSalary);
    double totalminus = tax + nationalpension + healthinsurance;

    System
  }
  public double calculateTax(double monthSalary){
    double Tax = monthSalary * (12.5/100);
    return Tax;
  }
  public double calculateNationalPension(double monthSalary){
    double NationalPension = monthSalary * (8.1/100);
    return NationalPension;
  }
  public double calculateHealthInsurance(double monthSalary){
    double HealthInsurance = monthSalary * (13.5/100);
    return HealthInsurance;
  }
}
