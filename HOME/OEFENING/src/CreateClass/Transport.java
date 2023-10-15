package CreateClass;

public class Transport {
    //public  - доступна из других файлов
    //protected - какое либо боле или класс будет доступен только внутри самого класса или класса наследников
    //private -  возле класса, поля , метода, это закрытая переменная ,
    // фунция или класс, будет виден исключительно в пределах самого этого класса , файла
    public float speed; // переменные
    public int weight;
    public String color;
    public byte[] coordinate;


    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        //return "Obkect speed :"+ speed+".Weighr:"+weight+".Color:"+color;
        String info = "Object speed :" + speed + ".Weighr:" + weight + ".Color:" + color + " "; // записаны все поля которые не являются массивом
        String infoCoordinaes = "Coordinates:\n"; //создаем ее одну переменную

        for (int i = 0; i < coordinate.length; i++)   //создаем уикл и в нем перебираем весь наш масив координаты
            infoCoordinaes += coordinate[i] + "\n";  //добавляем каждый элемент из всего этого массива и делаем перевод на новую стороку.
            //Таким образом мы делаем что у нас будут выодится координгаты ( 100,0,100)
            //return;
            return info + infoCoordinaes;
        }
    }




