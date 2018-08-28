/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

public class Main {

    
    public static void main(String[] args) {
       PetShopping pet = new PetShopping ();
       Cachorro dog1 = new Cachorro("Preto", "PitBull");
       Cachorro dog2 = new Cachorro("Marrom", "Poodle" );
       Cachorro dog3 = new Cachorro("Branco", "Labrador" );
       
       pet.comprar();
       pet.vender(dog2);
    }
    
    public void imprimir ()
    {
        System.out.println("teste");
    }
}
