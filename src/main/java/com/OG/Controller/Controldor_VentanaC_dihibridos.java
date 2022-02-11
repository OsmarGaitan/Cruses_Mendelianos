
package com.OG.Controller;

import com.OG.Views.VentanaC_Dihibridos;
import com.OG.Views.ventana_principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Osmar G
 */
public class Controldor_VentanaC_dihibridos implements ActionListener {
    
    private VentanaC_Dihibridos DH; 

    public Controldor_VentanaC_dihibridos(VentanaC_Dihibridos DH) {
        this.DH = DH;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                switch(e.getActionCommand())
                 { 
                  case "retornar": 
                  showretornar();
                  break;
                 }
        
        
         }

    
    
    
    private void showretornar() {
        ventana_principal vp = new ventana_principal();
        DH.showChild(vp,true);
    }

    
    
    
    
 }
 