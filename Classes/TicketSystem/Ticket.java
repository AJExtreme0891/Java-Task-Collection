package Classes.TicketSystem;

class Ticket {
    private int sitzplatz;

    protected Ticket(int sitzplatz) {
        this.sitzplatz = sitzplatz;
    }

    protected int getSitzplatz() {
        return sitzplatz;
    }

    protected double preis() {
        return 20.0;
    }
}
