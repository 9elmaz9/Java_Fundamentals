package ConstructorClass;



public class Main2 {


    //public Main2() {//конструктор по умолчанию для класса main , он тут даже не нужен
    //}

    public static void main(String[] args) { //можно создать сколько угодно  новых обьектов на основе класса транспорт
        //ООП классы и обьекты
        Transpotr1 bmw = new Transpotr1 (250.5f, 2500, "White", new byte[]{0, 0, 0});


            //мы создали кокретный обьект и описали все ее характеристики , мы установили значение
            //bmw.speed=250.5f;
            //bmw.weight=2500;
            //bmw.color="White";
            //bmw.coordinate=new byte[]{0,0,0}; // если  координаты плоскости x , y , z , машина находится в начале всех координат


            Transpotr1 truck = new Transpotr1(5600,new byte[]{100, 0, 100});
            //truck.speed = 140.5f;
            // truck.weight = 5600;
            //  truck.color = "Red";
            //truck.coordinate = new byte[]{100, 0, 100};

            // String res2 = truck.getValues();
            // System.out.println(res2);
            //System.out.println("Truck speed :" +truck.speed+ ". BMW speed:" + bmw.speed+".");


    }
}



