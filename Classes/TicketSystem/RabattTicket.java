package Classes.TicketSystem;

class RabattTicket extends Ticket {

    protected RabattTicket(int Sitzplatz) {
        super(Sitzplatz);
    }

    @Override
    protected double preis() {
        return super.preis() * 0.6;
    }
}
