package constructorProject;

public class Main {
    public static void main(String args[]){
        Student s1 = new Student("Anand","Chaudhary");
        Student s2 = new Student();

        System.out.println(s1.fullName());
        System.out.println(s2.fullName());

    }
}
