package com.rafaeldeluca.investmentaggregator.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID clientID;
    @Column(name="clientname")
    private String clientName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @CreationTimestamp
    private Instant creationTimestamp;
    @UpdateTimestamp
    private Instant updateTimestamp;

    public Client () {

    }

    public Client(UUID clientID, String clientName, String email, String password, Instant creationTimestamp, Instant updateTimestamp) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.email = email;
        this.password = password;
        this.creationTimestamp = creationTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public UUID getClientID() {
        return clientID;
    }

    public void setClientID(UUID clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Instant creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Instant getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Instant updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID= " + clientID +
                ", clientName= '" + clientName + '\'' +
                ", email= '" + email + '\'' +
                '}';
    }
}