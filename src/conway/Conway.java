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
public class Conway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        // To test the examples just make all comments except the one you want to run //
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////
        
        Examples ex = new Examples(2000);
        // ex.firstExample(100,200,(100/2)-10,(200/2)-20);
        // ex.secondExample(200,400,180,40);
        // ex.thirdExample(150,300,(150/2)-30,(300/2)-30);
        // ex.fourthExample(150,300,(150/2)-15,5);
        // ex.fifthExample(300,600,(300/2)-30,0);
        ex.sixthExample(250, 500, 250/2, 500/2);

        
    }
    
    
   
    
    
}
