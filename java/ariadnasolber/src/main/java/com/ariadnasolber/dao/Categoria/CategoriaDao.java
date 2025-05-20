package com.ariadnasolber.dao.Categoria;

import com.ariadnasolber.model.Categoria;

import java.sql.SQLException;
import java.util.List;

public interface CategoriaDao {
    public int add(Categoria categoria) throws SQLException;

    public Categoria getById(int id) throws SQLException;

    public List<Categoria> getAll() throws SQLException;

    public int update(Categoria categoria) throws SQLException;

    public void delete(int id) throws SQLException;
}
