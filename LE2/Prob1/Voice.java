/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************/
class Voice{
    void preparevoice(){
        Animal[] animal = new Animal[5];
        animal[0] =  new Cow();
        animal[1] =  new Goat();
        animal[2] =  new Lion();
        animal[3] =  new Tiger();
        animal[4] =  new Pig();
        hear(animal);
    }
    void hear(Animal[] animal) {
        for(int i =0 ; i<5 ;i++)
            animal[i].makevoice();
    }
}
