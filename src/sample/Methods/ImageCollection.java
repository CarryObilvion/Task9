package sample.Methods;


import javafx.scene.image.Image;

public class ImageCollection implements Aggregate { //Создал конкретный класс, реализующий интерфейс Aggregate. Этот класс имеет внутренний класс ImageIterator, реализующий интерфейс Итератор
    private String filetopic;
    public Image bi;
    public ImageCollection(String filetopic) {
        this.filetopic = filetopic;
    }
    private class ImageIterator implements Iterator { //В обработчике пошагового перехода к следующему изображению,  использовал итератор
        private int current=0;
        @Override
        public boolean hasNext() {
            String
                    filename="Image\\"+filetopic+(current+1)+".PNG";
            try {
                bi = new Image(filename);

                return true;

            } catch (Exception ex) {
                preview();

                return true;
            }
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                current++;
                return bi;
            }

            return null;
        }
        @Override
        public Object back() {
            current--;
            if(this.hasNext()){
                return bi;
            }

            return null;
        }

        @Override
        public Object preview() {
            current=0;
            return current;
        }
    }
    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }
}
