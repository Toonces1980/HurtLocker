package pajerowski.tony;

import java.util.HashMap;

public class HurtLockerController {
    HurtLockerParser data = new HurtLockerParser();
    HurtLockerItemCounter counter = new HurtLockerItemCounter();

    public String makeDoubleLines() {
        StringBuilder line = new StringBuilder("=============");
        line.append("             ");
        line.append("=============");
        return line.toString();
    }

    public String makeSingleLines() {
        StringBuilder line = new StringBuilder("-------------");
        line.append("             ");
        line.append("-------------");
        return line.toString();
    }

    public String makeNameFormat(String name) {
        StringBuilder firstline = new StringBuilder("name:   ");
        firstline.append(name);
        firstline.append("              ");
        firstline.append("seen: ");
        firstline.append("1");
        firstline.append(" times\n");
        firstline.append(makeDoubleLines());
        return firstline.toString();
    }

    public String makePriceFormat(HashMap<String, Integer> inventory) {
        StringBuilder priceFormat = new StringBuilder();
      //  for (String item: inventory) {
            StringBuilder priceLine = new StringBuilder("price:   ");
            priceLine.append("");
            priceLine.append("           ");
            priceLine.append("seen:");
            priceLine.append("");
            priceLine.append("times\n");
            priceLine.append(makeSingleLines());
            priceLine.append("\n");
            priceFormat.append(priceLine.toString());

        return priceFormat.toString();
    }

    public String formatErrors() {
        StringBuilder errors = new StringBuilder("Errors:    ");
        errors.append("             ");
        errors.append("seen:  ");
        errors.append(MissingDataException.errorCount);
        errors.append("  times");
        return errors.toString();
    }

    public String generateReceipt(){
        String receipt = "";
        int tempCount = 0;
        for (String name: counter.itemPrices.keySet()){
            receipt +=


            tempCount++;
//        for (int i = 0; i < counter.nameCounts.size(); i++){
//            makeNameFormat(counter.itemPrices.get())
        }
        return receipt;
    }
}