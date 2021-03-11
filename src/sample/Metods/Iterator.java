package sample.Metods;
/**
 * Интерфейс, определяющий структуру итератора,
 * включая необходимые методы для выполнения итерации.
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
    public Object back();
    public Object preview();
}



