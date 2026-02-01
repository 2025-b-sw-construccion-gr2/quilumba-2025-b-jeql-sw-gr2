package dao;

import java.util.List;
import modelo.Mascota;

public interface MascotaDAO extends GenericDAO<Mascota, Integer> {

    public List<Mascota> obtenerPorCliente(String cedula);

    public List<Mascota> buscarPorEspecie(String especie);
}
