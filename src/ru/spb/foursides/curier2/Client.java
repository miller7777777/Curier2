package ru.spb.foursides.curier2;

public class Client {

    long id; //id � ���� MySQL
    private String name; //�������� �����������
    private String contract; //�������
    private Boolean status; //�������� ��� ���������� ������ (����������� ��� ������������� �������)
    private Adress adress; //����� �������
    private String contactPerson; //���������� ����
    private String comment; //����� ������ �������������� ����������

    public Client(long id, String comment, String name, Boolean status, Adress adress, String contactPerson, String contract) {
        this.id = id;
        this.comment = comment;
        this.name = name;
        this.status = status;
        this.adress = adress;
        this.contactPerson = contactPerson;
        this.contract = contract;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContract() {
        return contract;
    }

    public Boolean getStatus() {
        return status;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getComment() {
        return comment;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
