import javax.swing.JOptionPane;

public class Produto {

    private int qntdPedido;
    private double preco;
    private double precoTenis, precoSapato, precoSandalia, precoChinelo;

    private String tipo;
    private int qntdProduto;
    private double novoPreco;


    Pedido pedido = new Pedido();


    public void buscarProduto(){
        setPrecoTenis(45.00);
        setPrecoSapato(60.00);
        setPrecoSandalia(25.00);
        setPrecoChinelo(15.00);

        tipo = JOptionPane.showInputDialog(null, "Qual o produto deseja escolher?\nTênis R$45,00\nSapato R$60,00\nSandália R$25,00\nChinelo R$15,00");
        qntdProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a quantidade? "));
        
        if(tipo.equals("Tênis")){
            novoPreco = getPrecoTenis() * qntdPedido;
            if(qntdProduto > 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +" com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else if(qntdProduto <= 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +" com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else{
            
            }
        } else if(equals("Sapato")){
            novoPreco = getPrecoSapato() * qntdProduto;
            if(qntdProduto > 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +" com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else if(qntdProduto <= 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +"s com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else{
            
            }
        } else if(tipo.equals("Sandália")){
            novoPreco = getPrecoSandalia() * qntdProduto;
            if(qntdProduto > 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +" com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else if(qntdProduto <= 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +"s com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else{
            
            }
        }  else if(equals("Chinelo")){
            novoPreco = getprecoChinelo() * qntdProduto;
            if(qntdProduto > 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +" com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else if(qntdProduto <= 2){
                JOptionPane.showMessageDialog(null, "Você escolheu " +qntdProduto +" " +tipo +"s com o valor de R$" +novoPreco);
                pedido.realizarPagamento();
            } else{
            
            }
        } else{
            JOptionPane.showMessageDialog(null, "Produto não disponível.\nOperação cancelada.");
        }
    }

    public void selecionarProduto(){

    }

    public int getQntdPedido(){
        return qntdPedido;
    }

    public void setQntdPedido(int qntdPedido){
        this.qntdPedido = qntdPedido;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }
     
    public double getPrecoTenis(){
        return precoTenis;
    }

    public void setPrecoTenis(Double precoTenis){
        this.precoTenis = precoTenis;
    }

    public Double getPrecoSapato(){
        return precoSapato;
    }

    public void setPrecoSapato(Double precoSapato){
        this.precoSapato = precoSapato;
    }

    public Double getPrecoSandalia(){
        return precoSandalia;
    }

    public void setPrecoSandalia(Double precoSandalia){
        this.precoSandalia = precoSandalia;
    }
    
    public Double getprecoChinelo(){
        return precoChinelo;
    }

    public void setPrecoChinelo(Double precoChinelo){
        this.precoChinelo = precoChinelo;
    }
}
