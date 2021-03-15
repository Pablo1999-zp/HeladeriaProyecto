/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.dao.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Proveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class ProveedorDao extends GenericoDao<Proveedor> {

    @PersistenceContext(unitName = "HeladeriaProyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProveedorDao() {
        super(Proveedor.class);
    }
    
}
