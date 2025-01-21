package poo;

import poo.InVoice.InVoice;

public class poo {
    public static void main(String[] args) {
        InVoice inv = new InVoice(1, "Monitor", -34, 750);

        System.out.println("Total Value= " + inv.getInvoiceAmount());
    }


}
