package InheritanceNASLEDOVANIE;
 //описывает  абсолютно все общие характеристики  для всех авто , машина грузовик авто и т.д
public class Transport3 {
    // теперь можно сдлеать privat. но смысл ?
    // тогда нельзя будет через main + ток тут защищенный метод


    private float speed; // переменные
    private int weight;
    //public String color;
     private String color;
    // создадим модификатор доступа протектед , эта переменная
    // protected String color; // поменяли еще два конструктора protected void setValues  и  protected void setValues
     //протектед видны тут и в классах наследниках Сar  и Truck

    private byte[] coordinate;


    //он стал не нужен -и был не нужен.  public Transport3(){}//  конструктро по умолчанию создан для нового класса  трак , это класс который ничего не принимает и не устанавливает
    //что бы создать конструктрот нужно указать модифкатор доступа паблик,мы сможем создать обьект на основе этого касса внутри других классов .

    //privat закрывает доступ к классу

    //protected - можно создать лишь в классе наследников

    public Transport3(float _speed, int _weight, String _color, byte[] _coordinate) {
        // это конструктор который создан по умолчанию, раньше он был не виден , вот мы его вывели
        //Join to DB = подключение к базе данных . Можем создать такой конструктор
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
        System.out.println(getValues());
        //speed = _speed;
        //weight = _weight;
        //color = _color;
        //coordinate = _coordinate;
    }

    //Главное что б конструкторы отличались поколличеству параметов, или же по типу данных.вместо int weight  использовать float weight
    public Transport3(int weight, byte[] cordinate) { //  конструктор для трака на два значения
        this.weight = weight;
        this.coordinate = cordinate;
        System.out.println(getValues());
    }

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {  //что бы не помечать отдельно для различия, просто используем метод this
        this.speed = speed; // вместо  speed = _speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        //return "Obkect speed :"+ speed+".Weighr:"+weight+".Color:"+color;
        String info = "Object speed :" + speed + ".Weight:" + weight + ".Color:" + color + " ."; // записаны все поля которые не являются массивом
        String infoCoordinaes = "\nCoordinates:\n"; //создаем ее одну переменную

        for (int i = 0; i < coordinate.length; i++)   //создаем уикл и в нем перебираем весь наш масив координаты
            infoCoordinaes += coordinate[i] + "\n";  //добавляем каждый элемент из всего этого массива и делаем перевод на новую стороку.
        //Таким образом мы делаем что у нас будут выодится координгаты ( 100,0,100)
        //return;
        return info + infoCoordinaes;
    }
}







