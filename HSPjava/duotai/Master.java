public class Master{
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void Feed(Animal animal,Food food){
        System.out.println(name+"¸ø"+animal.getName()+"³Ô"+ food.getName());
    }
    
}
