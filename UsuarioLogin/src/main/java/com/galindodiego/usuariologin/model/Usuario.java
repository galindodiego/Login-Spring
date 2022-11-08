package com.galindodiego.usuariologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuario_id;

    private String usuario_pnome;
    private String usuario_unome;
    private String usuario_email;
    private String usuario_password;
    private String usuario_telef;

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_pnome() {
        return usuario_pnome;
    }

    public void setUsuario_pnome(String usuario_pnome) {
        this.usuario_pnome = usuario_pnome;
    }

    public String getUsuario_unome() {
        return usuario_unome;
    }

    public void setUsuario_unome(String usuario_unome) {
        this.usuario_unome = usuario_unome;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    public String getUsuario_password() {
        return usuario_password;
    }

    public void setUsuario_password(String usuario_password) {
        this.usuario_password = usuario_password;
    }

    public String getUsuario_telef() {
        return usuario_telef;
    }

    public void setUsuario_telef(String usuario_telef) {
        this.usuario_telef = usuario_telef;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario_id=" + usuario_id +
                ", usuario_pnome='" + usuario_pnome + '\'' +
                ", usuario_unome='" + usuario_unome + '\'' +
                ", usuario_email='" + usuario_email + '\'' +
                ", usuario_password='" + usuario_password + '\'' +
                ", usuario_telef='" + usuario_telef + '\'' +
                '}';
    }
}
