public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public double calcularINSS(){
        double inss = 0;

        if (salario <= 1302.00) {
            inss = salario * 0.075;  
        } else if (salario <= 2571.29) {
            inss = salario * 0.09;   
        } else if (salario <= 3856.94) {
            inss = salario * 0.12;   
        } else if (salario <= 7507.49) {
            inss = salario * 0.14;   
        } else {
            inss = salario * 0.14;   
        }

        return inss;
    }

    public double calcularIR(){
        double ir = 0;

        if (salario <= 1903.98) {
            ir = 0;  
        } else if (salario <= 2826.65) {
            ir = salario * 0.075;   
        } else if (salario <= 3751.05) {
            ir = salario * 0.15;    
        } else if (salario <= 4664.68) {
            ir = salario * 0.225;   
        } else {
            ir = salario * 0.275;   
        }

        return ir;
    }

    
    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}