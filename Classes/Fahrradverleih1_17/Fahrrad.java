package Classes.Fahrradverleih1_17;

class Fahrrad {
    private int idNumber;
    private boolean isRented;

    protected Fahrrad(int idNumber){
        this.idNumber = idNumber;

    }
    protected void setRented(boolean rented){
        this.isRented = rented;
    }
    protected boolean isRented(){
        return this.isRented;
    }




}
