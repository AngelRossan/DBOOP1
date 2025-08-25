package Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Mascota {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String especie;
    private String raza;
    private Date fecaNacimiento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFecaNacimiento() {
        return fecaNacimiento;
    }

    public void setFecaNacimiento(Date fecaNacimiento) {
        this.fecaNacimiento = fecaNacimiento;
    }
}
