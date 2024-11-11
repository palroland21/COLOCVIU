import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner;
       scanner = new Scanner(System.in);

       System.out.print("Nr total de preparate din restaurant este: ");
       int nrTotalPreparate = scanner.nextInt();
       System.out.println("Nr total de preparate pe care le are restaurantul este: " + nrTotalPreparate);

       Client[] clients = new Client[50];
       Pizza[] pizzas = new Pizza[50];
       Bauturi[] bauturis = new Bauturi[50];
       Desert[] deserts = new Desert[50];
       Comanda[] comandas = new Comanda[50];
       int indexComanda = 0;
       int indexDesert = 0;
       int indexPizza = 0;
       int indexBauturi = 0;
       int indexClient = 0;

       clients[indexClient++] = new Client("Gabriel", 0);
       clients[indexClient++] = new Client("Alex", 0);
       clients[indexClient++] = new Client("Ionut", 0);

       pizzas[indexPizza++] = new Pizza("Margarita", 23);
       pizzas[indexPizza++] = new Pizza("Quattro", 30);
       pizzas[indexPizza++] = new Pizza("Quattro stagioni", 29);
       pizzas[indexPizza++] = new Pizza("Quattro formagi", 25);

       bauturis[indexBauturi++] = new Bauturi("Cola", 8);
       bauturis[indexBauturi++] = new Bauturi("Pepsi", 9);
       bauturis[indexBauturi++] = new Bauturi("Fanta", 5);
       bauturis[indexBauturi++] = new Bauturi("Mirinda", 6);

       deserts[indexDesert++] = new Desert("Papanas", 25);
       deserts[indexDesert++] = new Desert("CheeseCake", 20);

       System.out.println("\nToate preparatele din restaurant: ");
       for(int i=0; i<indexPizza; i++){
           System.out.println(" - Pizza: " + pizzas[i].getNume());
       }
       for(int i=0; i<indexBauturi; i++){
           System.out.println(" - Bauturi: " + bauturis[i].getNume());
       }
       for(int i=0; i<indexDesert; i++){
           System.out.println(" - Desert: " + deserts[i].getNume());
       }

       comandas[indexComanda++] = new Comanda(clients[0], bauturis[1], pizzas[0], deserts[0], "InLivrare");
       comandas[indexComanda++] = new Comanda(clients[0], pizzas[2], "Livrat");
       comandas[indexComanda++] = new Comanda(clients[1], bauturis[3], "Nelivrat");
       comandas[indexComanda++] = new Comanda(clients[0], bauturis[1], "InLivrare");
       comandas[indexComanda++] = new Comanda(clients[2], deserts[0], "Livrat");

       System.out.println("\nComenzile nelivrate sau in curs de livrare: ");
       for(int i=0; i<indexComanda; i++){
           if(comandas[i].getStatus() != "Livrat"){
               System.out.println(" - Comanda cu ID-ul " + comandas[i].getIDComanda() + " este in statusul de " + comandas[i].getStatus() +
                       " si are pretul de " + comandas[i].getPrice() + "lei." + " Comandat de clientul: " + comandas[i].getNumeClient() + ".");
           }
       }

       System.out.println();
       for(int i=0; i<indexClient; i++) {
           System.out.println("Suma totala pe care a platit clientul " + clients[i].getNumeClient() +
                   " pentru toate comenzile(inclusiv cele in curs de livrare si nelivrate) din acest restaurant este: " + clients[i].getTotalPlata() + "lei.");
       }


       /* O alta abordare pe care as fi putut implmenta era sa folosesc clasa "Resturant" ca si 'preparate' si sa il instantiez in clasa Main, cu indexPreparate
         pe care sa-l incrementez de fiecare data cand adaug un preparat (cum am facut pt pizza, bauturi si desert). Am preferat sa lucrez separat cu fiecare
         preparat al restaurantului pentru a crea mai multe clase si sa lucrez cu ele.
        */
    }
}