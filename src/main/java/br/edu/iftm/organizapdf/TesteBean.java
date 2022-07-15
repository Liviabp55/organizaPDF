/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.organizapdf;

import br.edu.iftm.organizapdf.entidade.PDF;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.shaded.commons.io.FilenameUtils;
import repositorio.PdfRepositorio;

@Named
@SessionScoped
public class TesteBean implements Serializable {

    private UploadedFile file;
    private PDF entidade = new PDF();
    private List<PDF> entidades;

    
    @Inject
    private PdfRepositorio repositorio;

    public List<PDF> getEntidades() {
        return entidades;
    }

    public void setEntidades(List<PDF> entidades) {
        this.entidades = entidades;
    }

    public PDF getEntidade() {
        return entidade;
    }

    public void setEntidade(PDF entidade) {
        this.entidade = entidade;
    }

    public void upload() {
        if (file != null) {
            FacesMessage message = new FacesMessage("Successful", file.getFileName()+ " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public UploadedFile getFile() {
        return file;
    }
    
    
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void salvar() {
        repositorio.salvar(entidade);
    }

    public void listar() {
        entidades = repositorio.listar();
    }

}
