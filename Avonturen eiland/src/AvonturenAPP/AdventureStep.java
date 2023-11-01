package AvonturenAPP;
// абстрактный класс для представления шага приключения
// abstract class to represent an adventure step
abstract class AdventureStep {

    protected String description; // Description of the current step
    protected AdventureStep choiceToCannibals; // link to the next step that will lead to cannibals
     protected AdventureStep choiseToRescue ;//link to the next step that will lead to salvation

    //Constructor
    public  AdventureStep(String description){
        this.description=description;
    }


    // абстрактный метод для выполнения шага
    public abstract AdventureStep performStep();
}
