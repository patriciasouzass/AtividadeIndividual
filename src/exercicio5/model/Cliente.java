package exercicio5.model;

public class Cliente {

    int id;
    String nome;
    String cpf;
    String endereco;
    String email;
    String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean cpfValido(String cpf){
        if (cpf.length()!=11){
            System.out.println("O CPF precisa ter 11 caracteres.");
        } else {
            System.out.println("CPF cadastrado com sucesso!");
        }
        return true;
    }

    public boolean nomeValido(String nome){
        if (nome.length()>= 3 && nome.length()<=50){
            System.out.println("Nome cadastrado com sucesso!");
        } else {
            System.out.println("O nome precisa ter de 3 a 50 caracteres.");
        }
        return true;
    }

    public boolean emailValido(String email){
        if (email.indexOf('@') == 1) {
            System.out.println("E-mail cadastrado com sucesso!");
        } else {
            System.out.println("O e-mail precisa estar no padrão correto.");
        }
        return true;
    }

    public boolean telefoneValido(String telefone){
        if (telefone.length() == 1){
            System.out.println("Telefone cadastrado com sucesso!");
        }
        else {
            System.out.println("O telefone precisa ter 11 caracteres.");
        }
        return true;
    }

    public boolean validarCliente(){
        if (nomeValido(nome) == true && cpfValido(cpf) == true && emailValido(email) == true && telefoneValido(telefone) == true){
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Cliente não pôde ser cadastrado. Dados inválidos!");
        }
        return true;
    }
}
