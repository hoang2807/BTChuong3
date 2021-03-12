package mypack;

import java.util.Scanner;

public class Citizen {
    private String Name;
    private String Birthday;
    private String Address;
    private long IDCardNum;

    public Citizen() {
        this.Name = "";
        this.Birthday = "";
        this.Address = "";
        this.IDCardNum = 0;
    }

    public Citizen(String Name, String Birthday, String Address, long IDCardNum) {
        this.Name = Name;
        this.Birthday = Birthday;
        this.Address = Address;
        this.IDCardNum = IDCardNum;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("IDCardNum:");
        long id = sc.nextLong();
        this.IDCardNum = id;
        System.out.println("Name:");
        sc.nextLine();
        String name = sc.nextLine();
        this.Name = name;
        System.out.println("Birthday:");
        String birthday = sc.nextLine();
        this.Birthday = birthday;
        System.out.println("Address:");
        String address = sc.nextLine();
        this.Address = address;
    }

    public void output() {
        System.out.println("IDCardNum: " + IDCardNum);
        System.out.println("Name: " + Name);
        System.out.println("Birthday: " + Birthday);
        System.out.println("Address: " + Address);
    }

}
