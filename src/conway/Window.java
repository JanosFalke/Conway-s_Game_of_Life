/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this timelate file, choose Tools | Templates
 * and open the timelate in the editor.
 */
package conway;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window extends JFrame implements ActionListener {

    private JPanel drawArea;
    private JPanel p1;
    private JLabel label;
    private JSlider speedSlide;

    private Cell tabCell[][];
    private final int rows;
    private final int columns;
    public int iTime;
    public int time;
    public int speed = 100;

// CONSTRUCTOR 
    public Window(int width, int height, int rows, int columns, Cell tab[][], int time) {
        this.iTime = 0;
        this.rows = rows;
        this.columns = columns;
        this.label = new JLabel (""+iTime, JLabel.CENTER);
        this.time = time;
        this.tabCell = tab;

        //----------------------------------------------------------------------------------------
        // Construction of the window
        getContentPane().setLayout(new BorderLayout());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        layout(width, height);  
        repaint();
    }

    public void layout(int maxX, int maxY) {

        this.speedSlide = new JSlider(JSlider.HORIZONTAL,
                10, 1010, this.speed);
        this.speedSlide.setMajorTickSpacing(100);
        this.speedSlide.setMinorTickSpacing(1);
        this.speedSlide.createStandardLabels(1);
        this.speedSlide.setPaintTicks(true);
        this.speedSlide.setPaintLabels(true);

        this.p1 = new JPanel(new GridLayout());
        this.p1.add(label);
        this.p1.add(this.speedSlide);
        
        getContentPane().add(p1, "South"); 

        this.drawArea = new JPanel();
        this.drawArea.setSize(maxX, maxY);
        this.drawArea.setPreferredSize(new Dimension(maxX, maxY));
        getContentPane().add(this.drawArea, "Center"); 

        pack();
        setVisible(true);
    }
  
    public void paint(Graphics g) // draw the window
    {

        this.p1.repaint();

        g = this.drawArea.getGraphics();

        int widthCase = this.getWidth() / this.columns;
        int heightCase = this.getHeight() / this.rows;

        int x = 0;
        int y = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {

                if (this.tabCell[i][j].getCell() == true) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, widthCase, heightCase);
                } else {
                    g.clearRect(x, y, widthCase, heightCase);
                }

                x += widthCase;
            }
            y += heightCase;
            x = 0;
        }

        this.label.setText(iTime+"");

    }

    public void simulation() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
        }

        while (iTime < time) {

            deplacement();
            iTime++;

            repaint();
            try {
                Thread.sleep(this.speedSlide.getValue());
            } catch (InterruptedException e) {
            }

        }

    }

    public void deplacement() {

        Cell time[][] = new Cell[this.rows][this.columns];
        initTabCell(time, this.rows, this.columns);

        for (int j = 0; j < this.rows; j++) {
            for (int k = 0; k < this.columns; k++) {
                if (isAlive(j, k)) {
                    if (getNeigbours(j, k) <= 1 || getNeigbours(j, k) > 3) {
                        time[j][k] = new Cell(false);
                    } else {
                        time[j][k] = new Cell(true);
                    }

                } else {
                    if (getNeigbours(j, k) == 3) {
                        time[j][k] = new Cell(true);

                    }
                }
            }
        }
        this.tabCell = time;

    }

  

    public void initTabCell(Cell tab[][], int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tab[i][j] = new Cell(false);

            }
        }
    }

    public int getNeigbours(int row, int column) {
        int neighbours = 0;

        if ((row > 0 && column > 0) && (row < this.rows-1 && column < this.columns-1)) {

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) {
                    } else {
                        if (this.tabCell[row + i][column + j].isAlive()) {
                            neighbours++;
                        }
                    }
                }
            }

        } else if (column == 0) {
            if (row == 0) {
                for (int i = 0; i <= 1; i++) {
                    for (int j = 0; j <= 1; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            } else if (row == this.rows) {
                for (int i = -1; i <= 0; i++) {
                    for (int j = 0; j <= 1; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            } else if(row > 0 && row < this.rows-1){
                for (int i = -1; i <= 1; i++) {
                    for (int j = 0; j <= 1; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            }
        } else if(column == this.columns-1){
            if(row == 0){
                for (int i = 0; i <= 1; i++) {
                    for (int j = -1; j <= 0; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            }
            
            else if(row == this.rows-1){
                for (int i = -1; i <= 0; i++) {
                    for (int j = -1; j <= 0; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            } else if(row > 0 && row < this.rows-1){
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 0; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            }
  
        } else if (row == 0){
            if(column > 0 && column < this.columns-1){
                for (int i = 0; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            }
        } else if (row == this.rows-1){
            if(column > 0 && column < this.columns){
                for (int i = -1; i <= 0; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i == 0 && j == 0) {
                        } else {
                            if (this.tabCell[row + i][column + j].isAlive()) {
                                neighbours++;
                            }
                        }
                    }
                }
            }
        }

        return neighbours;

    }

    public boolean isAlive(int row, int column) {
        return this.tabCell[row][column].getCell();
    }

    public void drawSquare(Graphics g) {
        int widthCase = this.getWidth() / this.columns;
        int heightCase = this.getHeight() / this.rows;

        int x = 0;
        int y = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {

                if (this.tabCell[i][j].getCell() == true) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, widthCase, heightCase);
                } else {
                    g.clearRect(x, y, widthCase, heightCase);
                    
                }
                x += widthCase;
            }
            y += heightCase;
            x = 0;
        }

    }
    

    void quitter() {
        System.exit(0);
    }

    void effacer() {
        Graphics g = this.drawArea.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

 
    private void ajouteBouton(String label, JPanel p) {
        JButton b = new JButton(label);
        p.add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }


}
