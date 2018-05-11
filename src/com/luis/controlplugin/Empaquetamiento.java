package com.luis.controlplugin;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.AbstractAction;
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
        //Un comando para abrir la terminal.
try{
    Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K start cmd.exe");
   
}catch(Exception ea){
    
}
            
        }
    }

