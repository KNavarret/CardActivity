package com.example.carddeck;

public class StandardFaceValue implements FaceValue, Comparable <StandardFaceVaulue>{


    public staic final FaceValue ACE = new StandardFaceValue("ace" , 1);
    public staic final FaceValue two = new StandardFaceValue("two" , 2);
    public staic final FaceValue three = new StandardFaceValue("three" , 3);
    public staic final FaceValue four = new StandardFaceValue("four" , 4);
    public staic final FaceValue five = new StandardFaceValue("five" , 5);
    public staic final FaceValue six = new StandardFaceValue("six" , 6);
    public staic final FaceValue seven = new StandardFaceValue("seven" , 7);
    public staic final FaceValue eight = new StandardFaceValue("eight" , 8);
    public staic final FaceValue nine = new StandardFaceValue("name" , 9);
    public staic final FaceValue ten = new StandardFaceValue("ten" , 10);
    public staic final FaceValue Jack = new StandardFaceValue("Jack" , 11);
    public staic final FaceValue Queen = new StandardFaceValue("Queen" , 12);
    public staic final FaceValue King = new StandardFaceValue("King" , 13);


    private final String name;
    private final int ordinal;

    public StandardFaceValue(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;

    }


    public static  Set<FaceValue> values(){
        Set<FaceVlue> set = new TreeSet<>();

        Field [] fields = StandardFaceValue.class.getFields();
        for (Field field : fields){
            if(Modifier.isStatic(field.getModifiers())){
                try{
                   set.add((StandardFaceValue) field.get(null));
                } catch (IllegalAccessException e){

                }
            }
        }
            return set;
    }


    @Override
    public int ordinal() {
        return ordinal;

    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(StandardFaceValue) {
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
