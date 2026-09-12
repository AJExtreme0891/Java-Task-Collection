package ExamPrep.Q1_First_Exam_Prep.RoundOne;

class Film {
private String title;
private int year;
private int length;


protected Film(String title, int year, int length){
    this.length = length;
    this.title = title;
    this.year = year;
}


protected boolean istLang(){
    return this.length >= 120;
}

}
