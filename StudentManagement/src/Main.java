
import controller.Manager;
import view.Validation;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        Validation validation = new Validation();
        Manager manager = new Manager();
        while (true) {
            System.out.println(" 1.Create");
            System.out.println(" 2.Find and Sort");
            System.out.println(" 3.Update/Delete");
            System.out.println(" 4.Report");
            System.out.println(" 5.Exit");
            int choice = validation.inputInt("Enter choice:", 1, 5);
            switch (choice) {
                case 1:
                    manager.createStudent();
                    break;
                case 2:
                    manager.findAndSort();
                    break;
                case 3:
                    manager.updateOrDelete();
                    break;
                case 4:
                    manager.report();
                    break;
                case 5:
                    return;
            }

        }
    }
}
