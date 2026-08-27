package Classes.TicketSystem;

class GroupTicket extends Ticket{

    protected GroupTicket(int pSitzplatz) {
        super(pSitzplatz);
    }

    @Override
    protected double preis() {
        return super.preis() * 0.8;
    }
}
