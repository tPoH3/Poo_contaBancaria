package sp.senai.br.contabancaria;

public class BaseConta {
    protected int numero;
    
    protected int agencia;
    
    protected double saldo;
    
    protected double limite;
    
    protected int senha;

    

    
    
    protected double saldoTotal;
    
    protected double limiteDisponivel;
    
    protected String chavePix[];

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
        public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String[] getChavePix() {
        return chavePix;
    }

    public void setChavePix(String[] chavePix) {
        this.chavePix = chavePix;
    }
    
    public double getSaldoTotal() {
        return saldoTotal = this.saldo + this.limite;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    public double getLimiteDisponivel(double valor) {
        
        if(this.saldo <0){
            return this.limite - Math.abs(this.saldo);
        }
        return this.limite;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
