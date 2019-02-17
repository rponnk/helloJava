package com.rockkim;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of ppl";
    }

}

class TopGun extends Movie {
    public TopGun() {
        super("Top Gun");
    }

    @Override
    public String plot() {
        return "tom cruise init";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Starwars and jedis";
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 0; i <= 10; i++) {
            Movie movie = rando();
            System.out.println("Movie name = " + movie.getName() + " the plot is " + movie.plot());
        }
    }
    public static Movie rando() {
        int randoNum = (int) (Math.random() * 3) + 1;
        System.out.println("random num generated " + randoNum);
        switch (randoNum) {
            case 1:
                return new Jaws();
            case 2:
                return new TopGun();
            case 3:
                return new StarWars();
        }
        return null;
    }
}
