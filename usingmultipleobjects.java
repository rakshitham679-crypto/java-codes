class Student {
    String name;
    int age;

    void getData(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.getData("Rakshitha", 20);
        s2.getData("Priya", 19);

        s1.display();
        s2.display();
    }
}
