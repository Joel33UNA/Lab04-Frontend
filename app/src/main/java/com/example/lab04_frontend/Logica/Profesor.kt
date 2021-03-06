package com.example.lab04_frontend.Logica

import java.io.Serializable

class Profesor : Usuario{
    private var nombre: String? = null
    private var telefono = 0
    private var email: String? = null

    constructor(nombre: String, telefono: Int, email: String, cedula: Int, clave: String, rol: String)
    : super(cedula, clave, rol){
        this.nombre = nombre
        this.telefono = telefono
        this.email = email
    }

    constructor() : super() {
        nombre = ""
        telefono = 0
        email = ""
    }
}
