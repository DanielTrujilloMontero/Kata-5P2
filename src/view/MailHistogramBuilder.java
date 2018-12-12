 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<String> mailList) {
        Histogram<String> histogram = new Histogram();
        
        for(String m : mailList) {
            histogram.increment(m);
        }
        return histogram;
    }
}
