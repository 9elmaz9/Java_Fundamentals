package Les1.OefeningAnimalpp;

public class Wasbeer extends Zoo {

    public Wasbeer(float _speed, int _weight, String _color, String _land) {
        super(_speed, _weight, _color, _land);//тоже самое что this. , но оно обращается не конкретно к этому классу,
        //Мы в наш класс родитель zoo  передаем 4 параметра,

        super.setValues(_speed,_weight,_color,_land); //  можно  и так и так this.setValues(); super.setValues(); можно и к getValues()
    }

}




