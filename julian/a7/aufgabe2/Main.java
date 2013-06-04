package a7.aufgabe2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 04.06.13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[]args){

        Party party = new Party(50);
        System.out.println(party.probability());

    }


    /**
     * Party-Klasse
     */
    public static class Party{

        public final Person[] persons;

        /**
         * @param n Anzahl Partygäste ( n > 1)
         */
        public Party(int n){
            this.persons = new Person[n-1]; // wir ziehen die Person, über die Ge-gossipt wird, ab
            for (int i=0; i < (this.persons.length);i++){
                this.persons[i] = new Person();
            }
        }

        /**
         * @return zufällige Person
         */
        public Person getRandomPerson(){
            return this.persons[this.getRandomIndex()];
        }

        private Random random = new Random(6);

        public int getRandomIndex(){
            return this.random.nextInt(this.persons.length);
        }

        /**
         * @return zufällige Person, die nicht p ist
         */
        public Person getRandomPerson(Person p){
            Person result = this.persons[this.getRandomIndex()];
            while (p == result){
                result = this.persons[this.getRandomIndex()];
            }
            return result;
        }

        public void reset(){
            for (int i=0; i < (this.persons.length);i++){
                this.persons[i] = new Person();
            }
        }

        /**
         * Simuliere
         */
        public int gossip(){
            Person starter = this.getRandomPerson();
            starter.gossipIsTold();
            Person next = this.getRandomPerson(starter);
            int knowingPersons = 1;
            while (!next.knowsGossip()){
                next.gossipIsTold();
                next = this.getRandomPerson(next);
                knowingPersons++;
            }
            return knowingPersons;
        }

        /**
         * @return Durchschnitt von 100000 Simulationen
         */
        public int longSimulation(){
            long counter = 0;
            int n = 100000;
            for (int i = 0; i < n; i++){
                counter += this.gossip();
                this.reset();
            }
            return (int)Math.round(counter / (double)n);
        }

        /**
         * @return Wahrscheinlichkeit
         */
        public double probability(){
            double result = 1;
            for (double i = 2; i < this.persons.length;i++){
                result *= 1.0/i;
            }
            return result;
        }
    }

    /**
     * Personen
     */
    public static class Person{
        private boolean knowsGossip = false;

        /**
         * @return ob, die Person den Gossip schon kennt
         */
        public boolean knowsGossip(){
            return this.knowsGossip;
        }

        /**
         * Wenn Gossip erzählt wurde,
         */
        public void gossipIsTold(){
            this.knowsGossip = true;
        }
    }
}
