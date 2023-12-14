package DAO; //data access object

import java.util.List;

public interface DAOInterface<T>{

    public int addData(T data);
    public int deleteData(T data);
    public int updateData(T data);
    List<T> getAll();

}
