package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Первый склад", "ул.Пушкина");
        Storage storage2 = new Storage("Второй склад", "ул.Николаева");

        Product fruit = new Product("1", "Яблоко", "900");
        Product nut = new Product("2", "Фундук","800");
        Product milk = new Product("3", "Простоквашино", "700");


        Map<Storage, Map<Product, Integer>> storageMap1 = new HashMap<>();
        HashMap<Product, Integer> productMap1 = new HashMap<>();
        productMap1.put(milk, 20);
        productMap1.put(nut, 57);

        HashMap<Product, Integer> productMap2 = new HashMap<>();
        productMap2.put(fruit, 13);

        storageMap1.put(storage1, productMap1);
        storageMap1.put(storage2, productMap2);

searchProduct(storageMap1, "3");

        System.out.println(storage1 + productMap1.toString());
        System.out.println(storage2 + productMap2.toString());
    }

    static void searchProduct(Map<Storage, Map<Product,Integer>> map, String serialNo ) {
        for (Storage s : map.keySet()) {
            Map<Product, Integer> productMap = map.get(s);
Integer amount = productMap.get(new Product(serialNo));

if(amount!= null){
    System.out.println("На складе " + s.getName() + " Найдено: " + amount + " единиц товара");
}

        }
    }
}
