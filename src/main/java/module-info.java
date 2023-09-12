module com.example.ticTacToe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ticTacToe to javafx.fxml;
    exports com.example.ticTacToe;
}