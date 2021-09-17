package com.example.carddeck;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.set;
import java.util.TreeSet;


public class Suit implements Comparable<Suit>{

    public static final Suit Hearts = new Suit("hearts", 1);
    public static final Suit Clubs = new Suit("Clubs", 2);
    public static final Suit Diamonds = new Suit("Diamonds", 3);
    public static final Suit Spades = new Suit("Spades", 4);

    private final String name;
    private final int ordinal;

    public static  Set<Suit> values(){
        Set<Suit> set = new TreeSet<>();

        Field [] fields = Suit.class.getFields();
        for (Field field : fields){
            if(Modifier.isStatic(field.getModifiers())){
                try{
                    set.add((Suit) field.get(null));
                } catch (IllegalAccessException e){

                }
            }
        }
        return set;
    }

    public int ordinal() {
        return ordinal;

    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Suit that) {
        if(this.ordinal > that.ordinal){
            return 1;
        }
        else if(this.ordinal < that.ordinal){
            return -1;
        }
        else{
            return 0;
        }


    }
}
