package Gestion_Cinema;

public class Seat {

    private int row;
    private int col;
    private boolean isAvailable;

    public Seat(int row, int col) {
        this.row = row;
        this.col = col;
        this.isAvailable = true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void reserve(){
        if (isAvailable){
            isAvailable =false;
            System.out.println("place reservée avec succés");
        }else {
            System.out.println("Place deà reservée");
        }
    }

    public void release(){
        if (isAvailable){
            System.out.println("Place deja disponible ");
        }else{
            isAvailable = true;
            System.out.println("Place libéré avec succes");
        }
    }

    @Override
    public String toString() {
        if (isAvailable){
            return "[O]";
        }else{
            return "[X]";
        }
    }
}
