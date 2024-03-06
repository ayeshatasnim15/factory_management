package factory_managment;
import java.util.Scanner;

public class Machine extends Factory implements utility{
    String machine_name;
    String machine_color;
    String machine_fuel_type;
    int machine_price;
    String machine_type;
    String machine_transmission;

    @Override
    public void get_details(){
        System.out.println("NAME: "+machine_name);
        System.out.println("COLOR: "+machine_color);
        System.out.println("FUEL TYPE: "+machine_fuel_type);
        System.out.println("PRICE: "+machine_price);
        System.out.println("MACHINE TYPE: "+machine_type);
        System.out.println("TRANSMISSION: "+machine_transmission);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= * ENTER MACHINE DETAILS * =======================");
        System.out.println();
        System.out.print("MACHINE NAME: ");
        machine_name = sc.nextLine();
        System.out.print(("MACHINE COLOR: "));
        machine_color = sc.nextLine();
        System.out.print("MACHINE FUEL TYPE(ELECTRIC/CARBON): ");
        machine_fuel_type = sc.nextLine();
        System.out.print("MACHINE PRICE: ");
        machine_price = sc.nextInt();
        sc.nextLine();
        System.out.print("MACHINE TYPE(AUTOMATIC/MANUAL): ");
        machine_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        machine_transmission = sc.nextLine();
        total_machine_in_stock++;
    }
}
