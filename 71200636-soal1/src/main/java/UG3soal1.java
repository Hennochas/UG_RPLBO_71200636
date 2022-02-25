import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class UG3soal1 {
    public static void main(String[] args) {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        String nama;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("============Absensi Karyawan========");
        System.out.println("Absen disini");
        System.out.print("Nama karyawan : ");

        nama = keyboard.nextLine();
        int year;
        GregorianCalendar date = new GregorianCalendar();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("Berhasil Absen");
        System.out.println("Atas Nama : " + nama);
        System.out.printf("Pada Tanggal :");
        System.out.print(date.get(date.DATE) + "-");
        System.out.print(months[date.get(date.MONTH)] + "-");
        System.out.println(year = date.get(date.YEAR));
        System.out.printf("Pukul : ");
        System.out.print(date.get(date.HOUR) + ":");
        System.out.print(date.get(date.MINUTE) + ":");
        System.out.println(date.get(date.SECOND));
    }

}

