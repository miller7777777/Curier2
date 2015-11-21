package ru.spb.foursides.curier2;

public class Manager {

    //класс, описывающий менеджера

    private int id; // id в базе MySQL
    private String name; // ФИО
    private Boolean isAdmin; // Есть ли права администратора
    private String comment; // любая дополнительная информация
    private String login; // любая дополнительная информация
    private String pass; // любая дополнительная информация
    private int passHash; // любая дополнительная информация

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLogin() {

        return login;
    }

    public int getPassHash() {
        return passHash;
    }

    public Manager(int id, String name, Boolean isAdmin, String comment) {
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
        this.comment = comment;
        this.login = login;

        this.pass = pass;
        this.passHash = pass.hashCode();
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
