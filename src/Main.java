import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = "";
            if(scanner.hasNext()){
                s = scanner.next();
            }
            if(s.toUpperCase().contentEquals("EXIT")){
                break;
            }
            else if(s.toUpperCase().contentEquals("ADD")){
                String name = scanner.next();
                int id = scanner.nextInt();
                students.add(new Student(name, id));
            }
            else if(s.toUpperCase().contentEquals("REMOVE")){
                System.out.println("ready to remove student");
               // String name = scanner.next(); // удаляем по объекту не знаю как.
                int index = scanner.nextInt();  //по индексу
                students.remove(index);
                //TODO Remove student
            }
            else if(s.toUpperCase().contentEquals("PRINT")){
                students.forEach(System.out::println);
            }
            else if(s.toUpperCase().contentEquals("EDIT")){
                System.out.println("ready to edit student");
               String name = scanner.next();
               int id = scanner.nextInt();
               int index = scanner.nextInt();
                  students.set(index,name);


                //TODO Edit student
            } else {
                System.out.println("UNKNOWN COMMAND!");
            }
        }
    }
}
