package com.ventas.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Victor Hugo Aguilar Aguilar
 */

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @NotNull
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 70, message = "El nombre debe ser mayor de 3 carácteres")
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @NotBlank(message = "Los apellidos es obligatorio")
    @Size(min = 3, max = 150, message = "Los apellidos debe ser mayor de 3 carácteres")
    @Column(name = "apellidos", nullable = false, length = 150)
    private String apellidos;

    @Size(max = 150, message = "La dirección no debe superar los 150 carácteres")
    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;

    @Size(min = 9, message = "El teléfono debe tener al menos 9 dígitos")
    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @NotNull
    @NotBlank(message = "El mail es obligatorio")
    @Size(min = 10, message = "El email debe ser de al menos 10 carácteres")
    @Email(message = "El formato debe ser de email válido")
    @Column(name = "email", nullable = false, length = 150)
    private String email;


    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
