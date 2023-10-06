module br.com.univasf.taskverse {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens br.com.univasf.taskverse to javafx.fxml;
    exports br.com.univasf.taskverse;
}