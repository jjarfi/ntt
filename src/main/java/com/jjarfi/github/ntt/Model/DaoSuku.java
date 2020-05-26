package com.jjarfi.github.ntt.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "suku")
public class DaoSuku {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "nm_suku")
    private String namasuku;
    private String deskripsi;
    private String link;
    private Timestamp createdate;
    private int createdby;

    public DaoSuku() {
    }

    public DaoSuku(Long id, String namasuku, String deskripsi, String link, Timestamp createdate, int createdby) {
        this.id = id;
        this.namasuku = namasuku;
        this.deskripsi = deskripsi;
        this.link = link;
        this.createdate = createdate;
        this.createdby = createdby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }
}
