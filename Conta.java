package sp.senai.br.contabancaria;

public class Conta extends BaseConta {
    
    public void realizarDepositos(double valor)
    {
        this.saldo += valor;
    }
    
    private boolean validarSaque(double valor){
        
        double totalSaldo = this.saldo - valor;
        if(totalSaldo > -1000){
            return true;
        }
        return false;
    }
    
    public void realizarSaque(double valor)        
    {
        if(this.validarSaque(valor)){
            this.saldo -= valor;
        }else{
            System.out.println("voce nao possui saldo!!!");
        }
        
    }
}
