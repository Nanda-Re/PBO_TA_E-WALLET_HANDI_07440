package Controller;

import Entitiy.UserEntitiy;

public class CekSaldoController {
    public int cekSaldo(UserEntitiy userEntitiy) {
        return userEntitiy.getDompet().getSaldo().getSaldo();
    }
}
