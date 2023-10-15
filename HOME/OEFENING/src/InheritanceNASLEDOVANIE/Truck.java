package InheritanceNASLEDOVANIE;
//тут мы наследуем эти общие характеристики , нам не нужно их каждый раз переписывать  для нового класса, мы их просто наследуем
public class Truck extends Transport3 {
    //можно еще создать наслдеников от наследников  , например из класса Truck   и Trqnsport3

    // new
    private boolean isLoaded; //загружен ли грузовик не нужно в  общий класс, это уже доп к траку

    //этот конструктор принимает 2 параметра
    public Truck(int weight, byte[] cordinate) { //  конструктор для трака на два значения
        //this.weight = weight;  не работают когда в классе Транспорт, эти поля приватные
        //this.coordinate = cordinate;
        //System.out.println(getValues());//  в родительском классе есть конструктор без праметров
        super(weight, cordinate);  //тоже самое что this. , но оно обращается не конкретно к этому классу,
        // а оно обращается к классу родителю Транспорт. Мы в наш класс родитель Транспорт  передаем 2 параметра,
        // и по умолчанию будет вызван этот конструктор


          //this.color="sdf"; //можно , ошибок не выдает  c protected
         // this.getValues(); // можно , ошибок не выдает   c protected

    }

    // созжаем новый конструктор
    public Truck(int weight, byte[] cordinate, boolean isLoaded) { // этот конструктор принимает три параметра
        super(weight, cordinate); // два отправляем в основной конструктор
        this.isLoaded=isLoaded; //  с 1 работаем исключительно тут
    }

    public void setLoaded(boolean loaded) {  //принимает один boolean,дальше он в качестве значения для isLoaded устанавливает параметр который мы получили
        isLoaded = loaded;
    }
    public  void getLoaded(){ // будет возвращать значение isLoaded
        if(isLoaded) {   //(isLoaded==true){ можно и так
            System.out.println("Грузовик загружен ");
        }else{
            System.out.println("Грузовик не загружен "); //если одна строчка кода. фигурные скобки не нужны
        }

    }
}
