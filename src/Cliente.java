import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String senha;

    Scanner sc = new Scanner(System.in);

    Produto produto = new Produto();

   public void realizarCadastro(){

    Object[] opcao = { "Login", "Cadastro" };
    int pgto = JOptionPane.showOptionDialog(null, "Bem vindo!", "Login", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcao, opcao[0]);


    if (pgto == 0) {
        realizarLogin();
    } else 

        nome = JOptionPane.showInputDialog("Digite seu nome para o Cadastro: ");
        email = JOptionPane.showInputDialog("Digite seu email: ");
        telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
        endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
        senha = JOptionPane.showInputDialog("Digite sua senha: ");

        JOptionPane.showMessageDialog(null, "Seu Cadastro.\nNome: " +getNome() +"\nEmail: " +getEmail() +"\nTelefone: " +getTelefone() +"\nEndereço: " +getEndereco() +"\nSenha: " +getSenha());
    }

    public void realizarLogin(){
        String usr = JOptionPane.showInputDialog("Digite seu email para login: ");
            String psw = JOptionPane.showInputDialog("digite sua senha: ");

        if(usr.equals(email) && psw.equals(senha)){
            JOptionPane.showMessageDialog(null,"Bem Vindo " +nome +"!");
            produto.buscarProduto();

        } else if(usr.equals("admin") && psw.equals("admin")){
            JOptionPane.showMessageDialog(null,"Bem Vindo ADMIN!");
            produto.buscarProduto();

        }else{
            JOptionPane.showMessageDialog(null, "Login Invalido.");
            realizarCadastro();
        }

   }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    }
