package be.intecbrussel.eatables;

public class Cone implements Eatable {

    public enum Flavor {

        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }

    public Flavor[] balls;

    public Cone(){
        this.balls = Flavor.values();
    }

    public Cone(Flavor[] balls){
        this.balls = balls;
    }


    @Override
    public void eat() {
        System.out.println("je kan deze verschillende soorten bollen eten : ");
        for (Flavor ball : balls)
            System.out.println(ball);
    }

}
