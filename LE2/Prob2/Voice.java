/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Voice {
    public void templateMethod() {
        prepareVoice();
        
        hear();
    }
    private void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Tiger();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
    }

    private void hear() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Tiger();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    
        for (int i =0 ;i<5 ; i++) {
            animals[i].makevoice();
        }
    }
}
