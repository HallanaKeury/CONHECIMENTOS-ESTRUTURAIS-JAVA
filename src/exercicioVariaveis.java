import java.util.Locale;
import java.text.NumberFormat;

public class exercicioVariaveis {
    public static void main(String[] args){
        //Locale para formatação com ponto
        Locale localeUS = Locale.US;
        //Locale para formatação com vírgula
        Locale localeBR = new Locale("pt","BR");


        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Formatação com vírgula (Locale Brasil)
        NumberFormat brFormat = NumberFormat.getNumberInstance(localeBR);
        brFormat.setMinimumFractionDigits(2); // Define duas casas decimais
        brFormat.setMaximumFractionDigits(2);

        // Formatação com ponto (Locale EUA)
        NumberFormat usFormat = NumberFormat.getNumberInstance(localeUS);
        usFormat.setMinimumFractionDigits(2); // Define duas casas decimais
        usFormat.setMaximumFractionDigits(2);



        System.out.println("Products: ");
        System.out.printf("%s , which price is $ %s%n" , product1, brFormat.format(price1));
        System.out.printf("%s , which price is %s%n%n", product2, brFormat.format(price2));
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n" , age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n" , measure );
        System.out.printf("Rouded(three decimal places): %.3f%n" , measure );
        System.out.printf("US decimal point: %.3f%n" , measure );

    }



}
