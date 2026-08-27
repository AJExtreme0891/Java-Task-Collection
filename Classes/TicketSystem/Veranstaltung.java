package Classes.TicketSystem;


import java.util.ArrayList;

class Veranstaltung {
    private String title;
    private String date;
    private int maxVisitors;
    private ArrayList<Ticket> dieTickets;


    protected Veranstaltung(String title, String date, int maxVisitors) {
        this.title = title;
        this.date = date;
        this.maxVisitors = maxVisitors;
        dieTickets = new ArrayList<Ticket>();
    }



    protected Ticket verkaufe(int pSitzplatz, boolean pErmaessigt, boolean group) {


        if (dieTickets.size() >= maxVisitors) {
            return null;
        }


        for (Ticket t : dieTickets) {
            if (t.getSitzplatz() == pSitzplatz) {
                return null;
            }
        }


        Ticket neu;

        if (pErmaessigt) {
            neu = new RabattTicket(pSitzplatz);
        }
        else if (group) {
            neu = new GroupTicket(pSitzplatz);
        } else {
            neu = new Ticket(pSitzplatz);
        }


        dieTickets.add(neu);

        return neu;
    }

    protected double gesamteinnahmen() {
        double summe = 0.0;

        for (Ticket t : dieTickets) {
            summe += t.preis();
        }

        return summe;
    }

}
