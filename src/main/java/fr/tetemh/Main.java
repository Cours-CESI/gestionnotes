package fr.tetemh;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Faker faker = new Faker();
        for (int i = 0; i < 8; i++) students.add(new Student(faker.name().firstName()));
        System.out.println("Classe : " + students.stream().mapToDouble(Student::getMoyenNote).sum() / students.size());
    }
}