package ru.spb.foursides.curier2;

import java.util.Date;

public class CurierTask {

    //класс, описывающий вызов курьера

    private long id; //id в базе MySQL
    private Client client; //клиент
    private Date dateFrom; //время, к которому должен подъехать курьер
    private Date dateTo; //время, до которого может подъехать курьер
    private Adress adressGetting; //адрес забора груза
    private Adress adressDelivery; //адрес доставки груза
    private String cargo; //груз
    private Manager manager; //менеджер, оформивший вызов
    private Curier curier; //курьер
    private Boolean autoTask; //является ли задание "автовызовом"
    private String comment; //любая дополнительная информация

    public CurierTask(long id, Client client, Date dateFrom, Date dateTo, Adress adressGetting, Adress adressDelivery, String cargo, Manager manager, Curier curier, Boolean autoTask, String comment) {
        this.id = id;
        this.client = client;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.adressGetting = adressGetting;
        this.adressDelivery = adressDelivery;
        this.cargo = cargo;
        this.manager = manager;
        this.curier = curier;
        this.autoTask = autoTask;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public Adress getAdressGetting() {
        return adressGetting;
    }

    public Adress getAdressDelivery() {
        return adressDelivery;
    }

    public String getCargo() {
        return cargo;
    }

    public Manager getManager() {
        return manager;
    }

    public Curier getCurier() {
        return curier;
    }

    public Boolean getAutoTask() {
        return autoTask;
    }

    public String getComment() {
        return comment;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setAdressGetting(Adress adressGetting) {
        this.adressGetting = adressGetting;
    }

    public void setAdressDelivery(Adress adressDelivery) {
        this.adressDelivery = adressDelivery;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setCurier(Curier curier) {
        this.curier = curier;
    }

    public void setAutoTask(Boolean autoTask) {
        this.autoTask = autoTask;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
