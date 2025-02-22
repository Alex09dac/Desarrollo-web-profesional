package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Administrativo;
import edu.utvt.springboot.data.entities.Alumno;
import edu.utvt.springboot.data.repositories.AdministrativoRepository;
import edu.utvt.springboot.data.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InheritanceTests {

    @Autowired
    private AlumnoRepository alumnoRepository;


    @Test
    void insertAlumno(){
        Alumno alumno = new Alumno();
        alumno.setNombre("Aejandro");
        alumno.setApellido("Cirilo Florencio");
        alumno.setEmail("alexcirilo27@email.com");
        alumno.setFechaNacimiento(LocalDate.of(2004, 10, 27 ));
        alumnoRepository.save(alumno);
    }


    @Autowired
    private AdministrativoRepository administrativoRepository;

    @Test
    void insertAdministrativo(){
        Administrativo administrativo = new Administrativo();
        administrativo.setNombre("Christian");
        administrativo.setApellido("Cirilo Florencio");
        administrativo.setEmail("Chris@email.com");
        administrativo.setFechaNacimiento(LocalDate.of(2003, 3, 30));
        administrativo.setSalario(Double.parseDouble("2000"));
        administrativoRepository.save(administrativo);
    }
}
