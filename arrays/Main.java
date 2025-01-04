package arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* One of the ways to declare a string array */
        String[] names = new String[3];

        /* Another way to declare a string array */
        String[] farms = {"chikangawa", "mananse", "chileka", "mkanda"};

        /* Accessing arrays content */
        String firstFarm = farms[0];
//        System.out.println(firstFarm);

        /* modifying an array length -- getting around array length problem */
//        System.out.println(farms.length);
//        System.out.println(modArr(modArr(farms, "chimwankhunda"), "chikanda").length);
        System.out.println("");

        /*Using arrayList */
//        usingLists();


        /*Using Map object */
        usingMap();
    }

    public static String[] modArr(String[] arr, String str) {
        String[] newFarms = new String[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newFarms[i] = arr[i];
            System.out.println(arr[i]);
        }
        newFarms[arr.length] = str;
        System.out.println("Added :: " + newFarms[arr.length]);
        return newFarms;
    }

    public static ArrayList<String> usingLists() {
        /*One way of defining ArrayList :: using a class object*/
        ArrayList<String> names = new ArrayList<>();
        names.add("George");
        names.add("James");

        /* Clears all data in the targeted list */
        names.clear();
        System.out.println("Size of list of names :: " + names.size());
        System.out.println("Checking if names list is empty :: " + names.isEmpty() + "\n");

        /* Alternative way of defining ArrayList :: using an Interface */
        List<String> villages = new ArrayList<>();
        villages.add("Kaudzu");
        villages.add("Mananse");
        villages.add("Singano");
        villages.add("Chingale");

        System.out.print("Initial size of village list :: " + villages.size());
        System.out.print("\t=>\tPrinting village @  index 2 :: " + villages.get(2));

        /* removes an entry in the targeted list */
        System.out.println("\nRemoving 'village' @ index1 => 'Mananse'");
        villages.remove("Mananse");
        System.out.println("\nSize of village list :: " + villages.size() + " => Village name @ index 1 :: " + villages.get(1));

        /* Checking content */
        System.out.println("'Mananse exist' :: " + villages.contains("Mananse"));
        System.out.println("'Kaudzu exist' :: " + villages.contains("Kaudzu"));
        System.out.println("Checking if villages list is empty :: " + villages.isEmpty());

        /* when checking the index of an object that does not exist, the return is -1 */
        System.out.println("Checking index of 'Kaudzu' in villages :: " + villages.indexOf("Kaudzu") + "\n");

        System.out.println("Checking index of 'Chingale' in villages before sort :: " + villages.indexOf("Chingale"));
        Collections.sort(villages);
        System.out.println("Checking index of 'Chingale' in villages after sort :: " + villages.indexOf("Chingale") + "\n");
        Collections.sort(villages, Collections.reverseOrder());
        System.out.println("Checking index of 'Chingale' in villages after reverse sort :: " + villages.indexOf("Chingale") + "\n");

        /* When defining the data type of list, primitives can not be used e.g.
         * ArrayList<int> age = new ArrayList<>()  ❌ */
        ArrayList<Integer> age = new ArrayList<>(); //✔️
        age.add(23);
        age.add(17);
        age.add(50);

        System.out.println("Checking if age list is empty :: " + age.isEmpty() + "\t=> Age @ index 1 :: " + age.get(1));

        return names;
    }

    public static Map<String, String> usingMap(){
        Map<String, String> person = new HashMap<>();
        /* Another way to define a Map Object
            HashMap<String, String> person = new HashMap<>(); */

        person.put("Age", "17");
        person.put("Address", "Mawila rural");
        person.put("Phone", "08886757666");
        person.put("Name", "Lonje Banda");

        System.out.println("Name :: "+person.get("Name") + "\nAge :: " + person.get("Age") );

        person.remove("Address");
        System.out.println("Person object size :: " + person.size());

        System.out.println("\nChecking if object contains 'Phone' key :: " + person.containsKey("Phone"));
        System.out.println("\nChecking if object contains value '17' :: " + person.containsValue("17" ));


        return person;
    }

}












