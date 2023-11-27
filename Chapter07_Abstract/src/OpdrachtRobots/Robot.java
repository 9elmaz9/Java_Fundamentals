package OpdrachtRobots;
//superclass

class Robot {
    //step 1 unitName:String
    private String unitName; // eigenschap voor alle robots - for superclass()

    // 1 constructor no args
    public Robot() {
        this.unitName = "nameless Robot";
        boot(); // method doot ()
    }
// 2 consrructor String

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
        // boot();

    }

    //opstartmethode
    public void boot() {
        System.out.println("Robot " + unitName + " is aan het opstarten");
    }


    //method om de naam van de robot op te halen
    public String getUnitName(){
        return  unitName;
    }

    // toString() om de gegevens van de robot terug geven

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }


    // @Override
    // public String toString() {
    // return "Robot [ initName="+unitName+"]"
}


