package AssessmentOne;

//1. Jelaskan konsep OOP (Inheritance, Polymorphism, Abstraction, Encapsulation) dengan bahasa sendiri
//- Inheritance adalah kemampuan sebuah Class untuk dapat mewariskan atribut dan method kepada class lain atau sub class dibawahnya.;
//- Polymorphism artinya banyak bentuk, atau penggunaan satu method dengan nama yang sama, polymorphism dapat dilakukan dengan menerapkan;
//    a. Overriding : berarti mendefinisikan method superclass dengan nama yang sama pada subclass ;
//    b. Overloading : Overloading artinya menerapkan method yang sama namun dengan parameter yang berbeda;
//- Abstraction adalah class yang tidak bisa di instatiate atau di buat object baru secara langsung, hanya bisa di inheritance
//- Encapsulation adalah sebuah metode untuk mengatur class agar atribut-atribut sensitive yang terdapat dalam sebuah class tidak dapat di
//  akses dari luar kecuali dengan memanggil method tertentu seperti Set atau Get method dari sebuah class. ada 3 aksesbilitas dalam Encapsulation yaitu:
//    a. public : properti dapat di akses dari manapun
//    b. private : properti hanya dapat di akses dari dalam class
//    c. protected : properti hanya dapat di akses dari dalam class atau class turunannya

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Mike", "Batam");
        System.out.println(s.toString());

        s.addCourseGrade("Math", 84);
        s.addCourseGrade("English", 86);
        System.out.println("Average Grade: " + s.getAverageGrade());


        Teacher t = new Teacher("Bobby", "Jakarta");
        System.out.println(t.toString());
        System.out.println(t.addCouse("Math")); // true
        System.out.println(t.addCouse("English")); // true
        System.out.println(t.addCouse("Math")); // false
        System.out.println(t.addCouse("Physics")); // true
        System.out.println(t.addCouse("Chemistry")); // true
        System.out.println(t.removeCourse("Physics"));
        System.out.println(t.getCourses());;

// using collection
//        s.addCourseGrade("Math", 85);
//        s.addCourseGrade("English", 83);
//        s.printCourses();
//        s.printGrades();
//        System.out.println("Average Grade: " + s.getAverageGrade() + " from " + s.grades.size() + " courses");


    }
}
