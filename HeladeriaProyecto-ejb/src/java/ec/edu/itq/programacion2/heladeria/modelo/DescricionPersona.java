/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "descricion_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DescricionPersona.findAll", query = "SELECT d FROM DescricionPersona d")
    , @NamedQuery(name = "DescricionPersona.findById", query = "SELECT d FROM DescricionPersona d WHERE d.id = :id")
    , @NamedQuery(name = "DescricionPersona.findByFechaDeNacimiento", query = "SELECT d FROM DescricionPersona d WHERE d.fechaDeNacimiento = :fechaDeNacimiento")
    , @NamedQuery(name = "DescricionPersona.findByTelefono", query = "SELECT d FROM DescricionPersona d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "DescricionPersona.findByCorreo", query = "SELECT d FROM DescricionPersona d WHERE d.correo = :correo")})
public class DescricionPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha_de_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaDeNacimiento;
    @Column(name = "telefono")
    private Integer telefono;
    @Size(max = 2147483647)
    @Column(name = "correo")
    private String correo;

    public DescricionPersona() {
    }

    public DescricionPersona(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescricionPersona)) {
            return false;
        }
        DescricionPersona other = (DescricionPersona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.DescricionPersona[ id=" + id + " ]";
    }
    
}
