package com.jjarfi.github.ntt.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "musik")
public class DaoMusik {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;
    @Column(name = "nm_musik")
    private String namamusik;
    private String deskripsi;
    private String link;
    private Timestamp createdate;
    private String createdby;
    private String suku;

    public DaoMusik() {
    }

    public DaoMusik(String id, String namamusik, String deskripsi, String link, Timestamp createdate, String createdby, String suku) {
        this.id = id;
        this.namamusik = namamusik;
        this.deskripsi = deskripsi;
        this.link = link;
        this.createdate = createdate;
        this.createdby = createdby;
        this.suku = suku;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamamusik() {
        return namamusik;
    }

    public void setNamamusik(String namamusik) {
        this.namamusik = namamusik;
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

    public String getSuku() {
        return suku;
    }

    public void setSuku(String suku) {
        this.suku = suku;
    }
}
