class Person {
    protected String name;

    Person(String name) {
        // Java inserts super(); here -> Object()
        this.name = name;
        System.out.println("1. Person: " + name);
    }

    String describe() {
        return name;
    }
}

class Student extends Person {
    protected double gpa;

    Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
        System.out.println("2. Student: GPA " + gpa);
    }
}

class Postgrad extends Student {
    private String thesis;

    Postgrad(String name, double gpa, String thesis) {
        super(name, gpa);
        this.thesis = thesis;
        System.out.println("3. Postgrad: " + thesis);
    }

    String card() {
        return super.describe() + " | GPA " + gpa + " | " + thesis;
    }
}
