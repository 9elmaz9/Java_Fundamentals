package CreateClass;

public class Main {
    public static void main(String[] args) { //можно создать сколько угодно  новых обьектов на основе класса транспорт
        //ООП классы и обьекты
        Transport bmw = new Transport();  //мы создали кокретный обьект и описали все ее характеристики , мы установили значение
        bmw.setValues(250.5f,2500,"White",new byte[]{0,0,0});
        String res1 =bmw.getValues();
        System.out.println(res1);
        //bmw.speed=250.5f;
        //bmw.weight=2500;
        //bmw.color="White";
        //bmw.coordinate=new byte[]{0,0,0}; // если  координаты плоскости x , y , z , машина находится в начале всех координат


        Transport truck = new Transport();
        truck.speed=140.5f;
        truck.weight=5600;
        truck.color="Red";
        truck.coordinate=new byte[]{100,0,100};

        String res2 =truck.getValues();
        System.out.println(res2);
        //System.out.println("Truck speed :" +truck.speed+ ". BMW speed:" + bmw.speed+".");

    }
}
