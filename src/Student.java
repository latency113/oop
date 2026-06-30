class Student {
    String studentId;
    String name;
    int age;
    double gpa;

    public Student() {
        this.studentId = "0000";
        this.name = "SDDD";
        this.age = 19;
        this.gpa = 3.12;
    }

    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void printInfo() {
        System.out.println("StudentId : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gpa : " + gpa);
    }
}
