package Gestion_Cinema;

public class CinemaHall {

    Seat[][] seats;

    public CinemaHall(Seat[][] seats){
        this.seats = seats;
    }

    public CinemaHall(int nbRow , int nbCol){
        seats = new Seat[nbRow][nbCol];
        for (int i = 0 ; i<nbRow ; i++)
            for (int j =0 ; j< nbCol ; j++){
                seats[i][j] = new Seat(i+1 , j+1);
            }
    }


    public void displaySeats(){
        for (Seat[] row  : seats){
            for (Seat seat : row){
                System.out.print(seat);
            }
            System.out.println();
        }
    }

    public void reserve(int row  , int col){
        if (isValidSeat(row, col)){
            seats[row-1][col-1].reserve();
        }else {
            System.out.println("Numero de siége invalide");
        }
    }
    public void release(int row  , int col){
        if (isValidSeat(row , col)){
            seats[row-1][col-1].release();
        }
    }

    public boolean isValidSeat(int row , int col){
        return row > 0 &&
                row <= seats.length &&
                col > 0 &&
                col <= seats[0].length;
    }


}
