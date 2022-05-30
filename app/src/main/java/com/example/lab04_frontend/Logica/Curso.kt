package com.example.lab04_frontend.Logica

class Curso {
    private var codigo = 0
    private var nombre: String? = null
    private var creditos = 0
    private var horasSemanales = 0
    private var carrera: Carrera? = null

    constructor(codigo: Int, nombre: String, creditos: Int, horasSemanales: Int, carrera: Carrera) {
        this.codigo = codigo
        this.nombre = nombre
        this.creditos = creditos
        this.horasSemanales = horasSemanales
        this.carrera = carrera
    }

    constructor() {
        codigo = 0
        nombre = ""
        creditos = 0
        horasSemanales = 0
        carrera = Carrera()
    }
}
