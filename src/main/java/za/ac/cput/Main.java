package za.ac.cput;

import za.ac.cput.domain.GraduateStudent;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.UndergraduateStudent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student undergrad = new UndergraduateStudent.Builder(
                "1234",
                "Sesethu Nciti",
                "23118384@mycput.ac.za",
                "Application development"
        )
                .creditHours(15)
                .scholarshipAmount(1000)
                .build();

        Student graduate = new GraduateStudent.Builder(
                "2345",
                "Yonelisa Ngudle",
                "15664567@mycput.ac.za",
                "Software Engineering"
        )
                .researchAssistant(true)
                .stipend(2000)
                .build();

        undergrad.displayStudentDetails();
        graduate.displayStudentDetails();    }
}