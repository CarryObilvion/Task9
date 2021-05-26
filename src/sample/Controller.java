package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import sample.Metods.ImageCollection;
import sample.Metods.Iterator;



public class Controller {
    public ImageCollection imgs =new ImageCollection("Слайд");
    public Iterator iter_main = imgs.getIterator();
    public Timeline timeline =new Timeline();
    public ImageView imageCurr;
    public Slider lev;
    public TextField l2;

    public void initialize(){

    }

    public void updw(MouseEvent mouseEvent) {
        l2.setText(Math.round(lev.getValue())+"");
    }
    public void JnPlayuu(ActionEvent actionEvent) {
        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.getKeyFrames().add(new KeyFrame(new Duration(20*(100-Integer.valueOf(l2.getText())) ), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {

                if( iter_main.hasNext()) {
                    Image name = (Image) iter_main.next();
                    imageCurr.setImage(name);
                }
            }
        }));


        timeline.play();
    }

    public void JnStope(ActionEvent actionEvent) {
        timeline.stop();
    }

    public void JnNexte(ActionEvent actionEvent) {
            timeline.stop();
            if (iter_main.hasNext()) {
                Image name = (Image) iter_main.next();
                imageCurr.setImage(name);
            }
        }

    public void JnBacks(ActionEvent actionEvent) {
        timeline.stop();
        if (iter_main.hasNext()) {
            Image name = (Image) iter_main.back();
            imageCurr.setImage(name);
        }
    }


}
