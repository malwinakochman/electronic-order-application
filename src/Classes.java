import java.util.ArrayList;

public class Classes {
    String name;
    ArrayList<String> students;

    public Classes(String name) {
        this.name = name;
        this.students = new ArrayList<String>();
    }

    public void registerStudent(String student){
        if (this.students.size() >= 10) {
            System.out.println("No more students can be register for these classes.");
        } else {
            this.students.add(student);
            System.out.println(student + " was register for " + this.name + " classes.");
        }
    }

    public void displayList(){
        System.out.println(this.students);
    }

    public static void main(String[] args) {
        Classes computerScience = new Classes("Computer Science");
        computerScience.registerStudent("Malwina Kochman");
        computerScience.registerStudent("Jakub Grela");
        computerScience.displayList();
        Classes mathematics = new Classes("Mathematics");
        mathematics.registerStudent("Anna Kowalska");
    }
}
