
package Controladores;

import java.awt.event.ActionListener;
import Modelos.FichaBModelo;
import Vistas.FichaBibliografica1;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class fichaControlador implements ActionListener{
    FichaBibliografica1 vtnFichaB;
    FichaBModelo Fichamodelo =new FichaBModelo();
    
    
    public enum Accionficha{
        _GUARDAR,
        _SELECCIOND
        
    }
    public fichaControlador (FichaBibliografica1 vistas){
       this.vtnFichaB = vistas;   
       llenarcbDpto();
    }

     public void iniciar(){
        
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vtnFichaB);
            vtnFichaB.setVisible(true);
            
            
        }
        catch (UnsupportedLookAndFeelException ex){}
         catch (ClassNotFoundException ex){}
         catch (InstantiationException ex){}
         catch (IllegalAccessException ex){}
        
         this.vtnFichaB.jGUARDAR.setActionCommand("_GUARDAR");
        this.vtnFichaB.jGUARDAR.addActionListener(this);
        
        this.vtnFichaB.jCombDPT.setActionCommand("_SELECCIOND");
        this.vtnFichaB.jCombDPT.addActionListener(this);
        
     }
      
     
     @Override
     public void actionPerformed(ActionEvent e){
         
        
        switch(Accionficha.valueOf(e.getActionCommand())){
            case _SELECCIOND:{ 
                llenarcbMpios();
		break;       
            }
            case _GUARDAR:{
                if(this.Fichamodelo.guardarficha(
                         
            this.vtnFichaB.jFech_nacimiento1.getDateFormatString(),
                        this.vtnFichaB.jnombresolic.getText(),
                        this.vtnFichaB.jsegundonombresolic.getText(),
                        this.vtnFichaB.japellidosolic.getText(),
                        this.vtnFichaB.jsegundoapellidosolic.getText(),
                        this.vtnFichaB.jcedula.getText(),
                        this.vtnFichaB.jComTipo_Documento.getSelectedItem().toString(),
                        this.vtnFichaB.jFech_exp.getDateFormatString(),
                        this.vtnFichaB.jdireccion.getText(),
                        this.vtnFichaB.jCombDPT.getSelectedItem().toString(),
                        this.vtnFichaB.jComboBoxCiudad.getSelectedItem().toString(),
                        this.vtnFichaB.jTelefono.getText(),
                        this.vtnFichaB.jFech_nacimiento1.getDateFormatString(), 
                        this.vtnFichaB.jgrado_escolaridad1.getSelectedItem().toString(), 
                        this.vtnFichaB.jocupacion.getText(),
                        this.vtnFichaB.jestrato.getSelectedItem().toString(),
                        this.vtnFichaB.jsueldo.getText(), 
                        this.vtnFichaB.jCelular.getText(),
                        this.vtnFichaB.jCheckBox1_desplazado.getActionCommand(),
                        this.vtnFichaB.jCheckBox2_vulnerable.getActionCommand(),
                        this.vtnFichaB.jmotivo_consulta.getText(),
                        this.vtnFichaB.jcodigo_e.getText())
                        ){
                    
                }
                
            }
     
        }

    }
    
     private void llenarcbMpios(){
         String dpto = this.vtnFichaB.jComboBoxCiudad.getSelectedItem().toString();
         
         vtnFichaB.jComboBoxCiudad.removeAllItems();
         int longitud = this.Fichamodelo.LlenarComboMpios(this.Fichamodelo.codigoDpto(dpto)).length;
         for (int i = 0; i < longitud; i++){
             vtnFichaB.jComboBoxCiudad.addItem(this.Fichamodelo.LlenarComboMpios(this.Fichamodelo.codigoDpto(dpto))[i]);
         }
     }
     
     private void llenarcbDpto(){
   int longitud = this.Fichamodelo.LlenarComboDptos().length;
         for (int i = 0; i < longitud; i++){
             vtnFichaB.jCombDPT.addItem(this.Fichamodelo.LlenarComboDptos()[i]);
             
         }}
}
