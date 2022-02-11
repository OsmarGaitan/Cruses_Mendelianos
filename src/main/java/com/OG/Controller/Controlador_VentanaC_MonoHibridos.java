
package com.OG.Controller;

import com.OG.Views.VentanaC_Monohibrida;
import com.OG.Views.ventana_principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



/**
 *
 * @author Osmar 
 */
public class Controlador_VentanaC_MonoHibridos implements ActionListener
 {
         
    private VentanaC_Monohibrida MH;
    
    public Controlador_VentanaC_MonoHibridos(VentanaC_Monohibrida MH) {
        this.MH = MH;
    }

 
    
   
    @Override
    public void actionPerformed(ActionEvent e) 
         {
          switch(e.getActionCommand())
          {
           case"retorno":
              showretorno();
            break; 
           case"sindrome":
               showsindrome();
               break;
           case "sano":
               showsano();
               break;
           case "idea":
               showidea();
               break;
            
                  
          }
         }

  private void showretorno() 
    {
      ventana_principal ventanap = new   ventana_principal();
       MH.showChild(ventanap,true);
      
     }

    private void showsindrome() 
      {
          
          
      }

    private void showsano() 
     {
       
     }

    private void showidea() 
      { 
      MH.showChild();
      }

  
    
 }
