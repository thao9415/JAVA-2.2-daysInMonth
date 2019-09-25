import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn biết số ngày của tháng nào? ");
        int month = sc.nextInt();
        String daysInMonth;

        switch (month) {
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                break;
        }
        if (daysInMonth != "") {
            System.out.printf("Tháng %d có %s ngày", month, daysInMonth);
        } else {
            System.out.println("Không tồn tại tháng này");
        }

    }
}
