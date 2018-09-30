package com.nault.helloexpertusapi.model;

import javax.persistence.*;

/**
 * Simple Java POJO for the message in DB.
 */
@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String value;
    private String language;

    public Message() {
    }

    public Message(Long id, String value, String language) {
        this.id = id;
        this.value = value;
        this.language = language;
    }

    public Message(String value, String language) {
        this.value = value;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
