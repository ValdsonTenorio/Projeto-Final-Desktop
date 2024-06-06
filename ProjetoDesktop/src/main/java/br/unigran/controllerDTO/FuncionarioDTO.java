package br.unigran.controllerDTO;

import br.unigran.entities.Funcionario;

public class FuncionarioDTO {
    public String nomeFuncionario;
    public String cpf;
    public String dataNasc;
    public String endereco;
    public String sexo;
    public String telefone;
    public String email;
    public String dataAdmissao;
    public float salario;
    public String cargo;
    public String funcao;
    public String login;
    public String senha;
    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeFuncionario);
        funcionario.setCpf(cpf);
        funcionario.setDataNasc(dataNasc);
        funcionario.setEndereco(endereco);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setDataAdmissao(dataAdmissao);
        funcionario.setSalario(salario);
        funcionario.setCargo(cargo);
        funcionario.setFuncao(funcao);
        funcionario.setLogin(login);
        funcionario.setSenha(senha);
        return funcionario;
    }

    public FuncionarioDTO (Funcionario funcionario){
        this.id = funcionario.getId();
        this.nomeFuncionario = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.dataNasc = funcionario.getDataNasc();
        this.endereco = funcionario.getEndereco();
        this.sexo = funcionario.getSexo();
        this.telefone = funcionario.getTelefone();
        this.email = funcionario.getEmail();
        this.dataAdmissao = funcionario.getDataAdmissao();
        this.salario = funcionario.getSalario();
        this.cargo = funcionario.getCargo();
        this.funcao = funcionario.getFuncao();
        this.login = funcionario.getLogin();
        this.senha = funcionario.getSenha();
    }

    public FuncionarioDTO() {
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public FuncionarioDTO setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public FuncionarioDTO setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public FuncionarioDTO setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public FuncionarioDTO setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getSexo() {
        return sexo;
    }

    public FuncionarioDTO setSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public FuncionarioDTO setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FuncionarioDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public FuncionarioDTO setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }

    public float getSalario() {
        return salario;
    }

    public FuncionarioDTO setSalario(float salario) {
        this.salario = salario;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public FuncionarioDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getFuncao() {
        return funcao;
    }

    public FuncionarioDTO setFuncao(String funcao) {
        this.funcao = funcao;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public FuncionarioDTO setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public FuncionarioDTO setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}
