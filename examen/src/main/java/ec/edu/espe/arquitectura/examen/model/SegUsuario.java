package ec.edu.espe.arquitectura.examen.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_USUARIO")
public class SegUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer id;
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;
    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "INTENTOS_FALLIDO", nullable = false)
    private Integer intentosFallidos;
    @Column(name = "SUELDO", precision = 8, scale = 2, nullable = false)
    private BigDecimal sueldo;
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaNacimiento;
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public SegUsuario() {
    }

    public SegUsuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(Integer intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegUsuario other = (SegUsuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Seg_Usuario [id=" + id + ", mail=" + mail + ", clave=" + clave + ", nombre=" + nombre
                + ", intentosFallidos=" + intentosFallidos + ", sueldo=" + sueldo + ", fechaNacimiento="
                + fechaNacimiento + ", version=" + version + "]";
    }

    

    

}
