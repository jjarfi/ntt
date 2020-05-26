package com.jjarfi.github.ntt.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "suku")
public class DaoSuku {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;
    @Column(name = "nm_suku")
    private String namasuku;
    private String deskripsi;
    private String link;
    private Timestamp createdate;
    private String createdby;

    public DaoSuku() {
    }

    public DaoSuku(String id, String namasuku, String deskripsi, String link, Timestamp createdate, String createdby) {
        this.id = id;
        this.namasuku = namasuku;
        this.deskripsi = deskripsi;
        this.link = link;
        this.createdate = createdate;
        this.createdby = createdby;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamasuku() {
        return namasuku;
    }

    public void setNamasuku(String namasuku) {
        this.namasuku = namasuku;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
}
