import javax.swing.JOptionPane;

public class Pedido  {
    
    private String tipo;
    private int qntdProduto;
    private double novoPreco;


    public void realizarPagamento(){
        Object[] opcao = { "Crédito", "Débito" };
        int pgto = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento", "Pagamento", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcao, opcao[0]);


        if (pgto == 0) {
            JOptionPane.showMessageDialog(null, "Opção selecionada: Crédito");

            if(getQntdProduto() > 2){
                JOptionPane.showInputDialog(null, "Dados da Compra:\n" +getQntdProduto() +" " +getTipo() +", no valor de R$" +getNovoPreco() +"\nForma de pagamento escolhida: Crédito");
            } else if(getQntdProduto() <= 2){
                JOptionPane.showInputDialog(null, "Dados da Compra:\n" +getQntdProduto() +" " +getTipo() +"s, no valor de R$" +getNovoPreco() +"\nForma de pagamento escolhida: Crédito ");
            }

            JOptionPane.showMessageDialog(null, "Operação concluida");
            finalizarPagamento();
        }

        else if(pgto == 1){
            JOptionPane.showMessageDialog(null,"Opção selecionada: Débito");

            if(getQntdProduto() > 2){
                JOptionPane.showInputDialog(null, "Dados da Compra:\n" +getQntdProduto() +" " +getTipo() +", no valor de R$" +getNovoPreco() +"\nForma de pagamento escolhida: Débito");
            } else if(getQntdProduto() <= 2){
                JOptionPane.showInputDialog(null, "Dados da Compra:\n" +getQntdProduto() +" " +getTipo() +"s, no valor de R$" +getNovoPreco() +"\nForma de pagamento escolhida: Débito ");
            }
        }
    }

    public void finalizarPagamento(){

    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getQntdProduto(){
        return qntdProduto;
    }

    public void setQntdProduto(int qntdProduto){
        this.qntdProduto = qntdProduto;
    }

    public double getNovoPreco(){
        return novoPreco;
    }

    public void setNovoPreco(double novoPreco){
        this.novoPreco = novoPreco;
    }
}
