package mongodbrest;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mongodbrest.ancestrais.AncestraisRepository;
import mongodbrest.ancestrais.Ancestral;

@SpringBootApplication
public class MongoDbRest20201Application implements CommandLineRunner {

	@Autowired
	AncestraisRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDbRest20201Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Ancestral("Carolus Haverbeke", 'm', 1832, 1905, "Carel Haverbeke", "Maria van Brussel"));
		repo.save(new Ancestral("Carolus Haverbeke", 'm', 1832, 1905, "Carel Haverbeke", "Maria van Brussel"));
		repo.save(new Ancestral("Emma de Milliano", 'f', 1876, 1956, "Petrus de Milliano", "Sophia van Damme"));
		repo.save(new Ancestral("Maria de Rycke", 'f', 1683, 1724, "Frederik de Rycke",
				"Laurentia van Vlaenderen"));
		repo.save(new Ancestral("Jan van Brussel", 'm', 1714, 1748, "Jacobus van Brussel", "Joanna van Rooten"));
		repo.save(new Ancestral("Philibert Haverbeke", 'm', 1907, 1997, "Emile Haverbeke", "Emma de Milliano"));
		repo.save(new Ancestral("Jan Frans van Brussel", 'm', 1761, 1833, "Jacobus Bernardus van Brussel", null));
		repo.save(new Ancestral("Pauwels van Haverbeke", 'm', 1535, 1582, "N. van Haverbeke", null));
		repo.save(new Ancestral("Clara Aernoudts", 'f', 1918, 2012, "Henry Aernoudts", "Sidonie Coene"));
		repo.save(new Ancestral("Emile Haverbeke", 'm', 1877, 1968, "Carolus Haverbeke", "Maria Sturm"));
		repo.save(new Ancestral("Lieven de Causmaecker", 'm', 1696, 1724, "Carel de Causmaecker",
				"Joanna Claes"));
		repo.save(new Ancestral("Pieter Haverbeke", 'm', 1602, 1642, "Lieven van Haverbeke", null));
		repo.save(new Ancestral("Livina Haverbeke", 'f', 1692, 1743, "Daniel Haverbeke", "Joanna de Pape"));
		repo.save(new Ancestral("Pieter Bernard Haverbeke", 'm', 1695, 1762, "Willem Haverbeke",
				"Petronella Wauters"));
		repo.save(new Ancestral("Lieven van Haverbeke", 'm', 1570, 1636, "Pauwels van Haverbeke",
				"Lievijne Jans"));
		repo.save(new Ancestral("Joanna de Causmaecker", 'f', 1762, 1807, "Bernardus de Causmaecker", null));
		repo.save(new Ancestral("Willem Haverbeke", 'm', 1668, 1731, "Lieven Haverbeke", "Elisabeth Hercke"));
		repo.save(new Ancestral("Pieter Antone Haverbeke", 'm', 1753, 1798, "Jan Francies Haverbeke",
				"Petronella de Decker"));
		repo.save(new Ancestral("Maria van Brussel", 'f', 1801, 1834, "Jan Frans van Brussel",
				"Joanna de Causmaecker"));
		repo.save(new Ancestral("Angela Haverbeke", 'f', 1728, 1734, "Pieter Bernard Haverbeke",
				"Livina de Vrieze"));
		repo.save(new Ancestral("Elisabeth Haverbeke", 'f', 1711, 1754, "Jan Haverbeke", "Maria de Rycke"));
		repo.save(new Ancestral("Lievijne Jans", 'f', 1542, 1582, null, null));
		repo.save(new Ancestral("Bernardus de Causmaecker", 'm', 1721, 1789, "Lieven de Causmaecker",
				"Livina Haverbeke"));
		repo.save(new Ancestral("Jacoba Lammens", 'f', 1699, 1740, "Lieven Lammens", "Livina de Vrieze"));
		repo.save(new Ancestral("Pieter de Decker", 'm', 1705, 1780, "Joos de Decker",
				"Petronella van de Steene"));
		repo.save(new Ancestral("Joanna de Pape", 'f', 1654, 1723, "Vincent de Pape", "Petronella Wauters"));
		repo.save(new Ancestral("Daniel Haverbeke", 'm', 1652, 1723, "Lieven Haverbeke", "Elisabeth Hercke"));
		repo.save(new Ancestral("Lieven Haverbeke", 'm', 1631, 1676, "Pieter Haverbeke", "Anna van Hecke"));
		repo.save(new Ancestral("Martina de Pape", 'f', 1666, 1727, "Vincent de Pape", "Petronella Wauters"));
		repo.save(new Ancestral("Jan Francies Haverbeke", 'm', 1725, 1779, "Pieter Bernard Haverbeke",
				"Livina de Vrieze"));
		repo.save(new Ancestral("Maria Haverbeke", 'm', 1905, 1997, "Emile Haverbeke", "Emma de Milliano"));
		repo.save(new Ancestral("Petronella de Decker", 'f', 1731, 1781, "Pieter de Decker",
				"Livina Haverbeke"));
		repo.save(new Ancestral("Livina Sierens", 'f', 1761, 1826, "Jan Sierens", "Maria van Waes"));
		repo.save(new Ancestral("Laurentia Haverbeke", 'f', 1710, 1786, "Jan Haverbeke", "Maria de Rycke"));
		repo.save(new Ancestral("Carel Haverbeke", 'm', 1796, 1837, "Pieter Antone Haverbeke",
				"Livina Sierens"));
		repo.save(new Ancestral("Elisabeth Hercke", 'f', 1632, 1674, "Willem Hercke", "Margriet de Brabander"));
		repo.save(new Ancestral("Jan Haverbeke", 'm', 1671, 1731, "Lieven Haverbeke", "Elisabeth Hercke"));
		repo.save(new Ancestral("Anna van Hecke", 'f', 1607, 1670, "Paschasius van Hecke",
				"Martijntken Beelaert"));
		repo.save(new Ancestral("Maria Sturm", 'f', 1835, 1917, "Charles Sturm", "Seraphina Spelier"));
		repo.save(new Ancestral("Jacobus Bernardus van Brussel", 'm', 1736, 1809, "Jan van Brussel",
				"Elisabeth Haverbeke"));

		
		/*
		 * ALGUNS EXERCÍCIOS COM ANCESTRAIS
		 * 
		 * Ancestrais nascidos entre dois anos dados
		 * Mostrar nomes e idades de todos os ancestrais abaixo dos 50 anos de idade
		 * Mostrar o ancestral que nasceu há mais tempo
		 * Mostrar o ancestral de maior idade (e sua idade)
		 * Calcular e exibir a idade média de todos os ancestrais
		 * 
		 */
		
		List<Ancestral> listaAncestrais = repo.findAll();
		
		// ANCESTRAIS NASCIDOS ENTRE DOIS ANOS DADOS
		int anoInicial = 1900;
		int anoFinal = 1925;
		System.out.println("*** ANCESTRAIS NASCIDOS ENTRE 1900 E 1925***");
		listaAncestrais.stream()
			.filter(a -> (a.getAnoNascimento() > anoInicial && a.getAnoNascimento() < anoFinal))
			.forEach(System.out::println);
			
		// NOMES E IDADES DE TODOS OS ANCESTRAIS ABAIXO DOS 50 ANOS DE IDADE
		System.out.println("*** ANCESTRAIS ABAIXO DOS 50 ANOS DE IDADE***");
		listaAncestrais.stream()
			.filter(a -> (a.getAnoMorte() - a.getAnoNascimento()) < 50)
			.forEach(a -> System.out.printf("%s%s - %d %s%n", "Nome: ", a.getNome(), a.getAnoMorte() - a.getAnoNascimento(), "anos"));
			
		// ANCESTRAL QUE NASCEU HÁ MAIS TEMPO
		System.out.println("*** ANCESTRAL QUE NASCEU HÁ MAIS TEMPO ***");
		System.out.println(
		listaAncestrais.stream()
			.sorted(Comparator.comparing(Ancestral::getAnoNascimento))
			.findFirst()
			.get()
			.toString());
		
		
		// CLASSE AUXILIAR PARA ARMAZENAR UM ANCESTRAL E SUA IDADE
		class AncestralIdade {
			private Ancestral ancestral;
			private int idade;
			
			AncestralIdade(Ancestral ancestral, int idade) {
				this.ancestral = ancestral;
				this.idade = idade;
			}
			
			int getIdade() {
				return this.idade;
			}
			
			@Override
			public String toString() {
				return this.ancestral.toString() + "Idade: " + this.idade;
			}
		}
		
		// ANCESTRAL DE MAIOR IDADE (E SUA IDADE)
		System.out.println("*** ANCESTRAL DE MAIOR IDADE ***");
		System.out.println(listaAncestrais.stream()
			.map(a -> new AncestralIdade(a, a.getAnoMorte() - a.getAnoNascimento()))
			.sorted(Comparator.comparing(AncestralIdade::getIdade).reversed())  // ordenando em ordem DECRESCENTE de idade
			.findFirst()
			.get());
			
		// IDADE MÉDIA DOS ANCESTRAIS
		System.out.println("*** IDADE MÉDIA DOS ANCESTRAIS ***");
		System.out.println(listaAncestrais.stream()
				.map(a -> new AncestralIdade(a, a.getAnoMorte() - a.getAnoNascimento()))
				.mapToInt(AncestralIdade::getIdade)
				.average()
				.getAsDouble());
		
		// IDADE MÉDIA DOS ANCESTRAIS - VERSÃO 2
		System.out.println("*** IDADE MÉDIA DOS ANCESTRAIS - VERSÃO 2 ***");
		System.out.println(listaAncestrais.stream()
				.mapToInt(a -> a.getAnoMorte() - a.getAnoNascimento())
				.average()
				.getAsDouble());
	}

}
