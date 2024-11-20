public class FolhaPGTO {
    public static void main(String[] args) throws Exception {
        Mensalista men1, men2;
        Horista hora1, hora2;

        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularINSS();
        System.out.println("Nome: "+ men1.getNome());
        System.out.println(
            "EnderecoNome: "+ men1.getEndereco()
        );
        System.out.println(
            "Salario: "+ men1.getSalario()
        );
        System.out.println("INSS: " + men1.calcularINSS());
        System.out.println("IR: " + men1.calcularIR());


        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularINSS();
        System.out.println("Nome: "+ men2.getNome());
        System.out.println(
            "EnderecoNome: "+ men2.getEndereco()
        );
        System.out.println(
            "Salario: "+ men2.getSalario()
        );
        System.out.println("INSS: " + men2.calcularINSS());
        System.out.println("IR: " + men2.calcularIR());


        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        System.out.println(
            "Nome: "+ hora1.getNome()
        );
        System.out.println(
            "EnderecoNome: "+ hora1.getEndereco()
        );
        System.out.println(
            "Salario: "+ hora1.getSalario()
        );
        System.out.println("INSS: " + hora1.calcularINSS());
        System.out.println("IR: " + hora1.calcularIR());


        hora2 = new Horista("Cristina", "Rua do centro", 10);
        hora2.calcularSalario();
        System.out.println(
            "Nome: "+ hora2.getNome()
        );
        System.out.println(
            "EnderecoNome: "+ hora2.getEndereco()
        );
        System.out.println(
            "Salario: "+ hora2.getSalario()
        );
        System.out.println("INSS: " + hora2.calcularINSS());
        System.out.println("IR: " + hora2.calcularIR());

        
        // Mensalista m1 = new Mensalista("José", "Rua abc n345", "Junior");
        // Horista h1 = new Horista("Maria", "Rua 23 de maio", 10);
        // m1.calcularSalario();
        // System.out.println("INSS: "+m1.calcularINSS());
        // System.out.println("IR: "+m1.calcularIR());
        
        // h1.calcularSalario();
        // System.out.println("INSS: "+h1.calcularINSS());
        // System.out.println("IR: "+h1.calcularIR());
    }
}
