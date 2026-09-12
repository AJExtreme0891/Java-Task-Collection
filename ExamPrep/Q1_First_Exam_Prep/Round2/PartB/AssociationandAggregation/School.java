package ExamPrep.Q1_First_Exam_Prep.Round2.PartB.AssociationandAggregation;

import java.util.ArrayList;

class School {
    private String name;
    private ArrayList<Student> studentList;

    protected School(String name, ArrayList<Student> studentList){
        this.name = name;
        this.studentList = studentList;
    }
    protected School(String name){
        this.name = name;
    }

    protected void aufnehmen(Student student){
        this.studentList.add(student);
    }
    protected int anzahlStudent(){
        return this.studentList.size();
    }
    protected Student suche(String name){
        for (Student student : studentList){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

}
