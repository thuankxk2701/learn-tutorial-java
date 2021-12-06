import java.util.*;
import java.text.SimpleDateFormat;
public class Dates {
    public static void main(String[] args){
        // Tạo đối tượng Calendar mô tả thời điểm hiện tại
        // với Locale (khu vực) và TimeZone (múi giờ)
        // của máy tính đang chạy.
        Calendar cal = Calendar.getInstance();

        // import java.util.Date; để sử dụng Date
        // hiển thị ngày tháng năm giờ phút giây hiện tại của hệ thống
        // sử dụng phương thức getTime()
        // phương thức này sẽ trả về 1 đối tượng Date
        // lưu trữ thông tin ngày tháng năm giờ phút giây hiện tại của hệ thống
        Date date = cal.getTime();
        // hiển thị thời gian hiện tại
        System.out.println("Thời gian hiện tại của hệ thống là: " + date);
        // hiển thị ngày hiện tai
        // Calendar.DAY_OF_MONTH sẽ cho biết ngày hiện tại của tháng hiện tại
        // hàm get() sẽ trả về giá trị ngày hiện tại
        System.out.println("Ngày hiện tại là " + cal.get(Calendar.DAY_OF_MONTH));

        // hiển thị tháng hiện tại
        // sử dụng Calendar.MONTH
        // vì tháng trong Java sẽ chạy từ 0 đến 11
        // tức là nếu hiện giờ là tháng 7 thì chương trình sẽ hiển thị là tháng 6
        // vì vậy để hiển thị đúng thì ta sẽ cộng thêm tháng đó cho 1
        System.out.print("Tháng hiện tại là ");
        System.out.println(cal.get(Calendar.MONTH)+1);

        // hiển thị năm hiện tại
        // Calendar.YEAR sẽ cho biết năm hiện tại
        System.out.println("Năm hiện tại là " + cal.get(Calendar.YEAR));

        // hiển thị giờ hiện tại
        // sự khác nhau giữa HOUR và HOUR_OF_DAY là
        // HOUR sẽ hiển thị theo khung giờ 12 giờ, ví dụ 11 giờ tối sẽ hiển thị là 11
        // còn HOUR_OF_DAY sẽ hiển thị theo khung giờ 23 giờ, ví dụ 11 giờ tối sẽ hiển thị là 23
        System.out.println("Giờ hiện tại là " + cal.get(Calendar.HOUR));
        System.out.println("Giờ hiện tại là " + cal.get(Calendar.HOUR_OF_DAY));

        // hiển thị phút hiện tại
        // sử dụng Calendar.MINUTE
        System.out.println("Phút hiện tại là " + cal.get(Calendar.MINUTE));

        // hiển thị giây hiện tại
        // sử dụng Calendar.SECOND
        System.out.println("Giây hiện tại là " + cal.get(Calendar.SECOND));
        // thay đổi ngày hiện tại thành ngày 9
        // tháng hiện tại thành tháng 12
        // năm hiện tại thành năm 2018
        // giờ hiện tại thành 10
        // phút hiện tại thành 59
        // và giây hiện tại thành 59
        // sử dụng phương thức set()
        cal.set(Calendar.DAY_OF_MONTH, 9);
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        // hiển thi thời gian hiện tại sau khi thay đổi
        System.out.println(cal.getTime());

        // hoặc chúng ta có thể thay đổi tất cả như sau
        cal.set(2016, Calendar.APRIL, 30, 20, 23, 8);

        System.out.println(cal.getTime());

        // cộng thời gian
        // sử dụng phương thức add()
        cal.add(Calendar.MONTH, 4); // thêm 4 tháng
        cal.add(Calendar.DAY_OF_MONTH, 5);  // và 5 ngày
        System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());

        // trừ thời gian
        // sử dụng phương thức add()
        cal.add(Calendar.HOUR_OF_DAY, -2);  // giảm giờ hiện tại đi 2 tiếng
        cal.add(Calendar.MINUTE, -3);   // giảm phút hiện tại đi 3 phút
        System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());

        //// ROll()
        // tăng tháng sử dụng phương thức roll()
        // lúc này tháng sẽ là tháng 1 và năm vẫn giữ nguyên
        cal.roll(Calendar.MONTH, 1);
        System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());
        // khai báo 1 đối tượng SimpleDateFormat
        // chi tiết về khai báo đối tượng chúng ta sẽ học trong chương "Lập trình hướng đối tượng"
        // đối tượng này sẽ định dạng ngày theo cấu trúc "dd/MM/yyyy"
        // trong đó "dd" là ngày, "MM" là tháng và "yyyy" là năm
        // nếu ngày và tháng nào có 1 chữ số (ví dụ 1, 2, 3,...)
        // thì sẽ được tự động thêm vào số 0 đằng trước
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // hiển thị date theo cấu trúc mà chúng ta đã khai báo (dd/MM/yyyy)
        // sử dụng phương thức format()
        System.out.println("Thời gian hiện tại sau khi định dạng là " + sdf.format(date));

        // định dạng ngày hiện tại theo cấu trúc "d/M/yyyy"
        // trong đó "d" là ngày, "M" là tháng và "yyyy" là năm
        // với kiểu định dạng này thì ngày và tháng nào có 1 chữ số (ví dụ 1, 2, 3,...)
        // thì sẽ không được thêm vào số 0 đằng trước
        SimpleDateFormat sdf1 = new SimpleDateFormat("d/M/yyyy");
        System.out.println("Thời gian hiện tại sau khi định dạng là " + sdf1.format(date));

        // định dạng ngày giờ hiện tại theo cấu trúc "dd/MM/yyyy HH:mm:ss"
        // trong đó "HH" là giờ, "mm" là phút và "ss" là giây
        // "HH" là định dạng 24 giờ, và "hh" là định dạng 12 giờ
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Ngày giờ hiện tại sau khi định dạng là " + sdf2.format(date));

        // hiển thị ngày giờ theo định dạng 12 giờ
        // với định dạng 12 giờ thì chúng ta sẽ thêm vào "aaa"
        // trong đó "aaa" đại diện cho AM/PM
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
        System.out.println("Ngày giờ hiện tại sau khi định dạng là " + sdf3.format(date));
    }
}
