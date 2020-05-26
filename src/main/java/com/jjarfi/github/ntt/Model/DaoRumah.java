package com.jjarfi.github.ntt.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rumah")
public class DaoRumah {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nm_rumah")
    private String namarumah;
    private String deskripsi;
    private String link;
    private Timestamp createdate;
    private int createdby;
    private int suku;

    public DaoRumah() {
    }

    public DaoRumah(Long id, String namarumah, String deskripsi, String link, Timestamp createdate, int createdby, int suku) {
        this.id = id;
        this.namarumah = namarumah;
        this.deskripsi = deskripsi;
        this.link = link;
        this.createdate = createdate;
        this.createdby = createdby;
        this.suku = suku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamarumah() {
        return namarumah;
    }

    public void setNamarumah(String namarumah) {
        this.namarumah = namarumah;
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

    public int getSuku() {
        return suku;
    }

    public void setSuku(int suku) {
        this.suku = suku;
    }
}
