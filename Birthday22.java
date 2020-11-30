import java.time.LocalDate;
public class Birthday22 {

    public static void HappyBirthDay(int month, int day){
        LocalDate birthday = LocalDate.of(1, month, day);
        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*  *                                   *  *");
            System.out.println("*  *       Happy BirthDay To You!      *  *");
            System.out.println("*  *                                   *  *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.out.println("Today is not your birthday");
    }
    public static void main(String[] args) {
        LocalDate DofB = LocalDate.of(1998, 11, 29);


        HappyBirthDay(11,23);
        HappyBirthDay(DofB.getMonthValue(), DofB.getDayOfMonth());

    }
}
