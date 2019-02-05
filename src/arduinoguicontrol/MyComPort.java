/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduinoguicontrol;
import  com.fazecast.jSerialComm.*;
import java.util.ArrayList;

/**
 *
 * @author mark harrington
 */
class MyComPort
{
   
    private int portnumber = 0 ;
    private int baudrate = 9600 ;
    private SerialPort  ports [] ;
    
    private SerialPort comport ;
    private ArrayList<String> m_ports =  new ArrayList<>();
    
    public  ArrayList<String> getPorts(){
        
        ports = SerialPort.getCommPorts() ;
        int portcount = -1  ;
        
        
        for (SerialPort port : ports) {
            
         System.out.println(port.getDescriptivePortName());
         
         boolean portExists = m_ports.add(port.getSystemPortName()); 
        }
        
      
       
      return m_ports ;
        
    }
    
      public void setBaud(int baud) { 
        this.baudrate = baud ;
      }
      
      public void setPort(int port)
      {
          this.portnumber = port ;
      }
    
      public int getBaud()
      {
          return this.baudrate ;
      }
    
      public int getPortNumber()
      {  
          return this.portnumber ;
          
      }
   
      
      public void m_OpenComport(int portToOpen , int baudrate,int databits,int stopbits)
      {
          comport =ports[portToOpen] ;
          comport.setComPortParameters(baudrate,databits,stopbits,SerialPort.NO_PARITY) ;
       
         if (!comport.isOpen()== true){
         comport.openPort() ;
         System.out.println("Port now open " + comport.getSystemPortName()  ) ;
         }
         else {
            System.out.println("Port open already Closing port " + comport.getSystemPortName()) ;
            comport.closePort() ;
         }
          
          
          
          
          
      }
       
      public boolean is_open()
      {
       return comport.isOpen() ; 
      }
    
      public MyComPort()
      {
          System.out.println("default constructor called");
          
      }
    
    public void sendData(String msg , int data )
    {
       if (comport.isOpen()== true ){   
         StringBuilder sbf = new StringBuilder(msg+data);
         byte bytes[] =sbf.toString().getBytes() ;
         comport.writeBytes(bytes, bytes.length) ;
	 
           
       }
       else 
       {
        System.out.println("Port not open unebale to send bytes");
       }
    
    
    }
    
}
    

