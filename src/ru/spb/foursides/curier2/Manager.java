package ru.spb.foursides.curier2;

public class Manager {

    //класс, описывающий менеджера

    private int id; // id в базе MySQL
    private String name; // ФИО
    private Boolean isAdmin; // Есть ли права администратора
    private String comment; // любая дополнительная информация

    public Manager(int id, String name, Boolean isAdmin, String comment) {
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public String getComment() {
        return comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
