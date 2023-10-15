package InheritanceNASLEDOVANIE;

public class Car extends Transport3 {

    public Car(float _speed, int _weight, String _color, byte[] _coordinate) {
        super(_speed, _weight, _color, _coordinate);//тоже самое что this. , но оно обращается не конкретно к этому классу,
        // а оно обращается к классу родителю Транспорт. Мы в наш класс родитель Транспорт  передаем 4 параметра,
        // и по умолчанию будет вызван этот конструктор : выполнится код из конструктора где есть 4 параметра

         // пример  обращения к
        // this.color ="sd"; //  this это если я исправлю в Транспорт private public  , можно так же использовать слово super
        // this ищет внутри  этого класса , но этот класс наследует все от класса транспорт  то ошибки не возникает  ,
        // super  не ищет  внутри этого класса, ищет в классе родителя Транспорт

        super.setValues(_speed,_weight,_color,_coordinate); //  можно  и так и так this.setValues(); super.setValues();
       // можно просто так , можно и к getValues()
    }

}
