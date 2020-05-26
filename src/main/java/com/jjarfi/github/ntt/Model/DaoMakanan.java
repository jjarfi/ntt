package com.jjarfi.github.ntt.Model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "makanan")
public class DaoMakanan {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "nm_makanan")
    private String namamakanan;
    private String deskripsi;
    private String link;
    private Timestamp createdate;
    private int createdby;
    private Long suku;

    public DaoMakanan() {
    }

    public DaoMakanan(Long id, String namamakanan, String deskripsi, String link, Timestamp createdate, int createdby, Long suku) {
        this.id = id;
        this.namamakanan = namamakanan;
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

    public String getNamamakanan() {
        return namamakanan;
    }

    public void setNamamakanan(String namamakanan) {
        this.namamakanan = namamakanan;
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

    public Long getSuku() {
        return suku;
    }

    public void setSuku(Long suku) {
        this.suku = suku;
    }
}
