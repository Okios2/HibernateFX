package DAO;

import Entity.SectionEntity;
import Entity.TeachersEntity;
import Utility.HibernateUtility;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TeacherDAO implements DAOInterface<TeachersEntity>{

    @Override
    public int addData(TeachersEntity data) {

        Session s = HibernateUtility.getSession();
        Transaction t = s.beginTransaction();
        s.save(data);

        t.commit();
        s.close();

        return 0;
    }

    @Override
    public int deleteData(TeachersEntity data) {
        return 0;
    }

    @Override
    public int updateData(TeachersEntity data) {
        return 0;
    }

    @Override
    public ObservableList<TeachersEntity> getAll() {

        Session s = HibernateUtility.getSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(TeachersEntity.class);

        Root<TeachersEntity> root = query.from(TeachersEntity.class);

        //Predicate p = builder.equal(root.get("id"), 2); sprawdzenie czy działa ba konkretnym id (dodać do linijki niżej query.where(p)

        List<TeachersEntity> tList = s.createQuery(query).getResultList();
        s.close();

        return FXCollections.observableArrayList(tList);
    }
}
