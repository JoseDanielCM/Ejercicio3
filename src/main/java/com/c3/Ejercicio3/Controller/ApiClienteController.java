package com.c3.Ejercicio3.Controller;

import com.c3.Ejercicio3.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiClienteController {

    @GetMapping("/api/clientes")
    public List<Cliente> getClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Juan", 25));
        listaClientes.add(new Cliente("Maria", 30));
        listaClientes.add(new Cliente("Pedro", 28));
        return listaClientes;
    }
}
