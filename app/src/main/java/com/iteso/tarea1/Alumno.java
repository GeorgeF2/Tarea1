package com.iteso.tarea1;

public class Alumno {
    String name, phone, degree, gender, book, sport;

    public Alumno(String n, String p, String d, String g, String b, String s){
        name = n;
        phone = p;
        degree = d;
        gender = g;
        book = b;
        sport = s;
    }

    public String toString(){
        return "Nombre: " + name + "\nTelefono: " + phone + "\nEscolaridad: "+ degree + "\nGenero: " + gender + "\nLibro Favorito: " + book + "\nPractica Deporte: " + sport;
    }
}
