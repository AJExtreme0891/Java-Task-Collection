package Tasks.Classes.Fahrradverleih1_17;

public class Test {
    public static void main(String[] args) {
        Station station = new Station();


        station.addBike(new Fahrrad(123));
        station.addBike(new EBikes(124,12));
        station.addBike(new EBikes(125,51));
        station.addBike(new EBikes(126,43));
        station.addBike(new EBikes(127,32));
        station.addBike(new Fahrrad(128));
        station.addBike(new Fahrrad(129));
        station.addBike(new Fahrrad(130));
        station.addBike(new Fahrrad(131));
        station.addBike(new Fahrrad(132));
        station.addBike(new Fahrrad(133));


        station.leiheAus();
        station.leiheAus();
        station.leiheAus();


        System.out.println(station.anzahleruegbar());

        System.out.println(station.sucheBestesEBike().getIdNumber());


    }
}
