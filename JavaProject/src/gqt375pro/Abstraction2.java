package gqt375pro;
import java.util.Scanner;

abstract class AbstractAppliance {
    abstract void switchOn();
    abstract void switchOff();
}

class TelevisionUnit extends AbstractAppliance {

    void switchOn() {
        System.out.println("Television is switched ON.");
    }

    void switchOff() {
        System.out.println("Television is switched OFF.");
    }
}

class WashingMachineUnit extends AbstractAppliance {

    void switchOn() {
        System.out.println("Washing machine is switched ON.");
    }

    void switchOff() {
        System.out.println("Washing machine is switched OFF.");
    }
}

class Abstraction2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter appliance choice (1-TV, 2-Washing Machine): ");
        int choice = sc.nextInt();

        AbstractAppliance appliance;

        if (choice == 1) {
            appliance = new TelevisionUnit();
        } else {
            appliance = new WashingMachineUnit();
        }

        appliance.switchOn();
        appliance.switchOff();
    }
}