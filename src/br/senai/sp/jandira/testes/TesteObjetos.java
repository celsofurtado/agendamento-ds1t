package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Cliente;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade("Cardiologia");
        //e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque.");

        Especialidade e2 = new Especialidade();
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa ficar com dor de barriga");

        Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido.");

        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa!");
        
        Especialidade e5 = new Especialidade();
        e5.setNome("Especialidade 5");
        
        
        // Exibir a quantidade de especialides criadas até agora
        System.out.println("TOTAL DE ESPECIALIDADES ----> " + e1.getContador());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());
        System.out.println(e4.getCodigo() + " - " + e4.getNome());
        System.out.println(e5.getCodigo() + " - " + e5.getNome());
        
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

        // Imprimir no console o nome das especialidades
        // que estão armazenada no arraylist
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // Utilização do for para iteração no arraylist
//		for(contador;condição;acumulador) {
//			
//		}
        System.out.println("----------- FOR -------------------");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        // FOR EACH -> para cada
        System.out.println("---------- FOR EACH --------------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        // Criar 3 planos de saúde, armazenar em um arraylist
        // e exibir o nome da operadora de cada um deles
        // usando for each
        PlanoDeSaude p1 = new PlanoDeSaude("Amil");
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planos = new ArrayList<>();
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);

        System.out.println("****** for each planos ******");
        for (PlanoDeSaude p : planos) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        PlanoDeSaude xpto = new PlanoDeSaude();
        PlanoDeSaude xpto1 = new PlanoDeSaude();
        PlanoDeSaude xpto2 = new PlanoDeSaude();

        System.out.println("------" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("------" + PlanoDeSaude.getQuantidade());

    }

}
