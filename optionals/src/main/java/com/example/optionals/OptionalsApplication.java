package com.example.optionals;

import java.util.Optional;

public class OptionalsApplication {
    static class Cat{
        String name;
        int age;

        public Cat(String name,int age) {
            this.name = name;
            this.age=age;
        }

        @Override
        public String toString() {
            return name + " "+age;
        }
    }
    public static void main(String[] args) {
        Optional<Cat> myCat=findCatByName("Fred");
        if(myCat.isPresent()) //isEmpty(),isPresent()
            System.out.println(myCat.get()); //get() is getting the object

        String myString=myCat.map(Cat::toString)
                .orElse("");
        System.out.println(myString);

    }
    private static Optional<Cat> findCatByName(String name){
        Cat cat=new Cat(name,3);
        return Optional.ofNullable(cat); //if u sure it is not null, you can use '.of()'
    }
}
