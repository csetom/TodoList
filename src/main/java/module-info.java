module com.mycompany.beadando2 {
    requires javafx.controls;
    requires java.desktop;
    requires java.logging;
    requires com.google.gson;
    exports com.mycompany.beadando2;
    opens com.mycompany.modulok to com.google.gson;

}
