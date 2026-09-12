package ExamPrep.Q1_First_Exam_Prep.Round3.Challenge1;

public class Test {
    public static void main(String[] args) {
        Fuhrpark fuhrpark = new Fuhrpark();

        fuhrpark.addFahrzeug(new PKW("Mazda",123,1,31));
        fuhrpark.addFahrzeug(new LKW("Summer",12,15,3,1231));
        fuhrpark.addFahrzeug(new PKW("Mazda",12354,123,7));
        fuhrpark.addFahrzeug(new PKW("Mazda",122,2,71));

//        System.out.println(fuhrpark.berechneGesamtkosten());
//        System.out.println(fuhrpark.findeTeuerstesFahrzeug().getBaujahr());


        Fahrzeug a = new PKW("asd",12,14,362);
        Fahrzeug b = new LKW("asd",12,14,362,123);
        PKW c = new PKW("aas", 123,12311,1321);

        System.out.println(b.beschreibe(a));
        System.out.println(a.info());
    }
}
