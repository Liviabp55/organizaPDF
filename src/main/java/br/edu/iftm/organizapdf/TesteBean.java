/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.organizapdf;

import br.edu.iftm.organizapdf.entidade.PDF;
import java.io.Serializable;
import java.nio.file.Path;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.shaded.commons.io.FilenameUtils;


@Named
@SessionScoped
public class TesteBean implements Serializable{


     private UploadedFile file;
     private PDF entidade;

    public PDF getEntidade() {
        return entidade;
    }

    public void setEntidade(PDF entidade) {
        this.entidade = entidade;
    }

    public UploadedFile getFile() {
        return file;
    } 

    public void setFile(UploadedFile file) {
        this.file = file;
    }    
     

}
