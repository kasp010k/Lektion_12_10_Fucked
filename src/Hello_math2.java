import javafx.application.Application;
import javafx.stage.Stage;


public class Hello_math2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    TextField txtnum1, txtnum2;
    Button btnadd, btnsub, btndiv, btnmul, btnclear;
    Label lblanswer;

    @Override
    public void start(Stage primaryStage) {
        txtnum1 = new TextField();
        txtnum2 = new Textfield();
        btnadd = new Button("+");
        btnsub = new Button("-");
        btnmul = new Button("x");
        btndiv = new Button("/");
        btnclear = new Button("Clear");
        lblanswer = new Label("?");
        lblanswer.setAlignment(Pos.CENTER);
        lblanswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

    }
}
