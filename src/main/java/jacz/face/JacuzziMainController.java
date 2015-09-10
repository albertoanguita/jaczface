package jacz.face;

import jacz.face.actions.ClientActionImpl;
import jacz.face.actions.ConnectionToServerStatus;
import jacz.peerengineclient.JPeerEngineClient;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.jdom.JDOMException;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JacuzziMainController implements Initializable {

    public class MyTask extends Task<String> {

        @Override
        protected String call() throws Exception {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    @FXML
    private Label label;

    @FXML
    private Button connectionButton;

    @FXML
    private Label connectedLabel;

    @FXML
    private Label serverAddressLabel;

    /**
     * Jacuzzi peer client
     */
    private JPeerEngineClient client;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // initialize controller
        // todo

        ConnectionToServerStatus connectionToServerStatus = new ConnectionToServerStatus();
        ClientActionImpl clientAction = new ClientActionImpl(connectionToServerStatus);

        connectedLabel.textProperty().bind(connectionToServerStatus.connectedLabelTextProperty());
        serverAddressLabel.textProperty().bind(connectionToServerStatus.serverAddressProperty());
        connectionButton.textProperty().bind(connectionToServerStatus.connectionButtonTextProperty());


        //UserOfTask userOfTask = new UserOfTask("hola", label.textProperty(), this);


        try {
            client = new JPeerEngineClient(".\\etc\\config\\clientConf_1.xml", clientAction, null);
        } catch (JDOMException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void connectAction() {
        client.connect();
    }

    public void setText(final String str) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                label.setText(str);
            }
        });
    }
}
