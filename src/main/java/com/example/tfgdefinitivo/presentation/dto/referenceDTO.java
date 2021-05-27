package com.example.tfgdefinitivo.presentation.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "reference")
public class referenceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idRef;
    private String doi;
    private int idDL;
    private boolean duplicate;
    private articleDTO art;
    private digitalLibraryDTO dl;


    public referenceDTO(int aux, String aux2, int aux3) {
        this.idRef = aux;
        this.doi = aux2;
        this.idDL = aux3;
    }

    public int getIdRef() {
            return idRef;
        }
    @XmlElement
    public void setIdRef(int idRef) {
        this.idRef = idRef;
    }

    public String getDoi() {
        return doi;
    }
    @XmlElement
    public void setDoi(String doi) {
        this.doi = doi;
    }

    public int getidDL() {
        return idDL;
    }
    @XmlElement
    public void setidDL(int idDL) {
        this.idDL = idDL;
    }

    public articleDTO getArt() {
        return art;
    }
    @XmlElement
    public void setArt(articleDTO art) {
        this.art = art;
    }

    public digitalLibraryDTO getDl() {
        return dl;
    }
    @XmlElement
    public void setDl(digitalLibraryDTO dl) {
        this.dl = dl;
    }
}
