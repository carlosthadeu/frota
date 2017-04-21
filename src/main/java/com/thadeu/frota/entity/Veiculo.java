package com.thadeu.frota.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Desktop on 19/04/2017.
 */

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
    @Id
    @SequenceGenerator(name="veiculo_seq", allocationSize = 1, sequenceName="seq_veiculo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="veiculo_seq")
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 7, max = 7)
    @Column(name = "placa")
    private String placa;

    @Basic(optional = false)
    @Size(min = 17, max = 17)
    @Column(name = "chassi")
    private String chassi;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thadeu.frota.entity.Veiculo[ id=" + id + " ]";
    }


}
