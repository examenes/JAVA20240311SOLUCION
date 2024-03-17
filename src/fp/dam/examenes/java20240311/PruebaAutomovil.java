package fp.dam.examenes.java20240311;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PruebaAutomovil {

	public static void main(String[] args) {
		Set<Automóvil> automóviles = new TreeSet<>(Comparator.comparing(Automóvil::getMotor)
				.thenComparingDouble(Automóvil::getPotencia)
				.thenComparing(Automóvil::getMarca)
				.thenComparing(Automóvil::getModelo)
				.thenComparingInt(Automóvil::getAño));
		
		automóviles.add(new Automóvil("HYUNDAI", "i20", 2018, Motor.GASOLINA, 100));
		automóviles.add(new Automóvil("HYUNDAI", "i20", 2019, Motor.GASOLINA, 100));
		automóviles.add(new Automóvil("HYUNDAI", "Accent", 2019, Motor.DIESEL, 120));
		automóviles.add(new Automóvil("HYUNDAI", "Elantra", 2020, Motor.HÍBRIDO, 150));
		automóviles.add(new Automóvil("HYUNDAI", "Tucson", 2017, Motor.GASOLINA, 110));
		automóviles.add(new Automóvil("HYUNDAI", "Santa Fe", 2019, Motor.ELÉCTRICO, 130));

		automóviles.add(new Automóvil("Toyota", "Corolla", 2017, Motor.GASOLINA, 110));
		automóviles.add(new Automóvil("Toyota", "Camry", 2019, Motor.HÍBRIDO, 130));
		automóviles.add(new Automóvil("Toyota", "RAV4", 2021, Motor.ELÉCTRICO, 160));
		automóviles.add(new Automóvil("Toyota", "Yaris", 2018, Motor.GASOLINA, 120));
        automóviles.add(new Automóvil("Toyota", "Prius", 2020, Motor.HÍBRIDO, 140));

        automóviles.add(new Automóvil("Honda", "Civic", 2016, Motor.GASOLINA, 120));
        automóviles.add(new Automóvil("Honda", "Accord", 2018, Motor.DIESEL, 140));
        automóviles.add(new Automóvil("Honda", "CR-V", 2020, Motor.HÍBRIDO, 170));
        automóviles.add(new Automóvil("Honda", "HR-V", 2017, Motor.GASOLINA, 130));
        automóviles.add(new Automóvil("Honda", "Insight", 2019, Motor.HÍBRIDO, 150));
        
        automóviles.forEach(System.out::println);
        System.out.println();
        getAutomóvilesPorMarca(automóviles, "Toyota").forEach(System.out::println);
        System.out.println();
        System.out.println(getPotenciaMediaPorAño(automóviles, "Honda"));
        
	}
	
	static List<Automóvil> getAutomóvilesPorMarca(Collection<Automóvil> automóviles, String marca) {
		return automóviles
				.stream()
				.filter(a -> a.getMarca().equals(marca))
				.sorted(Comparator.comparingInt(Automóvil::getAño))
				.collect(Collectors.toCollection(LinkedList::new));
	}
	
	static Map<Integer, Double> getPotenciaMediaPorAño(Collection<Automóvil> automóviles, String marca) {
		return automóviles
				.stream()
				.filter(a -> a.getMarca().equals(marca))
				.collect(Collectors.groupingBy(Automóvil::getAño, Collectors.averagingDouble(Automóvil::getPotencia)));
	}
	
}
