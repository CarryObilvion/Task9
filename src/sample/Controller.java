package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import sample.Methods.ImageCollection;
import sample.Methods.Iterator;



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
    } //Здесь я беру значение в текстовую строку из Слайдера. На событие мыши установлено событые Drag and Realese. Т.е. в момент отпускания ползунка, записывается значение в lev. Оно берется потом в текстовую строку для отображения и оно же используется в формуле для установки скорости прокрутки анимации.
    public void JnPlayuu(ActionEvent actionEvent) {
        timeline =new Timeline();   //Этой строчкой решил проблему со скоростью анимации. Не смог другим путем справиться с тем, что первоначальное значение таймлайна записывается и потом не меняется.
        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.getKeyFrames().add(new KeyFrame(new Duration(40*(100-Integer.valueOf(l2.getText())) ), new EventHandler<ActionEvent>() {  //Формула значения скорости прокрутки анимации в миллисекундах.
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
