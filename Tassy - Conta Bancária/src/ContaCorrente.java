/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tassy.7214
 */
public class ContaCorrente {
    
    private Cliente nome;
    private Agencia agencia;
    private int tipoOperacao;
    private double saldo;
    private double valorLimite;
    private double valorOperacao;

    public ContaCorrente(){
        this.nome = nome;
        this.agencia = agencia;
        this.tipoOperacao = tipoOperacao;
        this.saldo = saldo;
        this.valorOperacao = valorOperacao;
    }
    
    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public Cliente getNome() {
        return nome;
    }

    public void setNome(Cliente nome) {
        this.nome = nome;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(int tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0){
          this.saldo = saldo;
        }else{
        System.out.println("nao pode sacar valor maior que o saldo atual");

        }
    }
    
    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public boolean sacar(double valor){
        double calcSacar = 0;
        if (saldo >= valor){
           saldo-=valor;
           return true;
        }else if(saldo+valorLimite >= valor){
          saldo = saldo+valorLimite - valor;
          return true;
        }else{
            System.err.println("saldo insufivente");
        return false;
        }
    }
    
    public void imprimeInfor(){
        System.out.println("Nome: "+this.nome.getNome());
        System.out.println("Agencia: "+this.agencia.getAgencia());
        System.out.println("Conta Correte: "+this.agencia.getNumero());
        System.out.println("Saldo"+ this.saldo);
    }
    

    
    

    
}
