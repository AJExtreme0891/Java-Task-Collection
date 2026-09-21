package Tasks.Classes.Fahrradverleih1_17;

import java.util.ArrayList;


class Station {
    protected ArrayList<Fahrrad> Storage = new ArrayList<Fahrrad>();

    protected Station() {
    }


    protected Fahrrad leiheAus() {
        for (Fahrrad f : Storage) {
            if (!(f.isRented())) {
                if (f instanceof EBikes) {
                    if (((EBikes) f).getBattery() >= 20) {
                        f.setRented(true);
                        return f;
                    }
                } else {
                    f.setRented(true);
                    return f;
                }
            }
        }
        return null;
    }

    protected int anzahleruegbar() {
        int count = 0;
        for (Fahrrad f : Storage) {
            if (!(f.isRented())) {
                count++;
            }
        }
        return count;
    }

    public EBikes sucheBestesEBike() {
        EBikes bestes = null;
        for (Fahrrad f : Storage) {
            if (f instanceof EBikes && !f.isRented()) {
                EBikes e = (EBikes) f;
                if (bestes == null || e.getBattery() > bestes.getBattery()) {
                    bestes = e;
                }
            }
        }
        return bestes;
    }

    public ArrayList<Fahrrad> getStorage() {
        return Storage;
    }
    public void addBike(Fahrrad fahrrad){
        this.Storage.add(fahrrad);
    }
}
