package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageStaff m = new ManageStaff();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add staff");
            System.out.println("2. Find staff by name");
            System.out.println("3. Display all staff");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("What staff position do you want to add?");
                    System.out.println("1. Worker");
                    System.out.println("2. Employee");
                    System.out.println("3. Engineer");
                    System.out.print("Your choice: ");
                    int staffChoice = sc.nextInt();
                    sc.nextLine();
                    switch (staffChoice) {
                        case 1: {
                            // name
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            // age
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            // gender
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            // address
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            // level
                            System.out.print("Enter level: ");
                            int level = sc.nextInt();
                            // create Worker object
                            Worker worker = new Worker(name, age, gender, address, level);
                            m.addStaff(worker);
                            System.out.println("Added a Worker: " + worker.toString());
                            break;
                        }

                        case 2: {
                            // name
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            // age
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            // gender
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            // address
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            // level
                            System.out.print("Enter job: ");
                            String job = sc.nextLine();
                            // create Worker object
                            Employee emp = new Employee(name, age, gender, address, job);
                            m.addStaff(emp);
                            System.out.println("Added an Employee: " + emp.toString());
                            break;
                        }

                        case 3: {
                            // name
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            // age
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            // gender
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            // address
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            // level
                            System.out.print("Enter major: ");
                            String major = sc.nextLine();
                            // create Worker object
                            Engineer emp = new Engineer(name, age, gender, address, major);
                            m.addStaff(emp);
                            System.out.println("Added an Engineer: " + emp.toString());
                            break;
                        }

                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    m.findStaffByName(name).forEach(staff -> System.out.println(staff.toString()));
                    break;
                }

                case 3: {
                    m.displayStaffList();
                    break;
                }

                case 4: {
                    sc.close();
                    return;
                }

                default:
                    System.out.println("Invalid choice");
                    continue;
            }
        }
    }
}