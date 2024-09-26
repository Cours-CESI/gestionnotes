package fr.tetemh;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@Data
public class Student {
    private String name;
    private int age;
    private ArrayList<Integer> notes = new ArrayList<>();

    public Student(String name) {
        this.setName(name);
        this.genNotes(5);
        System.out.println(this.getName());
        System.out.println("Max : " + this.getMaxNote());
        System.out.println("Min : " + this.getMinNote());
        System.out.println("Moyenne : " + this.getMoyenNote());
    }

    private void genNotes(int x) {
        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            this.getNotes().add(rand.nextInt(20));
        }
    }

    private int getMaxNote() {
        return Collections.max(notes);
    }
    private int getMinNote() {
        return Collections.min(notes);
    }
    public double getMoyenNote() {
        double somme = 0;
        for (double note : notes) somme += note;
        return Math.round(somme / notes.size());
    }

}
