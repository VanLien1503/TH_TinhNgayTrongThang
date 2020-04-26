import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tháng cần kiểm tra");
        int month=scanner.nextInt();
        String dayInMonth;
        switch (month){
            case 2:
                dayInMonth="Tháng : "+month+" Có 28 Hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth="Tháng : " + month + " Có 31 Ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth="Tháng : " + month + " Có 30 Ngày";
                break;
            default:
                dayInMonth="";

        }
        if (dayInMonth!=""){
            System.out.println(dayInMonth);
        }else {
            System.out.println("Tháng Bạn Nhập Không Đúng");
        }
    }
}
