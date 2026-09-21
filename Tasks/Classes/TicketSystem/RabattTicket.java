package Tasks.Classes.TicketSystem;

class RabattTicket extends Ticket {

    protected RabattTicket(int pSitzplatz) {
        super(pSitzplatz);
    }

    @Override
    protected double preis() {
        return super.preis() * 0.6;
    }
}