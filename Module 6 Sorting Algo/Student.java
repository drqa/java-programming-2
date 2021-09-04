import java.util.ArrayList;

public class Student{

    int rollno;
    String name;
    String address;

    public int getRollno() {
        return this.rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String rollnoToString(){
        return rollno + ", ";
    }

    public String nameToString(){
        return name + ", ";
    }


    public static void main(String[] args) {
        ArrayList<Student> ArrayListStudent = new ArrayList<Student>();
    
        ArrayListStudent.add(new Student(104, "Fernando", "8008 NE Luxin Dr."));
        ArrayListStudent.add(new Student(108, "Patrick", " 983 Isthus Reel"));
        ArrayListStudent.add(new Student(102, "Graeme", "1313 Bezos Way"));
        ArrayListStudent.add(new Student(103, "Nabil", "49 Ein El Menhar Avenue"));
        ArrayListStudent.add(new Student(106, "Kamani", "1101 Pink Street"));
        ArrayListStudent.add(new Student(109, "Ravi", "1298 White Street"));
        ArrayListStudent.add(new Student(105, "Mackenzie", "4256 Grey Street"));
        ArrayListStudent.add(new Student(100, "Katrina", "9997 Yellow Street"));
        ArrayListStudent.add(new Student(107, "Nick", "2004 Brown Street"));
        ArrayListStudent.add(new Student(101, "Mohsin", "1947 Khan Street"));

        for(int i = 0; i < ArrayListStudent.size(); i++) {
            System.out.print(ArrayListStudent.get(i).rollnoToString());
        }

        

        System.out.println();

        for(int i = 0; i < ArrayListStudent.size(); i++) {
            System.out.print(ArrayListStudent.get(i).nameToString());
        }
    }
}