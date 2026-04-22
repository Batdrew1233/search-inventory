package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
public class SearchInventory {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory2.csv"));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();

        }catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
        }


        /*ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);

        }

         */

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        // Write your code here
        inventory.add(new Product(7283, "Water Bottle", 8.25));
        inventory.add(new Product(2343, "Blanket", 18.50));
        inventory.add(new Product(3234, "Trash Bags", 5.32));
        inventory.add(new Product(1494, "Note Book", 3.85));
        inventory.add(new Product(8539, "Vacuum", 52.25));

            return inventory;

    }
}

