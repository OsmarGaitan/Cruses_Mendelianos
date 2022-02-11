
package com.OG.Controller;

import com.OG.Views.VentanaC_Dihibridos;
import com.OG.Views.VentanaC_Monohibrida;
import com.OG.Views.ventana_principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import javax.swing.WindowConstants;

/**
 *
 * @author Osmar G
 */
public class VentanaPrincipal_Controlador  implements ActionListener
 {
  private ventana_principal vp; 

    public VentanaPrincipal_Controlador(ventana_principal vp) {
        this.vp = vp;
    }
  
          
    @Override
    public void actionPerformed(ActionEvent e)
       {
              switch(e.getActionCommand())
                {
            
            case"CruseMH":
                showCruseMH();
                break;
            case"CruseDh":
                showCruseDh();
                break;
            case"salida":
              System.exit(0);
             break;
                
                 }
       }

    private void showCruseMH() 
    {     
      VentanaC_Monohibrida CrusesMonohibrido = new VentanaC_Monohibrida ();
       vp.showChild(CrusesMonohibrido,true);  
      
    }

    private void showCruseDh() 
    {
     VentanaC_Dihibridos CrusesDihibrido = new VentanaC_Dihibridos();
     vp.howChild(CrusesDihibrido,true);
    }


  
    
    
 }
