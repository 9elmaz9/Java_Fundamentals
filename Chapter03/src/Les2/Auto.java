package Les2;

public class Auto {

        //Properties van de auto class
        private  String merk;
        private String model;
        private  int speed;

        //All-args constructor die op public staat
        public Auto(String merk, String model){
            this.merk=merk;
            this.model=model;
        }
        //Hier komen

        //Methode
        public void getMessageCreation(){
            System.out.println("Auro is created!");
        }
        //Methode
        public  int IncreaseSpeed(int increment){
            this.speed=this.speed+increment;
            return this.speed;
        }
    }

