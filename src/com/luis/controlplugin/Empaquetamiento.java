package com.luis.controlplugin;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;


@ActionID(
        category = "File",
        id = "com.luis.controlplugin.Empaquetamiento"
)
@ActionRegistration(
        iconBase = "com/luis/controlplugin/paque.png",
        displayName = "#CTL_Empaquetamiento"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_Empaquetamiento=Empaquetado")
public final class Empaquetamiento implements ActionListener{
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
try{
    //Pido los nombres necesarios para el empaquetado
    //Nombre del jar que deseo crear ejecutable
    String jar=JOptionPane.showInputDialog("Nome de tu jar: ", e);
    //Nombre de la Main Class
    String mainclass=JOptionPane.showInputDialog("Nombre de tu Main Class: ");
    //Nombre que quiero
    String nombre=JOptionPane.showInputDialog("Nombre: ");
    //Nombre de la aplicacion creada
    String nombreapp=JOptionPane.showInputDialog("Nombre de la App ");
    //El comando entero para crearlo
    String[] cmd={"javapackager ", "-deploy ", "-native " ,"-outdir ","sample ","srcfiles ",jar,"-appclass ",mainclass,"-name ",nombre,"-title ",nombreapp };
    //llama al terminal y va pegando los codigos anteriores
    Process process=Runtime.getRuntime().exec(cmd);
    
    InputStream inputstream=process.getInputStream();
    
    BufferedInputStream bufferedinputstream =new BufferedInputStream(inputstream);
    
    JOptionPane.showMessageDialog(null,"SUU");
   
}catch(Exception ea){
    System.out.println("Error");
}
            
        }
    }

