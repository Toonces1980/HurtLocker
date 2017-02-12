package pajerowski.tony;

import java.util.ArrayList;
import java.util.HashMap;

public class HurtLockerItemCounter {

    int milkCount = 0;
    int breadCount = 0;
    int cookiesCount = 0;
    int applesCount = 0;

    ArrayList<Integer> nameCounts= new ArrayList<Integer>();
    {
        nameCounts.add(milkCount);
        nameCounts.add(breadCount);
        nameCounts.add(cookiesCount);
        nameCounts.add(applesCount);
    }



    public HashMap<String, HashMap<String,Integer>> itemPrices = new HashMap<>();
    public HashMap<String, Integer> priceCount;

    public void itemPriceCounter(ArrayList<HurtLockerModel> items){
        for( HurtLockerModel item : items ){
            if(item.name.equals("Milk")){
                priceCount = new HashMap<>();
                milkCount++;
                if(priceCount.get(item.price) == null){
                    priceCount.put(item.price, 1);
                } else priceCount.put(item.price, 1 + priceCount.get(item.price));
                itemPrices.put("Milk", priceCount);
            } else if (item.name.equals("Bread")){
                priceCount = new HashMap<>();
                breadCount++;
                if(priceCount.get(item.price) == null){
                    priceCount.put(item.price, 1);
                } else priceCount.put(item.price, 1 + priceCount.get(item.price));
                itemPrices.put("Bread", priceCount);
            } else if (item.name.equals("Cookies")){
                priceCount = new HashMap<>();
                cookiesCount++;
                if(priceCount.get(item.price) == null){
                    priceCount.put(item.price, 1);
                } else priceCount.put(item.price, 1 + priceCount.get(item.price));
                itemPrices.put("Cookies", priceCount);
            } else if (item.name.equals("Apples")){
                priceCount = new HashMap<>();
                applesCount++;
                if(priceCount.get(item.price) == null){
                    priceCount.put(item.price, 1);
                } else priceCount.put(item.price, 1 + priceCount.get(item.price));
                itemPrices.put("Apples", priceCount);
            }
        }
    }
}