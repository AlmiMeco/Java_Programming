package day34_oopAbstractionCont.animalTask;

                     /* All 'nice' animals will implement from this Interface */

public interface Playable {
//     ^--- {interface keyword}

    public static final boolean isFriendly = true; // all variables are {static & final}
//    ^--- all (public & static & final) are grey (redundant) bc they're by default in interfaces


    public abstract void playTime(); // all methods are {static, abstract and public} * you don't need those keywords *
//                  void playTime(); will work the same


}
