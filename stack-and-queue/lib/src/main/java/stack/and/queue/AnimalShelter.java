package stack.and.queue;

public class AnimalShelter {


    Queue  cats = new Queue() ;
    Queue  dogs = new Queue() ;

    int catArrivalTime = 0;
    int dogArrivalTime = 0;
    public void enq( String animal){
        if(animal.equals("cat") || animal.equals("Cat")){
            cats.enqueue("cat");
            catArrivalTime++;
        }else if (animal.equals("dog") || animal.equals("Dog")){
            dogs.enqueue("dog");
            dogArrivalTime++;
        } else if (!animal.equals("dog") || !animal.equals("Dog") || !animal.equals("cat") || !animal.equals("Cat") ){
              System.out.println("This Shelter is only for cats and dogs");
        }
    }

    private String deqDog(){
        return "The oldest poor dog ===> " + dogs.dequeue();
    }

    private String deqCat(){
        return "The oldest poor cat===>  " + cats.dequeue();
    }

    private String deqAny(){
        if(cats.isEmpty()){
            return deqDog();
        }

        if(dogs.isEmpty()){
            return deqCat();
        }

        if(catArrivalTime > dogArrivalTime){
            return deqCat();
        }else{
            return deqDog();
        }

    }

    public String dequeue(String pref){

        if (pref == "dog") {
          return  deqDog();

        }
        else if (pref == "cat") {
            return deqCat();
        } else {

            return deqAny();
        }

    }





}
