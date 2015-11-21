package ru.spb.foursides.curier2;

public class Adress {

    //Класс для хранения разнообразных адресов

    private long id;
    private String country; //страна. По умолчанию - Россия
    private String state; //область
    private String region; //район
    private String city; //город, поселок, деревня
    private String street; //улица
    private String building; //дом, строение
    private String corpus; //корпус
    private String liter; //"литера"
    private String room; //квартира, комната, офис, помещение
    private int postIndex; //почтовый индекс
    private String comment; //любая дополнительная информация

    public Adress(long id, String country, String state, String region, String city, String street, String building, String corpus, String liter, String room, int postIndex, String comment) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.region = region;
        this.city = city;
        this.street = street;
        this.building = building;
        this.corpus = corpus;
        this.liter = liter;
        this.room = room;
        this.postIndex = postIndex;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getCorpus() {
        return corpus;
    }

    public String getLiter() {
        return liter;
    }

    public String getRoom() {
        return room;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public String getComment() {
        return comment;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
