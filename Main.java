package factory_managment;

import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}


public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= * WELCOME TO FACTORY MANAGEMENT SYSTEM * =======================");
        System.out.println();
        System.out.println("=============================== * ENTER YOUR CHOICE * ===============================");
        System.out.println();
        System.out.println("1].ADD FACTORY \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD MACHINE ");
        System.out.println();
        System.out.println("4].GET FACTORY \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET MACHINE");
        System.out.println();
        System.out.println("=============================== * ENTER 0 TO EXIT * ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory factory[] = new Factory[5];
        Employees employee[] = new Employees[5];
        Machine machine[] = new Machine[5];
        int machine_counter = 0;
        int factory_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        factory[factory_counter] = new Factory();
                        factory[factory_counter].set_details();
                        factory_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW FACTORY");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new Employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        machine[machine_counter] = new Machine();
                        machine[machine_counter].set_details();
                        machine_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW MACHINE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < factory_counter; i++) {
                            factory[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < machine_counter; i++) {
                            machine[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }


    }
}
