package com.backend.backend.model;

public class Client {

    private String id;  // Unique identifier of the client
    private String nom;  // Client's name
    private String email;  // Client's email
    private String motDePasse;  // Client's password (ideally hashed)
    private String tel;  // Client's phone number
    private String imgClient;  // URL to the client's image
    private String panierId;  // ID of the associated Panier

    // Constructors
    public Client() {
    }

    public Client(String id, String nom, String email, String motDePasse, String tel, String imgClient, String panierId) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.tel = tel;
        this.imgClient = imgClient;
        this.panierId = panierId;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getImgClient() {
        return imgClient;
    }

    public void setImgClient(String imgClient) {
        this.imgClient = imgClient;
    }

    public String getPanierId() {
        return panierId;
    }

    public void setPanierId(String panierId) {
        this.panierId = panierId;
    }
}
