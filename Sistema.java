package Class.Exercicio2;

import java.util.List;
import java.util.ArrayList;

public class Sistema {

    private List<Vendedor> vendedorLista = new ArrayList<>();

    public void incluirVendedor(int codigo, String nome, char tipoAlimento) {
        Vendedor vendedor = new Vendedor(codigo, nome, tipoAlimento);
        vendedorLista.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
    }

    public void consultarVendedorTipo(char tipoAlimento) {
        int total = 0;
        for (Vendedor vendedor : vendedorLista) {
            if (Character.toLowerCase(vendedor.getTipoAlimento()) == tipoAlimento) {
                total++;
            }
        }
        System.out.println("Total de vendedores de alimentos ("+tipoAlimento+"): " + total);
    }

    public boolean excluirVendedor(String nome) {
        for (Vendedor vendedor : vendedorLista) {
            if(vendedor.getNome().equalsIgnoreCase(nome)) {
                vendedorLista.remove(vendedor);
                System.out.println("Vendedor removido com sucesso");
                return true;
            }
            else {
                System.out.println("Vendedor não encontrado!");
            }
        }
        return false;
    }

    public void consultarDados(String nome) {
        for (Vendedor vendedor : vendedorLista) {
            if(vendedor.getNome().equalsIgnoreCase(nome)) {
                System.out.println(vendedor);
            }
            else {
                System.out.println("Vendedor não encontrado!");
            }
        }
    }

    public void consultarVendedores() {
        if (vendedorLista.isEmpty()) {
            System.out.println("Não há vendedores cadastrados!");
        }
        else {
            System.out.println("Vendedores cadastrados: ");
            for (Vendedor vendedor : vendedorLista) {
                System.out.println(vendedor.getNome());
            }
        }
    }
}