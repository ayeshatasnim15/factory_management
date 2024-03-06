package factory_managment;

import java.util.Scanner;
public class Factory implements utility{
    String Factory_name;
    String Factory_address;
    int total_employees;
    int total_machine_in_stock = 0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Factory Name: "+Factory_name);
        System.out.println("Factory Address: "+Factory_address);
        System.out.println("Factory Name: "+Factory_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Machine In Stock: "+total_machine_in_stock);

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= * ENTER FACTORY DETAILS * =======================");
        System.out.println();
        System.out.print("FACTORY NAME: ");
        Factory_name = sc.nextLine();
        System.out.print(("FACTORY ADDRESS: "));
        Factory_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_employees = sc.nextInt();
        System.out.print("TOTAL MACHINE IN STOCK: ");
        total_machine_in_stock = sc.nextInt();

    }
}
