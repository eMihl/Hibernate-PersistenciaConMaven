package pac;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		//System.out.println("Inicio del programa...");
			
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session session = sessionFactory.openSession();
		//System.out.println("Configuración realizada con relativo éxito.");
		
		Transaction tx = session.beginTransaction();
		
		/**
		 * Ejercicio 4.a)
		 * */
		
		Modulo ma = new Modulo("Programacion B", "M03B");
		Modulo mb = new Modulo("Acceso a Datos", "M06");
		Modulo mc = new Modulo("Desarrollo de aplicaciones moviles", "M08");
		Modulo md = new Modulo("Servicios y procesos", "M09");
		
		session.save(ma);
		imprimirModulo(ma);
		session.save(mb);
		imprimirModulo(mb);
		session.save(mc);
		imprimirModulo(mc);
		session.save(md);
		imprimirModulo(md);
		
		tx.commit();
		tx = session.beginTransaction();
		
		/**
		 * Ejercicio 4.b)
		 * */
		
		Profesor p = new Profesor("Alvaro", "Hombre");
		session.save(p);
		System.out.println("Insert into profesor, nombre: " + p.getNombre() + ", sexo: " + p.getSexo());
		
		/**
		 * Ejercicio 4.c)
		 * */
		
		Set<Modulo> modulos = new HashSet<Modulo>();
		modulos.add(new Modulo((long) 1));
		modulos.add(new Modulo((long) 2));
		modulos.add(new Modulo((long) 3));
		modulos.add(new Modulo((long) 4));
		
		Alumno a1 = new Alumno("Juan", "Espaniola", 26, "Hombre", modulos);
		session.save(a1);
		imprimirAlumno(a1);
		
		modulos.clear();
		modulos.add(new Modulo((long) 1));
		modulos.add(new Modulo((long) 2));
		modulos.add(new Modulo((long) 4));
		
		a1 = new Alumno("Pedro", "Andorrana", 21, "Hombre", modulos);
		session.save(a1);
		imprimirAlumno(a1);
		
		modulos.clear();
		modulos.add(new Modulo((long) 3));
		modulos.add(new Modulo((long) 4));
		
		a1 = new Alumno("Marta", "Espaniola", 19, "Mujer", modulos);
		session.save(a1);
		imprimirAlumno(a1);
		
		modulos.clear();
		modulos.add(new Modulo((long) 2));
		modulos.add(new Modulo((long) 3));
		modulos.add(new Modulo((long) 4));
		
		a1 = new Alumno("Carla", "Francesa", 35, "Mujer", modulos);
		session.save(a1);
		imprimirAlumno(a1);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();

	}
	
	static public void imprimirModulo(Modulo modulo) {
		
		System.out.println("Insert into modulo, nombre: " + modulo.getNombre() + ", codigo: " + modulo.getCodigo());
	}
	
	static public void imprimirAlumno(Alumno alumno) {
		
		System.out.println("Insert into alumno, nombre: " + alumno.getNombre() + ", nacionalidad: " 
				+ alumno.getNacionalidad() + ", edad: " + alumno.getEdad() + ", sexo: "
				+ alumno.getSexo() + ", Modulos: " + alumno.getModulosSize());
	}

}
