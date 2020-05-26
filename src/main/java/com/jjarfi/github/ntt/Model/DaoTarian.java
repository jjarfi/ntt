package com.jjarfi.github.ntt.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tarian")
public class DaoTarian {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "nm_tarian")
    private String namatarian;
    private String deskripsi;
    private String link;
    private Timestamp createdate;
    private int createdby;
    private int suku;

    public DaoTarian() {
    }

    public DaoTarian(Long id, String namatarian, String deskripsi, String link, Timestamp createdate, int createdby, int suku) {
        this.id = id;
        this.namatarian = namatarian;
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

    public String getNamatarian() {
        return namatarian;
    }

    public void setNamatarian(String namatarian) {
        this.namatarian = namatarian;
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
