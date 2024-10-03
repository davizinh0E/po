import pessoa.Pessoa;
import pessoa.PessoaJuridica;
import pessoa.PessoaJuridica;

public class Main {
    public static void main (String[]args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        
        System.out.println(pessoa.getNome());
        pessoa.setNome = "Beatriz";
        System.out.println(pessoa.getNome());

        pessoaFisica.setNome("Joao");
        System.out.println(pessoaFisica.getNome());
        pessoaFisica.setCpf("09068486662");
        System.out.println(pessoaFisica.getCpf());

        pessoaJuridica.setNome("UNA");
        pessoaJuridica.setCnpj("123.456.789-09");
        
        System.out.println(pessoaJuridica.getNome());
        System.out.println(pessoaJuridica.getCnpj());
        
    }
}
