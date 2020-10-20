package lista1exercicio6;

import javax.swing.JOptionPane;

public class Mes {
    private int mes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    public void mes(){
        
        int m;
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês desejado: "));
        if (m != 1 && m != 2 && m != 3 && m != 4 && m != 5 && m != 6 &&
                m != 7 && m != 8 && m != 9 && m != 10 && m!= 11 && m != 12){
            JOptionPane.showMessageDialog(null,"Número de mês inválido, insira o número correspondente ao mês.");
        }
        switch (m){
            case 1:
                JOptionPane.showMessageDialog(null, "Janeiro tem " + mes[0]+ " dias.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro tem " + mes[1]+ " dias.");
                break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Março tem  " + mes[2] + " dias.");
                break;
            case 4: 
                JOptionPane.showMessageDialog(null, "Abril tem  " + mes[3] + " dias.");
                break;
            case 5: 
                JOptionPane.showMessageDialog(null, "Maio tem  " + mes[4] + " dias.");
                break;
            case 6: 
                JOptionPane.showMessageDialog(null, "Junho tem  " + mes[5] + " dias.");
                break;
            case 7: 
                JOptionPane.showMessageDialog(null, "Julho tem  " + mes[6] + " dias.");
                break;
            case 8: 
                JOptionPane.showMessageDialog(null, "Agosto tem  " + mes[7] + " dias.");
                break;
            case 9: 
                JOptionPane.showMessageDialog(null, "Setembro tem  " + mes[8] + " dias.");
                break;
            case 10: 
                JOptionPane.showMessageDialog(null, "Outubro tem  " + mes[9] + " dias.");
                break;
            case 11: 
                JOptionPane.showMessageDialog(null, "Novembro tem  " + mes[10] + " dias.");
                break;    
            case 12: 
                JOptionPane.showMessageDialog(null, "Dezembro tem  " + mes[11] + " dias.");
                break;
        }
    } 
}

    
