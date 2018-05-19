public class DemoStringFormat {

    public static void main (String[] args){
        // this should be in the file properties
        String text = "Hello %s, today the weather is %s";


        // this is parameter in java class
        String nama = "derry";
        String cuaca = "rainy";

        String result = String.format(text, nama, cuaca);

        System.out.println(result);
    }

}
