import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasksList = new ArrayList<>(); //create arraylist named taskslist to store item

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //initialize scanner to read user input
        boolean exit = false; //initialize boolean var to control while loop

        while (!exit) {
            System.out.println("TO DO LIST");
            System.out.println("1. Add to do list");
            System.out.println("2. Remove to do list");
            System.out.println("3. View to do list");
            System.out.println("4. Close");
            System.out.println("Please enter the number for your option: ");
            
            int choice = scan.nextInt(); //read user choice as int
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Please enter the task: ");
                    String task = scan.nextLine(); //read task as string
                    tasksList.add(task);
                    System.out.println("Added");
                    break;

                case 2:
                    System.out.println("Please enter the task number you wish to remove: ");
                    int taskNum = scan.nextInt();
                    scan.nextLine(); //consume the newline character
                    if (taskNum > 0 && taskNum <= tasksList.size()) {
                        tasksList.remove(taskNum - 1);
                        System.out.println("Task removed");
                    } else {
                        System.out.println("Please enter a valid task number");
                    }
                    break;

                case 3:
                    System.out.println("To Do List: ");
                    for (int i = 0; i < tasksList.size(); i++) {
                        System.out.println((i + 1) + ". " + tasksList.get(i));
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

        scan.close(); //close the scanner to free resources
    }
}
