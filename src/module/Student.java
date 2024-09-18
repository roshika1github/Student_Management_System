package module;

import java.util.ArrayList;

public class Student {
    public String name;
    public int id;
    public int rollno;
    public String grade;
    public String section;
    public Classroom classroom;
    public ArrayList<Subject> SubjectList;

    public Student(String name, int id, int rollno, String grade, String section, Classroom classroom, ArrayList<Subject> subjectList) {
        this.name = name;
        this.id = id;
        this.rollno = rollno;
        this.grade = grade;
        this.section = section;
        this.classroom = classroom;
        SubjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRollno() {
        return rollno;
    }

    public String getGrade() {
        return grade;
    }

    public String getSection() {
        return section;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public ArrayList<Subject> getSubjectList() {
        return SubjectList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        SubjectList = subjectList;
    }
}