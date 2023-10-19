package Les1.OefeningAnimalpp;

public class Zoo {
    //public String name;
    private float speed; // переменные
    private int weight;
    private String color;

    public String land;


    public Zoo( float _speed, int _weight, String _color, String _land) {

        System.out.println("Lives in our zoo");
        setValues( _speed, _weight, _color, _land);
        System.out.println(getValues());

    }

    //public Zoo(int weight, String land) { //  конструктор  на два значения
    // this.weight = weight;
    //this.land = land;
    // System.out.println(getValues());
    // }

    protected void setValues(float speed, int weight, String color, String land) {  //что бы не помечать отдельно для различия, просто используем метод this
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.land = land;
    }

    protected String getValues() {
        //return "Obkect speed :"+ speed+".Weighr:"+weight+".Color:"+color;
        String info = "Interesting information.Animal speed :" + speed + ".Weight:" + weight + ".Color:" + color + " ."; // записаны все поля которые не являются массивом
        String infoLand = "\nLand:"; //создаем ее одну переменную

        for (int i = 0; i < land.length(); i++)   //создаем уикл и в нем перебираем весь наш масив координаты
            infoLand += land.charAt(i) + " ";  // это не массив , строка charAt(i)
        //Таким образом мы делаем что у нас будут выодится cтрока
        //return;
        return info + infoLand;
    }

    public float getSpeed() {
        return weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}


