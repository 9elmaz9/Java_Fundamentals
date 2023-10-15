package InheritanceNASLEDOVANIE;


public class Main3 {

    public static void main(String[] args) { //можно создать сколько угодно  новых обьектов на основе класса транспорт
        //ООП классы и обьекты

        //Transport3 bmw = new Transport3 (250.5f, 2500, "White", new byte[]{0, 0, 0}); мы переформатируем ее в
        Car bmw = new Car (250.5f, 2500, "White", new byte[]{0, 0, 0});


        //мы создали кокретный обьект и описали все ее характеристики , мы установили значение
        //bmw.speed=250.5f;
        //bmw.weight=2500;
        //bmw.color="White";
        //bmw.coordinate=new byte[]{0,0,0}; // если  координаты плоскости x , y , z , машина находится в начале всех координат



        //Transport3 truck = new Transport3(5600,new byte[]{100, 0, 100});   эту строку переформатируем в
        Truck truck = new Truck(5600,new byte[]{100, 0, 100}, true); // нуэно создать в клабе трак конструктор который принимает параменты
        truck.setLoaded(true);  // если укажу значение false в таком случае , грузовик не будет загружен
        truck.getLoaded();  //Грузовик загружен

        //truck.speed = 140.5f;
        // truck.weight = 5600;
        //  truck.color = "Red";
        //truck.coordinate = new byte[]{100, 0, 100};

        // String res2 = truck.getValues();
        // System.out.println(res2);
        //System.out.println("Truck speed :" +truck.speed+ ". BMW speed:" + bmw.speed+".");


    }
}




