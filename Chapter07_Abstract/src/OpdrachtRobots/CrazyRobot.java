package OpdrachtRobots;
class CrazyRobot extends Robot{
    // no args constructor
    public CrazyRobot(){
        super();
    }
    // constructor with a string name
    public CrazyRobot(String unitName) {
        super(unitName); // // roep de constructor van de superclass an om initNAme in te stelen
        // }

    }


    //overriding van de boot() om de naam om te draaien
    public void boot(){
        super.boot(); // roep de boot () van de superclass

        //
        StringBuilder reversedName = new StringBuilder(getUnitName()).reverse();

        //print de nieuwe naam af
        System.out.println("De nieuwe naam van CrazyPorot is : " +reversedName);


    }
}

