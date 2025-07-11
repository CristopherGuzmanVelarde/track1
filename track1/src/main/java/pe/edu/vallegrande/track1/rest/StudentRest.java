package pe.edu.vallegrande.track1.rest;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@RestController
public class StudentRest {

    @GetMapping("v1/api/students")
    public Map<String, String> obtenerStudent() {
        return Map.of(
                "dni", "47277882",
                "firstName", "cristopher",
                "lastname", "guzman velarde",
                "date", LocalDateTime.now().toString()
        );
    }
}