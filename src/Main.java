public class Main {

    public static void main(String[] args) {
Student person =new Aspirant("IVAN","SIDOROV",12);
    }
}
class Student{
    String firstName;
    String lastName;
    int group;
    public Student(String firstName,String lastName,int group){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
    }
}
class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }
}