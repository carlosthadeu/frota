package com.thadeu.frota.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author thadeu
 */
@Entity
@Table(name = "fabricante")

public class Fabricante implements Serializable {

    @Id
    @SequenceGenerator(name="fabricante_seq", allocationSize = 1, sequenceName="seq_fabricante")
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="fabricante_seq")
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;


    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "fabricante")
    private String fabricante;



    public Fabricante(Integer id, String fabricante) {
        this.id = id;
        this.fabricante = fabricante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fabricante - código: " + id + " nome: " + fabricante + " ]";
}

}
