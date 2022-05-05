package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String group;
    private Date incoming;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getIncoming() {
        return incoming;
    }

    public void setIncoming(Date incoming) {
        this.incoming = incoming;
    }
}
