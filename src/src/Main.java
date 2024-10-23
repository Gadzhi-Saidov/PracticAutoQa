class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    public void printUserInfo() {
        System.out.println("User name: " + name);
    }
}



class Student extends User {
    String grade;

    public Student (String name, String grade) {
        super(name);
        this.grade = grade;
    }

    @Override
    public void printUserInfo() {
        System.out.println("Student name: " + name + ", Class: " + grade);
    }
}



class Teacher extends User {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void printUserInfo() {
        System.out.println("Teacher name: " + name + ", Subject " + subject);
    }

}


class Resource {
    public void useResource(User user) {
        if (user instanceof Student)
            System.out.println("Resource used by Student.");
        else if (user instanceof Teacher)
            System.out.println("Resource used by Teacher.");
    }
}


public class Main {
    public static void main(String[] args) {
        User user1 = new Student("Gadzhi", "5th grade");
        User user2 = new Teacher("Said", "Mathematics");

        user1.printUserInfo();
        user2.printUserInfo();

        Resource resource = new Resource();
        resource.useResource(user1);
        resource.useResource(user2);
    }
}