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
}
