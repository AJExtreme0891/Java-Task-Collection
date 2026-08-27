package Classes.Fahrradverleih1_17;

class EBikes extends Fahrrad{
    private int battery;

    protected EBikes(int idNumber, int battery) {
        super(idNumber);
        this.battery = battery;
    }

    int getBattery(){
        return this.battery;
    }


}
