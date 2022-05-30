package com.example.lab04_frontend.Logica

import java.sql.Date

class Estudiante : Usuario {
    private var nombre: String? = null
    private var telefono = 0
    private var email: String? = null
    private var fechaNacimiento: Date? = null
    private var carrera: Carrera? = null

    constructor(cedula:Int, clave:String, rol:String, nombre:String, telefono:Int, email:String, fechaNacimiento:Date, carrera:Carrera)
    : super(cedula, clave, rol){
        this.nombre = nombre
        this.telefono = telefono
        this.email = email
        this.fechaNacimiento = fechaNacimiento
        this.carrera = carrera
    }

    constructor() : super(){
        this.nombre = ""
        this.telefono = 0
        this.email = ""
        this.fechaNacimiento = Date(0, 0, 0)
        this.carrera = Carrera()
    }
}