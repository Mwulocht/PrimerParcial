package ufps.poo2.ejercicio.banco;

public class Customer { // F3, cree una nueva clase para añadir nombre, cedula y apellidos
    private int cc;
    private String firstName;
    private String lastName;

    public Customer(int cc, String firstName, String lastName) {
        this.cc = cc;
        this.firstName = firstName;
        this.lastName

                = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

}