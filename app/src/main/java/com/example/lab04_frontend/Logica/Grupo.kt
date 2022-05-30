package com.example.lab04_frontend.Logica

class Grupo {
    private var codigo = 0
    private var horario: String? = null
    private var curso: Curso? = null
    private var ciclo: Ciclo? = null
    private var profesor: Profesor? = null
    private var estudiantes: ArrayList<Estudiante>? = null

    constructor(
        codigo: Int,
        horario: String,
        curso: Curso,
        ciclo: Ciclo,
        profesor: Profesor,
        estudiantes: ArrayList<Estudiante>
    ) {
        this.codigo = codigo
        this.horario = horario
        this.curso = curso
        this.ciclo = ciclo
        this.profesor = profesor
        this.estudiantes = estudiantes
    }

    constructor(){
        codigo = 0
        horario = ""
        curso = Curso()
        ciclo = Ciclo()
        profesor = Profesor()
        estudiantes = ArrayList()
    }
}