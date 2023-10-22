package Animal.FINAL;

public    class Animal {

    private String name;
    private String color;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public   void eat(){ // if here final in dog class(sub)- won't work
        System.out.println("munch munch munch");
    }
}
