module p.proyectoversionfinalgabrielguzmanyluisguzman {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires json.simple;
    requires java.xml;


    opens p.proyectoversionfinalgabrielguzmanyluisguzman to javafx.fxml;
    exports p.proyectoversionfinalgabrielguzmanyluisguzman;
}