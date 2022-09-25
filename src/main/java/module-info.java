module com.practice.class_object_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.class_object_project to javafx.fxml;
    exports com.practice.class_object_project;
}