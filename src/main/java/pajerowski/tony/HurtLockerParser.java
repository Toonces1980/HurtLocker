package pajerowski.tony;
import java.util.*;
import java.util.regex.*;

public class HurtLockerParser {
    Regex regex = new Regex();
    ArrayList<HurtLockerModel> inventory = new ArrayList<>();

    private class Regex{
        String nC = "((?<=[mM].[:])([;]))";
        String pC = "((?<=[cC].[:])([;]))";
        String tC = "((?<=[pP].[:])([;]))";
        String eC = "((?<=[oO].[:])([;]))";
        String nE = "((?<=[mM].[:])\\w+)";
        String pE = "((?<=[cC].[:])\\d+[.]\\d+)";
        String tE = "((?<=[pP].[:])\\w+)";
        String eE = "((?<=[oO].[:])\\d+[/]\\d+[/]\\d+)";
        Pattern objFields = Pattern.compile(nE + "|" + pE + "|" + tE + "|" + eE +
                "|" + nC + "|" + pC + "|" + tC + "|" + eC );
    }

    public ArrayList<HurtLockerModel> makeItems(String rawString) {
        Matcher nameMatcher = regex.objFields.matcher(rawString);
        while (nameMatcher.find()) {
                    String a = editNameEntry(nameMatcher.group());
                    nameMatcher.find();
                    String b = (nameMatcher.group());
                    nameMatcher.find();
                    String c = (nameMatcher.group());
                    nameMatcher.find();
                    String d = (nameMatcher.group());
            try {
                if(a.equals(";") || b.equals(";") || c.equals(";") || d.equals(";")){
                    throw new MissingDataException();
                }
                inventory.add(new HurtLockerModel(a, b, c, d));
            } catch (MissingDataException missingDataError) {
                missingDataError.errorCount++;
            }
                }
        return inventory;
    }

    public String editNameEntry (String toFix) {
        String fixed;
        char temp = toFix.toLowerCase().charAt(0);
        switch(temp) {
            case 'm':
                fixed = "Milk";
                break;
            case 'b':
                fixed = "Bread";
                break;
            case 'c':
                fixed = "Cookies";
                break;
            case 'a':
                fixed = "Apples";
                break;
            default: fixed = ";";
        }
        return fixed;
    }
}