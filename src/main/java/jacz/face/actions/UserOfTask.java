package jacz.face.actions;

import com.jacuzzi.face.JacuzziMainController;
import jacuzzi.util.concurrency.parallel_task_executor.ParallelTaskExecutor;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created with IntelliJ IDEA.
 * User: Alberto
 * Date: 30/12/13
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class UserOfTask {

    private StringProperty str;

    public UserOfTask(String string, StringProperty otherStringProperty, JacuzziMainController jacuzziMainController) {
        str = new SimpleStringProperty(string);
        otherStringProperty.bind(str);
        ParallelTaskExecutor.executeParallelTask(new BuildStringTask(this, jacuzziMainController, string));
    }

    public String getStr() {
        return str.get();
    }

    public void setStr(String str) {
        this.str.set(str);
    }

    public StringProperty strProperty() {
        return str;
    }
}
