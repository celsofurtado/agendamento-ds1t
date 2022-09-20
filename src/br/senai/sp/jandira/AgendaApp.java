package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		// Criar 5 especialidades 
		// Cardiologia, Otorrinolaringologia
		// Gastroenterologia, Fisioterapia
		// Clínica Geral
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do seu coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Cuida do seu ouvido.");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Gastroenterologia");
		especialidade3.setDescricao("Cuida da sua barriguinha.");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Cuida dos seus ossos, músculos, etc.");
		
		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clínico geral");
		especialidade5.setDescricao("Cuida de tudo um pouquinho.");
		
		// Criar 2 médicos, com as seguintes características
		// O medico1 é clínico geral e cardiologista;
		// O medico2 é Fisioterapeuta, Cardiologista e clínico geral
		Medico medico1 = new Medico();
		medico1.setNome("Pedro da Silva");
		medico1.setEmail("pedro@uol.com.br");
		medico1.setCrm("4512-5");
		medico1.setTelefone("(11)99996-6562");
		Especialidade[] especialidades1 = {
				especialidade1, 
				especialidade5
				};
		medico1.setEspecialidades(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Gomes");
		medico2.setEmail("fabiana@terra.com.br");
		medico2.setCrm("32458-9");
		medico2.setTelefone("(11)96388-2214");
		Especialidade[] especialidades2 = {
				especialidade1, 
				especialidade4,
				especialidade5
				};
		medico2.setEspecialidades(especialidades2);
		
		// Exibir os dados dos dois médicos
		// Nome do médico: ??????
		// CRM do médico: ???????
		// Especialidades: ???????, ??????, ?????
		System.out.println("-------- LISTA DE MÉDICOS DA CLÍNICA ---------");
		System.out.println("Nome do médico: " + medico1.getNome());
		System.out.println("CRM do médico: " + medico1.getCrm());
		System.out.print("Especialidades: ");
		
		int i = 0;
		
		while (i < medico1.getEspecialidades().length) {
			System.out.print(medico1.getEspecialidades()[i].getNome() + ", ");
			i++;
		}
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Nome do médico: " + medico2.getNome());
		System.out.println("CRM do médico: " + medico2.getCrm());
		System.out.print("Especialidades: ");

		i = 0;
		
		while (i < medico2.getEspecialidades().length) {
			System.out.print(medico2.getEspecialidades()[i].getNome() + " ");
			i++;
		}
		
		// Criar 2 endereços
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Elton Silva");
		endereco1.setNumero("905");
		endereco1.setBairro("Centro");
		endereco1.setCidade("Jandira");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setCep("06600-025");
		endereco1.setComplemento("Escola");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Av. Barão de Limeira");
		endereco2.setNumero("1300");
		endereco2.setBairro("Santa Cecília");
		endereco2.setCidade("São Paulo");
		endereco2.setEstado(Estados.RIO_DE_JANEIRO);
		endereco2.setCep("06689-000");
		endereco2.setComplemento("Escola");
		
		// Criar dois planos de Saúde
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed");
		plano1.setValidade(LocalDate.of(2023, 12, 31));
		plano1.setCategoria("Exclusivo");
		plano1.setNumero("6325-8956-7455");
		
		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Allianz");
		plano2.setValidade(LocalDate.of(2022, 10, 31));
		plano2.setCategoria("Essencial");
		plano2.setNumero("0036-9959-8745");
		
		// Criar 2 Pacientes. Um deles pode ser você, 
		// e o outro o seu colega
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Fernando Leonid");
		paciente1.setCpf("652.698.652-99");
		paciente1.setRg("36.965-88");
		paciente1.setTelefone("(11)96541-99825");
		paciente1.setDataDeNascimento(LocalDate.of(1976, 7, 10));
		paciente1.setPlanoDeSaude(plano1);
		paciente1.setEndereco(endereco1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Rogério Alcântar");
		paciente2.setCpf("663.654.987-00");
		paciente2.setRg("32.965-11");
		paciente2.setTelefone("(11)63259-8741");
		paciente2.setDataDeNascimento(LocalDate.of(1969, 11, 28));
		paciente2.setPlanoDeSaude(plano2);
		paciente2.setEndereco(endereco2);
		
		// Exibir um relatório com os dados dos pacientes
		// Nome do paciente:
		// Data de nascimento:
		// Telefone do paciente:
		// Cidade do paciente:
		// Estado de residência:
		// Operadora do plano de saúde:
		// Categoria do plano de saúde:
		System.out.println();
		System.out.println();
		System.out.println("---- LISTA DE PACIENTES ------");
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Nascimento: " + paciente1.getDataDeNascimento());
		System.out.println("Telefone: " + paciente1.getTelefone());
		System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
		System.out.println("UF: " + paciente1.getEndereco().getEstado());
		System.out.println("Plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
		System.out.println("Categoria do Plano de saúde: " + paciente1.getPlanoDeSaude().getCategoria());
		
		System.out.println("----------------------------------------");
		System.out.println("Nome: " + paciente2.getNome());
		System.out.println("Nascimento: " + paciente2.getDataDeNascimento());
		System.out.println("Telefone: " + paciente2.getTelefone());
		System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
		System.out.println("UF: " + paciente2.getEndereco().getEstado());
		System.out.println("Plano de saúde: " + paciente2.getPlanoDeSaude().getOperadora());
		System.out.println("Categoria do Plano de saúde: " + paciente2.getPlanoDeSaude().getCategoria());
		
		// Agendar para o paciente1 uma consulta com fisioterapeuta
		// para o dia 27/09/2023 às 15h45
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade4);
		agenda1.setMedico(medico2);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 45));
		
		// Exibir a agenda do paciente1
		// Nome do paciente:
		// Data da consulta:
		// Hora da consulta:
		// Nome do médico:
		// Nome da especialidade:
		// Plano de saúde:
		// Telefone do paciente:
		System.out.println();
		System.out.println("------- AGENDAMENTOS ---------");
		System.out.println("Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Data: " + agenda1.getDataDaConsulta());
		System.out.println("Hora: " + agenda1.getHoraDaConsulta());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());
		System.out.println("Telefone: " + agenda1.getPaciente().getTelefone());
		
	}

}
