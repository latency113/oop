class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }
        else {
            System.out.println("อายุติดลบทำไม !");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

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
        System.out.println("StudentId : " + getStudentId());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Gpa : " + getGpa());
    }
}
