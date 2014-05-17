//cci150 17.7

public class IntUtils {
    public static String intToEnglish(int n) {
        StringBuilder sb = new StringBuilder();
        if(n < 0) {
            sb.append("Minus ");
            n = -n;
        }
        String[] data = new String[]{"Zero ", "One ", "Two ", "Three ",
            "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
            "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ",
            "Sixteen ", "Seventeen ", "Eighteen ", "Ninteen ", "Twenty ",
            "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ",
            "Ninety "};
        if(n < 20) {
            sb.append(data[n]);
        }
        else if(n < 100) {
            sb.append(data[n/10+18]);
            if(n%10 != 0) {
                sb.append(data[n%10]);
            }
        }
        else if(n < 1000) {
            sb.append(data[n/100]);
            sb.append("Hundred ");
            sb.append("and ");
            if(n%100 != 0) {
                sb.append(intToEnglish(n%100));
            }
        }
        else if(n < 1000000) {
            sb.append(intToEnglish(n/1000));
            sb.append(" ");
            sb.append("Thousand");
            if(n%1000 != 0) {
                sb.append(", ");
                sb.append(intToEnglish(n%1000));
            }
        }
        else if(n < 1000000000) {
            sb.append(intToEnglish(n/1000000));
            sb.append(" ");
            sb.append("Millon");
            if(n%1000000 != 0) {
                sb.append(", ");
                sb.append(intToEnglish(n%1000000));
            }
        }
        else if(n <= 0x7fffffff) {
            sb.append(intToEnglish(n/1000000000));
            sb.append(" ");
            sb.append("Billion");
            if(n%1000000000 != 0) {
                sb.append(", ");
                sb.append(intToEnglish(n%1000000000));
            }
        }
        return sb.toString().trim();
    }
}
