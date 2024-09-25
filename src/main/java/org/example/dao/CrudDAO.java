package org.example.dao;

public interface CrudDAO<T> {
    public boolean save(T object);
    public boolean update(T object);
    public boolean delete(T object);
}
