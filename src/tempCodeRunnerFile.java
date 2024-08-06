import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("TO DO LIST");
            System.out.println("1. Add to do list");
            System.out.println("2. Remove to do list");
            System.out.println("3. View to do list");
            System.out.println("4. Close");
            System.out.println("Please enter the number for your option: ");
            
            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Please enter the task: ");
                    String task = scan.nextLine();
                    tasks.add(task);
                    System.out.println("Added");
                    break;

                case 2:
                    System.out.println("Please enter the task number you wish to remove: ");
                    int taskNum = scan.nextInt();
                    scan.nextLine(); // Consume the newline character
                    if (taskNum > 0 && taskNum <= tasks.size()) {
                        tasks.remove(taskNum - 1);
                        System.out.println("Task removed");
                    } else {
                        System.out.println("Please enter a valid task number");
                    }
                    break;

                case 3:
                    System.out.println("To Do List: ");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;


                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("You have selected an invalid option");
                    break;
            }
        }

        scan.close();
    }
}
