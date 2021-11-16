/* 
Program to sort the Student array by Percentage, Age, Name in Ascending Order


Expected Output:

Students list sorted by Percentage:
[[id=5, name=Lisa, age=35, percentage=67.0], [id=1, name=Pankaj, age=32, percentage=70.0], [id=10, name=Mikey, age=25, percentage=89.0], [id=20, name=Arun, age=29, percentage=90.0]]
Students list sorted by Age:
[[id=10, name=Mikey, age=25, percentage=89.0], [id=20, name=Arun, age=29, percentage=90.0], [id=1, name=Pankaj, age=32, percentage=70.0], [id=5, name=Lisa, age=35, percentage=67.0]]
Students list sorted by Name:
[[id=20, name=Arun, age=29, percentage=90.0], [id=5, name=Lisa, age=35, percentage=67.0], [id=10, name=Mikey, age=25, percentage=89.0], [id=1, name=Pankaj, age=32, percentage=70.0]]
*/


import java.util.*;

class Student {

    private int id;
    private String name;
    private int age;
    private float percentage;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getpercentage() {
        return percentage;
    }

    public Student(int id, String name, int age, float percentage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    public static Comparator<Student> PercentageComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            if (e1.getpercentage() < e2.getpercentage())
                return (int)e1.getpercentage();
            else
                return (int)e2.getpercentage();
        }
    };

    public static Comparator<Student> AgeComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            if (e1.getAge() < e2.getAge())
                return e1.getAge();
            else
                return e2.getAge();
        }
    };

    public static Comparator<Student> NameComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            return e2.getName().compareTo(e2.getName());
        }
    };

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", percentage=" + this.percentage + "]";
    }

}

public class Q2 {

    public static void main(String[] args) {

        Student[] studentArr = new Student[4];
        studentArr[0] = new Student(10, "Mikey", 25, 89);
        studentArr[1] = new Student(20, "Arun", 29, 90);
        studentArr[2] = new Student(5, "Lisa", 35, 67);
        studentArr[3] = new Student(1, "Pankaj", 32, 70);

        Arrays.sort(studentArr, Student.AgeComparator);
        System.out.println("Students list sorted by Percentage:\n" + Arrays.toString(studentArr));

        Arrays.sort(studentArr, Student.PercentageComparator);
        System.out.println("Students list sorted by Age:\n" + Arrays.toString(studentArr));

        Arrays.sort(studentArr, Student.NameComparator);
        System.out.println("Students list sorted by Name:\n" + Arrays.toString(studentArr));

    }
}
