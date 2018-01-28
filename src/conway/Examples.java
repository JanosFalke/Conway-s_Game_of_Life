/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conway;

/**
 *
 * @author janosfalke
 */
public class Examples {

    private int time;
    
    public Examples( int time ){
        this.time = time;
    }
    
    public Examples(){
        this.time = 3000;
    }
    
    
    public void sixthExample(int rows, int columns, int rowDepart, int columnDepart) {
        Cell sixthExample[][] = sixthExampleTab(rows, columns, rowDepart, columnDepart);

        Window game6 = new Window(1200, 600, rows, columns, sixthExample, this.time);
        game6.simulation();
    }
    
    
    public void fifthExample(int rows, int columns, int rowDepart, int columnDepart) {
        Cell fifthExample[][] = fifthExampleTab(rows, columns, rowDepart, columnDepart);

        Window game5 = new Window(1200, 600, rows, columns, fifthExample, this.time);
        game5.simulation();
    }
    
    
    public void fourthExample(int rows, int columns, int rowDepart, int columnDepart) {
        Cell fourthExample[][] = fourthExampleTab(rows, columns, rowDepart, columnDepart);

        Window game4 = new Window(1200, 600, rows, columns, fourthExample, this.time);
        game4.simulation();
    }

    public void thirdExample(int rows, int columns, int rowDepart, int columnDepart) {
        Cell thirdExample[][] = thirdExampleTab(rows, columns, rowDepart, columnDepart);

        Window game3 = new Window(1200, 600, rows, columns, thirdExample, this.time);
        game3.simulation();
    }

    public void secondExample(int rows, int columns, int rowDepart, int columnDepart) {
        Cell secondExample[][] = secondExampleTab(rows, columns, rowDepart, columnDepart);

        Window game2 = new Window(1200, 600, rows, columns, secondExample, this.time);
        game2.simulation();

    }

