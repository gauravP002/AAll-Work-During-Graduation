public class ispal {
    public static void main(String[] args) {
        System.out.println(StringChallenge("Noel - ses Leon")); // Output: true
        System.out.println(StringChallenge("A war tvb Tarawa!")); // Output: true
        
    }
    public static String StringChallenge(String str) {
        String clen = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean ispal = clen.equals(new StringBuilder(clen).reverse().toString());
        return String.valueOf(ispal);

    }

    
}
