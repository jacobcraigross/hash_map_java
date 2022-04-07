import java.util.HashMap; // --> this gets auto imported when you create a hash map

public class hashMap {
    public static void main(String[] args) {
        // good for storing lots of data in one place via KVP. vs just creating a lot of variables.
        // let's put all these variables in a hash map.

        int id_one = 7262;
        int id_two = 8363;
        int id_three = 3241;
        int id_four = 6667;
        int id_five = 2233;
        int id_six = 1123; // --> btw int here are primitive types, purple keyword.

        // one thing to note, the KVP need to have the types declared as well. this is done via angle brackets.
        // HashMap <String, Integer> --> this capital Integer refers to the actual type.
        HashMap<String, Integer> jakeHashMap = new HashMap<String, Integer>();
        jakeHashMap.put("id_one", 7262);
        jakeHashMap.put("id_two", 8363);
        jakeHashMap.put("id_three", 3241);
        jakeHashMap.put("id_four", 6667);
        jakeHashMap.put("id_five", 2233);
        jakeHashMap.put("id_six", 1123);

        System.out.println(jakeHashMap); // --> shows our basic hash map
        System.out.println(jakeHashMap.get("id_four")); // --> returns a specific KVP

        // a more realistic use case would be UN and PW.
        HashMap<String, String> userAndPass = new HashMap<String, String>();
        userAndPass.put("jcr.dev", "j27282");
        userAndPass.put("ldc.sec", "js8s7s");
        userAndPass.put("ksu.gru", "k87333");
        System.out.println(userAndPass);
        userAndPass.remove("jcr.dev"); // --> removes this KVP
        System.out.println(userAndPass.size()); // --> get the size of the hash map, was 3 now it's 2. 
        // userAndPass.value(); --> returns the values, etc. 
    }
}
