/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import br.edu.iftm.organizapdf.entidade.PDF;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author iftm
 */
public class PdfRepositorio implements Serializable{

    @Inject
    private EntityManager entityManager;

    public PDF salvar(PDF entidade) {
        entityManager.getTransaction().begin();
        entidade = entityManager.merge(entidade);
        entityManager.getTransaction().commit();
        return entidade;
    }
    
    public List<PDF> listar (){
        List<PDF> lista;
        lista = entityManager.createQuery("from PDF").getResultList();
        return lista;
    }

}
