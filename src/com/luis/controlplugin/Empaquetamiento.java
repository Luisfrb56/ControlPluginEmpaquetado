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
       try{
           Runtime rt=Runtime.getRuntime();
           Process pr=rt.exec("C:\\control.exe");
           BufferedReader input=new BufferedReader(new InputStreamReader(pr.getInputStream()));
           String line=null;
           while((line=input.readLine()) !=null){
           System.out.println(line);
           
       }
           int exitVal=pr.waitFor();
           System.out.println("Exoted with error code "+exitVal);
           
       }catch(Exception ea){
           System.out.println(ea.toString());
           ea.printStackTrace();
       }
            
        }
    }

