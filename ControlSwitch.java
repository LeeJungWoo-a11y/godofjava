public class ControlSwitch {
    public static void main(String args[]) {
        ControlSwitch control=new ControlSwitch();
        control.swtichStatement(1);
        control.swtichStatement(2);
        control.swtichStatement(3);
        control.swtichStatement(4);
        control.swtichStatement(6);
        control.swtichStatement2(1);
        control.switchCalendar(1);
        control.switchCalendar(2);
        control.switchCalendar(3);
        control.switchCalendar(4);
        control.switchCalendar(5);
        control.switchCalendar(6);
        control.switchCalendar(7);
        control.switchCalendar(8);
        control.switchCalendar(9);
        control.switchCalendar(10);
        control.switchCalendar(11);
        control.switchCalendar(12);
    }
    public void swtichStatement(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel+":It is one foot bicycle.");
                break;
            case 2:
                System.out.println(numberOfWheel+":It is a motor cycle or bicycle.");
                break;
            case 3:
                System.out.println(numberOfWheel+":It is a three wheel car.");
                break;
            case 4:
                System.out.println(numberOfWheel+":It is a car.");
                break;
            default:
                System.out.println(numberOfWheel+":It is an expensive car.");
                break;
        }
      }
      public void swtichStatement2(int numberOfWheel) {
          switch (numberOfWheel) {
              case 1:
                  System.out.println(numberOfWheel + ":It is one foot bicycle.");
  //                break;
              case 2:
                  System.out.println(numberOfWheel + ":It is a motor cycle or bicycle.");
  //                break;
              case 3:
                  System.out.println(numberOfWheel + ":It is a three wheel car.");
                  break;
              case 4:
                  System.out.println(numberOfWheel + ":It is a car.");
                  break;
              default:
                  System.out.println(numberOfWheel + ":It is an expensive car.");
                  break;
          }
    }
    public void switchCalendar(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " has 30 days.");
                break;
            case 2:
                System.out.println(month + " has 28 or 29 days.");
                break;
            default:
                System.out.println(month + " is not a month.");
                break;
        }
    }
}
