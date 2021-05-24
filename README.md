# Назначение программы

Данная программа предназначена для последовательного изображения элементов структурных карт Константайна. Реализовано изображение модулей: Подсистема, библиотека, область данных.

# Область применения программы

Предоставляет способ последовательного доступа ко всем элементам составного объекта, не раскрывая его внутреннего представления.

Придает обходу коллекции "объектно-ориентированный статус".

Полиморфный обход.

# Описание проекта

Проект представляет собой оконное приложение. Изначальный вид проекта - BorderPane, в CENTER сегменте отображается слайд, в RIGHT добавлен Slider с подписью label и TextField, выводящий значение Slider, в сегменте BOTTOM добавлены кнопки Button для использования слайдера.

# Паттерн

Итератор - это интерфейс, включающий необходимые методы для просмотра всех элементов структуры данных. Наиболее распространенные методы:

hasNext - возвращает true, если все еще в структуре есть элементы для просмотра, и false, если не осталось ни одного.

next - возвращает следующий элемент в структуре данных.

# Реализация проекта
Проект построен согласно диаграмме классов.

![9 диаграмма](https://user-images.githubusercontent.com/80450495/119401317-048f5600-bce4-11eb-908b-3dd5e87c9f34.png)

 Скриншоты рабочего окна приложения:
![9 11](https://user-images.githubusercontent.com/80450495/119401918-d6f6dc80-bce4-11eb-9929-b70b9fec59b6.jpg)
![9 22](https://user-images.githubusercontent.com/80450495/119401923-d78f7300-bce4-11eb-9611-bd1678db3853.jpg)
![9 33](https://user-images.githubusercontent.com/80450495/119401926-d8280980-bce4-11eb-9f02-a75ec3548f37.jpg)
![9 44](https://user-images.githubusercontent.com/80450495/119401928-d8280980-bce4-11eb-9c67-a6d3231a174d.jpg)

 
