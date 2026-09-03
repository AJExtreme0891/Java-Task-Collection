package Classes.TicketSystem;

class GroupTicket extends Ticket{

    protected GroupTicket(int sitzplatz) {
        super(sitzplatz);
    }

    @Override
    protected double preis() {
        return super.preis() * 0.8;
    }
}
