package kata3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        String name = "C:\\Users\\Elessar2\\Desktop\\emailsfilev1.txt";
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(name));
            String mail;

            while ((mail = fileIn.readLine()) != null) {
                if (mail.contains("@")) {
                    histogram.increment(mail.split("@")[1]);
                }
            }

        } catch (Exception e) {

        }
        HistogramDisplay histograma = new HistogramDisplay(histogram);
        histograma.execute();
    }

}
