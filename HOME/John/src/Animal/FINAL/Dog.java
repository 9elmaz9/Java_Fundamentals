package Animal.FINAL;

public class Dog extends Animal {
    private int walkDinstancePrereference;

    public void bark(){
        System.out.println("woof");
    }

    public  void eat(){ // if method eat in paren class final - error hier
        System.out.println("nom nom nom "+FinalExample.PI);
    }
    public int getWalkDinstancePrereference(){
        return walkDinstancePrereference;
    }
    public void  setWalkDinstancePrereference(int walkDinstancePrereference){
        this.walkDinstancePrereference=walkDinstancePrereference;
    }
 }
