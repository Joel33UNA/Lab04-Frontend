package com.example.lab04_frontend.CRUD

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lab04_frontend.Datos.Usuarios
import com.example.lab04_frontend.Logica.Usuario

class CrudUsuarios : AppCompatActivity() {
    private var usuarios: ArrayList<Usuario> = ArrayList<Usuario>()
    init{
        addUsuario(Usuario(111, "111", "administrador"))
        addUsuario(Usuario(222, "222", "profesor"))
        addUsuario(Usuario(333, "333", "estudiante"))
        addUsuario(Usuario(444, "444", "matriculador"))
    }

    private object HOLDER {
        val INSTANCE = Usuarios()
    }

    companion object {
        val instance: Usuarios by lazy {
            HOLDER.INSTANCE
        }
    }

    fun addUsuario(u: Usuario){
        usuarios?.add(u)
    }

    fun getUsuario(cedula: Int): Usuario? {
        for (u: Usuario in usuarios!!){
            if(u.cedula.equals(cedula)){
                return u;
            }
        }
        return null;
    }

    fun getUsuarios(): ArrayList<Usuario>{
        return this.usuarios!!
    }

    fun login(cedula: Int?, clave: String?): Boolean{
        for(u: Usuario in usuarios!!){
            if(u.cedula.equals(cedula) && u.clave.equals(clave)){
                return true
            }
        }
        return false
    }

    fun loginU(cedula: Int?, clave: String?): Usuario?{
        for(u: Usuario in usuarios!!){
            if(u.cedula.equals(cedula) && u.clave.equals(clave)){
                return u
            }
        }
        return null
    }

    fun deleteUsuario(position: Int){
        usuarios!!.removeAt(position)
    }

    fun cambiarContra(cedula: Int, passw: String, nueva: String){
        var aux = loginU(cedula, passw)
        if (aux != null) {
            aux.clave = nueva
        }
    }
}