package oops;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Java OOPS
public class Main {
    public static void main(String[] args) {

        JsonObject jj = new Gson().fromJson("", JsonObject.class);
//String json1 = "{ \"A\":1, \"B\":2, \"C\": {\"D\": 3, \"E\":4}}";
//
//
//        JSONObject  jsonObject1 = new JSONObject(json1);
//        jsonObject1.get("key");

        // [5:23 PM] Rath, Siddharth Narayan
        //5,2,4,3,8,7,9,0
        List<Integer> list = Arrays.asList(5, 10, 2, 8, 15, 7);

        // int secondHighest = Integer.MIN_VALUE;
        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1) && list.get(i) < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = list.get(i);

            } else if (list.get(i + 1) < firstLowest) {
                   secondLowest = firstLowest;
                firstLowest = list.get(i + 1);
            }
        }
        System.out.println(secondLowest);
    }
public void hello(){

}

}