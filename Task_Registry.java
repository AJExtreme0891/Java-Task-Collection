
import Tasks.BasicJava.*;
import Tasks.E2ExamStudies.*;
import Tasks.IntermediateJavaWithLoops.*;
import Tasks.Aufg3_2_Felder_Arrays.*;
import Tasks.ArrayAufgaben.*;
import Tasks.Aufg3_1_Methoden.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_Registry {

    public static Map<String, Runnable> getTasks() {
        Map<String, Runnable> tasks = new LinkedHashMap<>();

        tasks.put("Run Handykosten", () -> Handykosten.Handykostenberechnen(new String[]{}));
        tasks.put("Run Wahrauswertung", () -> Wahlauswertung.main(new String[]{}));
        tasks.put("Run Temperatur", () -> Temperatur.main(new String[]{}));
        tasks.put("Run Parkscheinautomat", () -> Parkscheinautomat.main(new String[]{}));
        tasks.put("Run Pizzaservice", () -> Pizzaservice_vone.main(new String[]{}));
        tasks.put("Run Maklerfirma", () -> Maklerfirma.Grundstueckpreisberechnen(new String[]{}));
        tasks.put("Run BMIRechner", () -> BMIRechner.main(new String[]{}));
        tasks.put("Run SchaefchenZaehlen", () -> {
            try {
                SchaefchenZaehlen.main(new String[]{});
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        tasks.put("Run Rechtecke", () -> Aufg06_Rechtecke.main(new String[]{}));
     //   tasks.put("Run MethodsAndstuff", () -> MethodsAndStuff.main(new String[]{}));
        tasks.put("Run averageRunThingyMark", () -> averageRunThingyMark.main(new String[]{}));
        tasks.put("Run Aufg08_Summe", () -> Aufg08_Summe.main(new String[]{}));
        tasks.put("Run AreaOfCircle", () -> AreaOfCircle.main(new String[]{}));
        tasks.put("Run selfStudyfahrkostenRechner", () -> selfStudyFahrkostenRechner.main(new String[]{}));
        tasks.put("Run selfStudyLehrerFallen", () -> selfStudyLehrerFallen.main(new String[]{}));
        tasks.put("Run selfStudyNotenprogramm", () -> selfStudyNotenprogramm.main(new String[]{}));
        tasks.put("Run selfstudyParkscheinAutomat", () -> selfStudyParkscheinAutomat.main(new String[]{}));
        tasks.put("Run Bahnreise", () -> Bahnreise.main(new String[]{}));
        tasks.put("Run Bleistifte", () -> Bleistifte.main(new String[]{}));
        tasks.put("Run FahrkostenRechner", () -> Fahrtkostenrechner.main(new String[]{}));
        tasks.put("Run Körpergröße", () -> Koepergroeße.main(new String[]{}));
        tasks.put("Run Pizzaservice_version_one", () -> Pizzaservice_vone.main(new String[]{}));

        return tasks;
    }
}