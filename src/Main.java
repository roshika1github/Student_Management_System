import module.Classroom;
import module.Student;
import module.Subject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
 Subject subject1=new Subject("physics","maths","chemistry","computer","english",6);
        Subject subject2=new Subject("physics","maths","chemistry","computer","english",9);

        ArrayList<Subject> subjects=new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);

        Classroom classroom=new Classroom(101,"Galaxy",30,"Sony",100,"Hitachi",2);

        Student student=new Student ("Jean Baptise",1234,21,"twelve","A","classroom","subjectlist");

        System.out.println("Student Name: "+student.getName());
        System.out.println("Student ID: "+student.getId());
        System.out.println("roll no:"+student.getrollno());
        System.out.println("Grade: "+student.getGrade());
        System.out.println("Section: "+student.getSection());
        System.out.println("Classroom Id:"+student.getClassroom().getClassroomId());
        System.out.println("Classroom Name:"+student.getClassroom().getClassroomName());
        System.out.println("Classroom capacity:"+student.getClassroom().getCapacity());
        System.out.println("Classroom tv:"+student.getClassroom().getTv());
        System.out.println("Classroom roomNo:"+student.getClassroom().getRoomNo());
        System.out.println("Classroom ac:"+student.getClassroom().getAc());
        System.out.println("Classroom capacity:"+student.getClassroom().getCapacity());

        System.out.println("/nSubjects:");
        for(Subject subject:student.getSubjectList()){
            System.out.println("Physics:"+subject.getPhysics());
            System.out.println("Maths:"+subject.getMaths());
            System.out.println("Chemistry:"+subject.getChemistry());
            System.out.println("Computer:"+subject.getComputer());
            System.out.println("English:"+subject.getEnglish());
            System.out.println("Credit Hours:"+subject.getCredithour());
            System.out.println();
        }

    }
}