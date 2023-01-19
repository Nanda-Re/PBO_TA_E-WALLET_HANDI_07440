package Controller;

import Entitiy.TopUpEntity;
import Entitiy.UserEntitiy;

public class TopUpController {
    public void topUp(UserEntitiy userEntitiy, TopUpEntity trs) {
        userEntitiy.getDompet().tambahTrs(trs);
        userEntitiy.getDompet().getSaldo().tambahSaldo(trs.getNominalHarga());
    }
}
