package org.condori.java.jdbc;

import org.condori.java.jdbc.modelo.Producto;
import org.condori.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.condori.java.jdbc.repositorio.Repositorio;
import org.condori.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("============= listar =============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("============= obtener por id =============");
            System.out.println(repositorio.porId(1L));

            System.out.println("============= Eliminar producto =============");
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach(System.out::println);


    }
}
