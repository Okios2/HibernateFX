module com.example.hibernatefxagain {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens Entity;

    opens com.example.hibernatefxagain to javafx.fxml;
    exports com.example.hibernatefxagain;
}