public class ControlIfAndOr {
  public static void main(String args[]){
    ControlIfAndOr control = new ControlIfAndOr();
    control.ifAndOr();
  }
  public void ifAndOr(){
    int age = 25;
    boolean isMarried = true;

    if (age > 25 && isMarried) {
      System.out.println("Age is over 25 and Married");
    }
    if (age > 25 || isMarried) {
      System.out.println("Age is over 25 or Married");
    }
    public void tripleOrAnd() {
      int age = 25;
      boolean isMarrie=true;
      double height=180;
      if((age>25 || isMarried) && height>=180) {
        System.out.println("Age is over 25 or Married and height is over 180");
      }
    }
  }
}
