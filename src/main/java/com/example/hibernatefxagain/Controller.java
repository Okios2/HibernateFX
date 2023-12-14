package com.example.hibernatefxagain;

import DAO.CategoryDAO;
import DAO.TeacherDAO;
import Entity.SectionEntity;
import Entity.TeachersEntity;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class Controller {

    @FXML
    public ListView listSection;
    @FXML
    public TableView tableTeacher;

    ObservableList<SectionEntity> sList;
    ObservableList<TeachersEntity> tList;

    public void initialize(){
        CategoryDAO dao = new CategoryDAO();
        sList = dao.getAll();
        listSection.setItems(sList);

        TeacherDAO dao2 = new TeacherDAO();
        tList = dao2.getAll();
        tableTeacher.setItems(tList);

        TableColumn col = (TableColumn) tableTeacher.getColumns().get(0);
        col.setCellValueFactory(new PropertyValueFactory("Id"));
        TableColumn col2 = (TableColumn) tableTeacher.getColumns().get(1);
        col2.setCellValueFactory(new PropertyValueFactory("Name"));
        TableColumn col3 = (TableColumn) tableTeacher.getColumns().get(2);
        col3.setCellValueFactory(new PropertyValueFactory("Surname"));
        TableColumn col4 = (TableColumn) tableTeacher.getColumns().get(3);
        col4.setCellValueFactory(new PropertyValueFactory("DateOfBirth"));
        TableColumn col5 = (TableColumn) tableTeacher.getColumns().get(4);
        col5.setCellValueFactory(new PropertyValueFactory("Compensation"));
        TableColumn col6 = (TableColumn) tableTeacher.getColumns().get(5);
        col6.setCellValueFactory(new PropertyValueFactory("GroupId"));
        TableColumn col7 = (TableColumn) tableTeacher.getColumns().get(6);
        col7.setCellValueFactory(new PropertyValueFactory("Condition"));


    }
    public void refreshView(){
        CategoryDAO dao = new CategoryDAO();
        sList = dao.getAll();
        listSection.setItems(sList);

        TeacherDAO dao2 = new TeacherDAO();
        tList = dao2.getAll();
        tableTeacher.setItems(tList);

        tableTeacher.refresh();
        listSection.refresh();
    }

    public void addData(ActionEvent actionEvent){
        System.out.println("Start Test");
        TeacherDAO dao = new TeacherDAO();
        TeachersEntity data = new TeachersEntity();
        data.setName("Test");
        data.setSurname("Test");
        data.setDateOfBirth(1344);
        data.setCompensation(1922);
        data.setCondition("OBECNY");
        data.setGroupId(2);

        dao.addData(data);

        refreshView();

    }

}