    public void firstExample(int rows, int columns, int rowDepart, int columnDepart) {
        Cell firstExample[][] = firstExampleTab(rows, columns, rowDepart, columnDepart);

        Window game = new Window(1200, 600, rows, columns, firstExample, this.time);
        game.simulation();

    }
    
    
    private Cell[][] sixthExampleTab(int rows, int columns, int rowDep, int colDep) {
        Cell tab[][] = new Cell[rows][columns];
    
         //Draw by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if ((i == rowDep && (j == colDep+18))) {
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+1 && (j == colDep+17 || j == colDep+18 || j == colDep+19))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+2 && (j == colDep+12 || j == colDep+13 || j == colDep+14 || j == colDep+19 || j == colDep+20))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+3 && (j == colDep+11 || j == colDep+14 || j == colDep+15 || j == colDep+16 || j == colDep+19 || j == colDep+21 || j == colDep+22))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+4 && (j == colDep+10 || j == colDep+14 || j == colDep+16 || j == colDep+16 || j == colDep+19 || j == colDep+21))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+5 && (j == colDep+10 || j == colDep+15 || j == colDep+17 || j == colDep+19 || j == colDep+21 || j == colDep+23 || j == colDep+24))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+6 && (j == colDep+12 || j == colDep+17 || j == colDep+19 || j == colDep+23 || j == colDep+24))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+7 && (j == colDep || j == colDep+1 || j == colDep+2 || j == colDep+3 ||  j == colDep+9 || j == colDep+11 || j == colDep+16 || j == colDep+20 || j == colDep+22 || j == colDep+23 || j == colDep+24))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+8 && (j == colDep || j == colDep+4 || j == colDep+5 || j == colDep+7 ||  j == colDep+9 || j == colDep+10 || j == colDep+11 || j == colDep+13 || j == colDep+14 || j == colDep+24 || j == colDep+25))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+9 && (j == colDep || j == colDep+6 || j == colDep+7 || j == colDep+13 ))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+10 && (j == colDep+1 || j == colDep+4 || j == colDep+5 || j == colDep+7 || j == colDep+10 || j == colDep+13 || j == colDep+15 || j == colDep+16 ))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+11 && (j == colDep+7 || j == colDep+9 || j == colDep+11 || j == colDep+13 || j == colDep+15 || j == colDep+17 || j == colDep+23 || j == colDep+24 || j == colDep+25 || j == colDep+26 ))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+12 && (j == colDep+1 || j == colDep+4 || j == colDep+5 || j == colDep+7 || j == colDep+10 || j == colDep+13 || j == colDep+16 || j == colDep+17 || j == colDep+19 || j == colDep+21 || j == colDep+22 || j == colDep+26 ))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+13 && (j == colDep || j == colDep+6 || j == colDep+7 || j == colDep+11 || j == colDep+13 || j == colDep+15 || j == colDep+19 || j == colDep+20 || j == colDep+26 ))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+14 && (j == colDep || j == colDep+4 || j == colDep+5 || j == colDep+7 || j == colDep+9 || j == colDep+10 || j == colDep+13 || j == colDep+16 || j == colDep+19 || j == colDep+21 || j == colDep+22 || j == colDep+25 ))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+15 && (j == colDep || j == colDep+1 || j == colDep+2 || j == colDep+3 || j == colDep+9 || j == colDep+11 || j == colDep+13 || j == colDep+15 || j == colDep+17 || j == colDep+19))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+16 && (j == colDep+10 || j == colDep+11 || j == colDep+13 || j == colDep+16 || j == colDep+19 || j == colDep+21 || j == colDep+22 || j == colDep+25))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+17 && (j == colDep+13 || j == colDep+19 || j == colDep+20 || j == colDep+26))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+18 && (j == colDep+1 || j == colDep+2 || j == colDep+12 || j == colDep+13 || j == colDep+15 || j == colDep+16 || j == colDep+17 || j == colDep+19 || j == colDep+21 || j == colDep+22 || j == colDep+26))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+19 && (j == colDep+2 || j == colDep+3 || j == colDep+4 || j == colDep+6 || j == colDep+10 || j == colDep+15 || j == colDep+17 || j == colDep+23 || j == colDep+24 || j == colDep+25 || j == colDep+26))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+20 && (j == colDep+2 || j == colDep+3 || j == colDep+7 || j == colDep+9 || j == colDep+14))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+21 && (j == colDep+2 || j == colDep+3 || j == colDep+5 || j == colDep+7 || j == colDep+9 || j == colDep+11 || j == colDep+16))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+22 && (j == colDep+5 || j == colDep+7 || j == colDep+10 || j == colDep+12 || j == colDep+16))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+23 && (j == colDep+4 || j == colDep+5 || j == colDep+7 || j == colDep+10 || j == colDep+11 || j == colDep+12 || j == colDep+15))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+24 && (j == colDep+6 || j == colDep+7 || j == colDep+12 || j == colDep+13 || j == colDep+14))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+25 && (j == colDep+7 || j == colDep+8 || j == colDep+9))){
                    tab[i][j] = new Cell(true);
                } else if((i == rowDep+26 && (j == colDep+8))){
                    tab[i][j] = new Cell(true);
                
                
                //All the other cells are empty
                } else {
                    tab[i][j] = new Cell(false);
                }
            }
        }
        return tab;
    }

    
    private Cell[][] fifthExampleTab(int rows, int columns, int rowDep, int colDep) {
        Cell tab[][] = new Cell[rows][columns];

        //Draw by column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                //Leftsides vessels
                if ((j == colDep) && (i == rowDep+15 || i == rowDep+17 || i == rowDep+33 || i == rowDep+35)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+1 || j == colDep+3) && (i == rowDep+18 || i == rowDep+32)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+2) && (i == rowDep+14 || i == rowDep+18 || i == rowDep+32 || i == rowDep+36)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+4) && (i == rowDep+15 || i == rowDep+18 || i == rowDep+32 || i == rowDep+35)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+5) && (i == rowDep+16 || i == rowDep+17 || i == rowDep+18 || i == rowDep+32 || i == rowDep+33 || i == rowDep+34)) {
                    tab[i][j] = new Cell(true);
                
                //Midside vessels
                } else if ((j == colDep+58) && (i == rowDep+13 || i == rowDep+15 || i == rowDep+35 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+59 || j == colDep+61) && (i == rowDep+16 || i == rowDep+34)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+60) && (i == rowDep+12 || i == rowDep+16 || i == rowDep+34 || i == rowDep+38)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+62) && (i == rowDep+13 || i == rowDep+16 || i == rowDep+34 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+63) && (i == rowDep+14 || i == rowDep+15 || i == rowDep+16 || i == rowDep+34 || i == rowDep+35 || i == rowDep+36)) {
                    tab[i][j] = new Cell(true);
                
                //Rightside vessels
                } else if ((j == colDep+83) && (i == rowDep+10 || i == rowDep+12 || i == rowDep+38 || i == rowDep+40)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+84 || j == colDep+87) && (i == rowDep+13 || i == rowDep+37 )) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+85 || j == 86) && (i == rowDep+9 || i == rowDep+13 || i == rowDep+37 || i == rowDep+41)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+88) && (i == rowDep+10 || i == rowDep+13 || i == rowDep+37 || i == rowDep+40)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+89) && (i == rowDep+11 || i == rowDep+12 || i == rowDep+13 || i == rowDep+37 || i == rowDep+38 || i == rowDep+39)) {
                    tab[i][j] = new Cell(true);
                
                //Figure a droite 
                } else if ((j == colDep+93) && (i == rowDep+21 || i == rowDep+22 || i == rowDep+28 || i == rowDep+29)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+94) && (i == rowDep+14 || i == rowDep+16 || i == rowDep+20 || i == rowDep+21 || i == rowDep+23 || i == rowDep+27 || i == rowDep+29 || i == rowDep+30 || i == rowDep+34 || i == rowDep+36)) {
                    tab[i][j] = new Cell(true);
                } else if ((j == colDep+95) && (i == rowDep+13 || i == rowDep+19 || i == rowDep+22 || i == rowDep+28 || i == rowDep+31 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);    
                } else if ((j == colDep+96 || j == colDep+97) && (i == rowDep+13 || i == rowDep+17 || i == rowDep+33 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);    
                } else if ((j == colDep+98) && (i == rowDep+13 || i == rowDep+21 || i == rowDep+23 || i == rowDep+24 || i == rowDep+26 || i == rowDep+27 || i == rowDep+29 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);    
                } else if ((j == colDep+99) && (i == rowDep+13 || i == rowDep+16 || i == rowDep+21 || i == rowDep+22 || i == rowDep+23 || i == rowDep+27 || i == rowDep+28 || i == rowDep+29 || i == rowDep+34 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);    
                } else if ((j == colDep+100) && (i == rowDep+13 || i == rowDep+14 || i == rowDep+15 || i == rowDep+22 || i == rowDep+28 || i == rowDep+35 || i == rowDep+36 || i == rowDep+37)) {
                    tab[i][j] = new Cell(true);          
                    
                //All the other cells are empty
                } else {
                    tab[i][j] = new Cell(false);
                }
            }
        }
        return tab;
    }
    
    
    private Cell[][] fourthExampleTab(int rows, int columns, int rowDep, int colDep) {
        Cell tab[][] = new Cell[rows][columns];

        //Draw by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (((i == rowDep+5 || i == rowDep+23) && (j == colDep || j == colDep+1 || j == colDep+4 || j == colDep+5))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+6 || i == rowDep+22) && (j == colDep+5 || j == colDep+6))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+7 || i == rowDep+21) && (j == colDep+2 || j == colDep+3 || j == colDep+5))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+8 || i == rowDep+20) && (j == colDep+2 || j == colDep+9))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+9 || i == rowDep+19) && j == colDep+9)) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+10 || i == rowDep+18) && (j == colDep+3 || j == colDep+10))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+11 || i == rowDep+17) && (j == colDep+4 || j == colDep+6 || j == colDep+8 || j == colDep+9))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+12 || i == rowDep+16) && (j == colDep || j == colDep+2 || j == colDep+8 || j == colDep+9))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+13 || i == rowDep+15) && (j >= colDep && j <= colDep+7))) {
                    tab[i][j] = new Cell(true);
 
                //All the other cells are empty
                } else {
                    tab[i][j] = new Cell(false);
                }
            }
        }
        return tab;
    }
    

    private Cell[][] thirdExampleTab(int rows, int columns, int rowDep, int colDep) {
        Cell tab[][] = new Cell[rows][columns];

        //Draw by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                //The top and the bottom
                if (((i == rowDep+5 || i == rowDep+50) && (j == colDep+17 || j == colDep+30))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+6 || i == rowDep+7 || i == rowDep+48 || i == rowDep+49) && (j == colDep+10 || j == colDep+11 || j == colDep+36 || j == colDep+37))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+7 || i == rowDep+48) && (j == colDep+9 || j == colDep+15 || j == colDep+16 || j == colDep+31 || j == colDep+32 || j == colDep+38))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+8 || i == rowDep+47) && (j == colDep+15 || j == colDep+16 || j == colDep+18 || j == colDep+19 || j == colDep+28 || j == colDep+29 || j == colDep+31 || j == colDep+32 ))) {
                    tab[i][j] = new Cell(true);
                } else if (((i == rowDep+9 || i == rowDep+46) && (j == colDep+17 || j == colDep+30))) {
                    tab[i][j] = new Cell(true);
                    
                //The middle
                } else if (((i == rowDep+13|| i == rowDep+42) && (j == colDep+3 || j == colDep+44))) {
                    tab[i][j] = new Cell(true);    
                } else if (((i == rowDep+14 || i == rowDep+15 || i == rowDep+40 || i == rowDep+41) && (j == colDep+2 || j == colDep+3 || j == colDep+44 || j == colDep+45))) {
                    tab[i][j] = new Cell(true);    
                } else if (((i == rowDep+19 || i == rowDep+20 || i == rowDep+35 || i == rowDep+36) && (j == colDep+3 || j == colDep+4 || j == colDep+43 || j == colDep+44))) {
                    tab[i][j] = new Cell(true); 
                } else if (((i == rowDep+21 || i == rowDep+34) && (j == colDep+1 || j == colDep+5 || j == colDep+42 || j == colDep+46))) {
                    tab[i][j] = new Cell(true);  
                } else if (((i == rowDep+22 || i == rowDep+23 || i == rowDep+32 || i == rowDep+33) && (j == colDep+4 || j == colDep+43))) {
                    tab[i][j] = new Cell(true);  
                      
                //All the other cells are empty
                } else {
                    tab[i][j] = new Cell(false);
                }
            }
        }
        return tab;
    }

    private Cell[][] secondExampleTab(int rows, int columns, int rowDep, int colDep) {
        Cell tab[][] = new Cell[rows][columns];

        // colDep = 35
        
        // Draw by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if ((i == rowDep && (j == colDep+12 || j == colDep+13))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+1 && (j == colDep+11 || j == colDep+15))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+2 && (j == colDep+10 || j == colDep+16 || j == colDep+24))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+3 && (j == colDep || j == colDep+1 || j == colDep+10 || j == colDep+14 || j == colDep+16 || j == colDep+17 || j == colDep+22 || j == colDep+24))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+4 && (j == colDep || j == colDep+1 || j == colDep+10 || j == colDep+16 || j == colDep+20 || j == colDep+21))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+5 && (j == colDep+11 || j == colDep+15 || j == colDep+20 || j == colDep+21 || j == colDep+34 || j == colDep+35))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+6 && (j == colDep+12 || j == colDep+13 || j == colDep+20 || j == colDep+21 || j == colDep+34 || j == colDep+35))) {
                    tab[i][j] = new Cell(true);
                } else if ((i == rowDep+7 && (j == colDep+22 || j == colDep+24))) {
                    tab[i][j] = new Cell(true);
                } else if (i == rowDep+8 && j == colDep+24) {
                    tab[i][j] = new Cell(true);
                } else {
                    tab[i][j] = new Cell(false);
                }
            }
        }
        return tab;
    }

    private Cell[][] firstExampleTab(int rows, int columns, int rowDep, int colDep) {
        Cell tab[][] = new Cell[rows][columns];

        //Draw by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if ((i == rowDep && (j > colDep && j < colDep+11))) {
                    tab[i][j] = new Cell(true);
                } else {
                    tab[i][j] = new Cell(false);
                }
            }
        }
        return tab;
    }

}
