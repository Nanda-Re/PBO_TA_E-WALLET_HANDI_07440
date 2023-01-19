package Model;

import Entitiy.VoucherPulsaEntitiy;
import Utility.Rupiah;

import java.util.ArrayList;

public class StorageModel {
    private static ArrayList<VoucherPulsaEntitiy> itemPulsa = new ArrayList<>();

    public static void initialItemPulsa() {
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 10.000", 11500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 15.000", 16500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 20.000", 21500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 25.000", 25500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 40.000", 41500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 50.000", 50500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 75.000", 75500));
        itemPulsa.add(new VoucherPulsaEntitiy("Voucher 100.000", 100000));
    }

    public static ArrayList<VoucherPulsaEntitiy> getItemPulsa(){
        return itemPulsa;
    }

    public static void seeItemPulsa(){
        int i = 1;

        for (VoucherPulsaEntitiy pulsa : itemPulsa ){
            System.out.println(i + "." + pulsa.getTitle() + " (Rp." + Rupiah.format(pulsa.getHarga()) + ")");

            i += 1;
        }
        System.out.println();
    }
}
