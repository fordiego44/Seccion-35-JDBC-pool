package org.condori.java.jdbc;

import org.condori.java.jdbc.modelo.Categoria;
import org.condori.java.jdbc.modelo.Producto;
import org.condori.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.condori.java.jdbc.repositorio.Repositorio;
import org.condori.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {


            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("============= listar =============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("============= obtener por id =============");
            System.out.println(repositorio.porId(1L));

            System.out.println("============= insertar nuevo producto =============");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer 44 mecánico");
            producto.setPrecio(220);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(1L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.listar().forEach(System.out::println);


    }
}