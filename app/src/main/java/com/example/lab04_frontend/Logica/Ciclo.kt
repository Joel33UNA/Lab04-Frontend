package com.example.lab04_frontend.Logica

import java.io.Serializable

import java.sql.Date

class Ciclo : Serializable {
    private var codigo = 0
    private var anio = 0
    private var numeroCiclo = 0
    private var fechaInicio: Date? = null
    private var fechaFin: Date? = null

    constructor(codigo: Int, anio: Int, numeroCiclo: Int, fechaInicio: Date, fechaFin: Date) {
        this.codigo = codigo
        this.anio = anio
        this.numeroCiclo = numeroCiclo
        this.fechaInicio = fechaInicio
        this.fechaFin = fechaFin
    }

    constructor() {
        codigo = 0
        anio = 0
        numeroCiclo = 0
        fechaInicio = Date(0, 0, 0)
        fechaFin = Date(0, 0, 0)
    }
}