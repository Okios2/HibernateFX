package DAO;

import Entity.SectionEntity;
import Utility.HibernateUtility;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;

import java.util.List;

public class CategoryDAO implements DAOInterface<SectionEntity>{

    @Override
    public int addData(SectionEntity data) {
        return 0;
    }

    @Override
    public int deleteData(SectionEntity data) {
        return 0;
    }

    @Override
    public int updateData(SectionEntity data) {
        return 0;
    }

    @Override
    public ObservableList<SectionEntity> getAll() {
        Session s = HibernateUtility.getSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(SectionEntity.class);

        Root<SectionEntity> root = query.from(SectionEntity.class);

        //Predicate p = builder.equal(root.get("id"), 2); sprawdzenie czy działa ba konkretnym id (dodać do linijki niżej query.where(p)

        List<SectionEntity> sList = s.createQuery(query).getResultList();
        s.close();

        return FXCollections.observableArrayList(sList);
    }
}
