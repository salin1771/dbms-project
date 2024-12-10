/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruas.entities.com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sathv
 */
@Entity
@Table(name = "adoptiondetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adoptiondetails.findAll", query = "SELECT a FROM Adoptiondetails a")
    , @NamedQuery(name = "Adoptiondetails.findByAdoptionID", query = "SELECT a FROM Adoptiondetails a WHERE a.adoptionID = :adoptionID")})
public class Adoptiondetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AdoptionID")
    private Integer adoptionID;
    @JoinColumn(name = "PetID", referencedColumnName = "PetID")
    @ManyToOne(optional = false)
    private Pet petID;
    @JoinColumn(name = "UserID", referencedColumnName = "UserID")
    @ManyToOne(optional = false)
    private User userID;

    public Adoptiondetails() {
    }

    public Adoptiondetails(Integer adoptionID) {
        this.adoptionID = adoptionID;
    }

    public Integer getAdoptionID() {
        return adoptionID;
    }

    public void setAdoptionID(Integer adoptionID) {
        this.adoptionID = adoptionID;
    }

    public Pet getPetID() {
        return petID;
    }

    public void setPetID(Pet petID) {
        this.petID = petID;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adoptionID != null ? adoptionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adoptiondetails)) {
            return false;
        }
        Adoptiondetails other = (Adoptiondetails) object;
        if ((this.adoptionID == null && other.adoptionID != null) || (this.adoptionID != null && !this.adoptionID.equals(other.adoptionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ruas.entities.com.Adoptiondetails[ adoptionID=" + adoptionID + " ]";
    }
    
}
