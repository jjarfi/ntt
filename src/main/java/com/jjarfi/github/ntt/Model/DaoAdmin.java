package com.jjarfi.github.ntt.Model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class DaoAdmin {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nama;
    private String email;
    @Column(name = "no_hp")
    private String nohp;
    private Boolean status;
    private String username;
    private String password;

    public DaoAdmin() {

    }

    public DaoAdmin(int id, String nama, String email, String nohp, Boolean status, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.nohp = nohp;
        this.status = status;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
