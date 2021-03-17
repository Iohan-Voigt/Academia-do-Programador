/**
 * @author iohan
 */
import java.util.ArrayList;

    // Por onde começa tudo ====================================================
public class Principal {
    
    
    public static void main(String []args) {
        
        
        // Criando os arrays ===================================================
        ArrayList <Equipamentos> equipamentos = new ArrayList<>();
        ArrayList <Chamados> chamados = new ArrayList<>();
        
        // Criando exemplos ====================================================
        chamados.add(new Chamados("Manutenção","Partiu","Broca", "04/03/2021"));
        chamados.add(new Chamados("Manutenção", "Quebrou a lâmina", "Cerra circular", "14/09/2021"));
        
        equipamentos.add(new Equipamentos("Broca","192220-AAA","Flávio Brocas", 50000.00f,"08/12/1980"));
        equipamentos.add(new Equipamentos("Cerra Circular", "111928-BBB", "Jussara lâminas", 7500.00f,"14/05/2000"));
       
        // inicia a tela de seleção ============================================
        
        java.awt.EventQueue.invokeLater(()->{
        new Tela(chamados, equipamentos).setVisible(true);
        });
    }
    
}
