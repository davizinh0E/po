package pessoa;

public class PessoaJuridica extend Pessoa {
    private String cnpj;

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
}
