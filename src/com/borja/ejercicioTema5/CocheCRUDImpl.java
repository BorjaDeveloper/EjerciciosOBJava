package com.borja.ejercicioTema5;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "Guardando";
    String delete = "Borrando";
    String findAll = "Buscar todo";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", delete='" + delete + '\'' +
                ", findAll='" + findAll + '\'' +
                '}';
    }
}
