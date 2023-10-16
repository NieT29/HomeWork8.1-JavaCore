import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id hộ dân: ");
        int idHouseHold = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ hộ dân");
        String address = scanner.nextLine();

        HouseHold houseHold = new HouseHold(idHouseHold,address);

        System.out.println("Nhập số thành viên trong gia đình: ");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println("Nhập id thành viên: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên thành viên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày tháng năm sinh thành viên (dd/MM/yyyy): ");
            String birthDate = scanner.nextLine();
            LocalDate dayOfBirth = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Nhập công việc của thành viên: ");
            String job = scanner.nextLine();
            Member member = new Member(id,name,dayOfBirth,job);
            members.add(member);
        }
        houseHold.setMembers(members);
        System.out.println(houseHold);
    }
}

