package mypack;

import java.util.Scanner;

public class Officer extends Citizen {
    private String Department;
    private String Position;

    public Officer() {
        super();
        this.Department = "";
        this.Position = "";
    }

    public Officer(String Name, String Birthday, String Address, long IDCardNum, String Department, String Position) {
        super(Name, Birthday, Address, IDCardNum);
        this.Department = Department;
        this.Position = Position;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Department:");
        String department = sc.nextLine();
        this.Department = department;
        System.out.println("Position:");
        String pos = sc.nextLine();
        this.Position = pos;
    }

    public void output() {
        super.output();
        System.out.println("Department: " + Department);
        System.out.println("Position: " + Position);
    }

}
