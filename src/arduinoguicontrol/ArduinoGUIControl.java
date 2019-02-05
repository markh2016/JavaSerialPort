/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * MD Harrington
 */
package arduinoguicontrol;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author mark
 */
public class ArduinoGUIControl {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
          
                try {
                    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                         if ("Nimbus".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                    break;
                            }
                    }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
    
                                    try {
                                            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
                        
                                        }
                        }

               Runnable task1 = new Runnable(){
 
                    @Override
                         public void run(){
                            mainFrame frame = new mainFrame() ;
                            
                            frame.setLocationRelativeTo(null);
                            frame.setResizable(false);
                            frame.setVisible(true) ;
                    }
                         
               };
               
               
               SwingUtilities.invokeLater(task1);
    }
               
               


           
              
       
                
        
         
}
    
         
                       
      
           
        
           
   
                
      

    


    

