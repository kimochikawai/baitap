package baitap;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class NhanVien {
    public static void main(String[] args) {

        String name;
        int age;
        String address;
        Double salary;
        int time_work;
        double thuong;
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhập vào tên : ");
        name = nhap.nextLine();
        System.out.println("Nhập vào tuổi");
        age = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Nhập vào địa chỉ:");
        address = nhap.nextLine();
        System.out.println("Nhập vào số lương");
        salary = nhap.nextDouble();
        System.out.println("Nhập vào số giờ làm việc");
        time_work = nhap.nextInt();
        System.out.println("Thông tin của nhân viên là :");
        System.out.println("Tên : " + name);
        System.out.println("Tuổi : " + age);
        System.out.println("Địa chỉ : " + address);
        System.out.println("Lương : " + salary);
        System.out.println("Giờ làm việc : " + time_work);


        if (time_work >= 200) {
            thuong = salary * 0.2;
            System.out.println("Thưởng : " + thuong);
        }
        if (time_work >= 100 && time_work < 200) {
            thuong = salary * 0.1;
            System.out.println("Thưởng : " + thuong);
        } else {

            System.out.println("Không được thưởng");

        }
    }
}

















