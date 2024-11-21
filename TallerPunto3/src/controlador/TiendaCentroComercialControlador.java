package controlador;

import modelo.TiendaCentroComercial;
import java.util.ArrayList;

public class TiendaCentroComercialControlador extends PuntoDeVentaControlador {

    private final ArrayList <TiendaCentroComercial> listTiendaCentroComercial = new ArrayList<>();

    @Override
    <T> boolean actualizar(String codigo, T obj) {
        boolean result = true;
        try {
            if (obj == null) {
                result = false;
                return result;
            } else {
                TiendaCentroComercial objTiendaCentroComercial = (TiendaCentroComercial) obj;
                for (TiendaCentroComercial objtTiendaCentroComercial : this.listTiendaCentroComercial) {
                    if (objtTiendaCentroComercial.getCodigo().equals(codigo)){
                        objtTiendaCentroComercial.setAdministrador(objTiendaCentroComercial.getAdministrador());
                        objtTiendaCentroComercial.setNumeroEmpleados(objTiendaCentroComercial.getNumeroEmpleados());
                        objtTiendaCentroComercial.setDiteccion(objTiendaCentroComercial.getDiteccion());
                        objtTiendaCentroComercial.setTelefono(objTiendaCentroComercial.getTelefono());
                        objtTiendaCentroComercial.setArea(objTiendaCentroComercial.getArea());
                        break;
                    }
                }
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    @Override
    String consultar(String codigo) {
        String result = "";

        for (int i = 0; i < this.listTiendaCentroComercial.size(); i++) {
            if (this.listTiendaCentroComercial.get(i).getCodigo().equals(codigo)) {
                result = this.listTiendaCentroComercial.get(i).getCodigo()+ " - "
                        + this.listTiendaCentroComercial.get(i).getDiteccion()+ " - "
                        + this.listTiendaCentroComercial.get(i).getTelefono() + " - "
                        + this.listTiendaCentroComercial.get(i).getArea()+ " - "
                        + this.listTiendaCentroComercial.get(i).getAdministrador()+ " - "
                        + this.listTiendaCentroComercial.get(i).getNumeroEmpleados() + " - "
                        + this.listTiendaCentroComercial.get(i).getLineaRopa() + " - "
                        + this.listTiendaCentroComercial.get(i).getCantidadVendida() + " - "
                        + this.listTiendaCentroComercial.get(i).getPresupuestoVentas();

                break;
            }
        }
        return result;
    }

    @Override
    boolean eliminar(String codigo) {
       boolean result = true;
        try {
            if (codigo == null) {
                result = false;
                return result;
            } else {
                for (TiendaCentroComercial objtTiendaCentroComercial : this.listTiendaCentroComercial) {
                    if (objtTiendaCentroComercial.getCodigo().equals(codigo)) {
                        this.listTiendaCentroComercial.remove(objtTiendaCentroComercial);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    @Override
    String listar() {
        String lisTiendaCentroComercial = "";

        for (int i = 0; i < this.listTiendaCentroComercial.size(); i++) {
            
            lisTiendaCentroComercial += this.listTiendaCentroComercial.get(i).getCodigo()+ " - "
                    + this.listTiendaCentroComercial.get(i).getAdministrador()+ " - "
                    + this.listTiendaCentroComercial.get(i).getNumeroEmpleados() + " - "
                    + this.listTiendaCentroComercial.get(i).getDiteccion() + " - "
                    + this.listTiendaCentroComercial.get(i).getTelefono()+ " - "
                    + this.listTiendaCentroComercial.get(i).getArea()+ " - "
                    + this.listTiendaCentroComercial.get(i).getLineaRopa() + " - "
                    + this.listTiendaCentroComercial.get(i).getCantidadVendida() + " - "
                    + this.listTiendaCentroComercial.get(i).getPresupuestoVentas() + " \n ";
        }
        return lisTiendaCentroComercial;
    }

    @Override
    <T> boolean registrar(T obj) {
        try {
            if (obj =="") {
                return false;
            } else {
                TiendaCentroComercial objtTiendaCentroComercial = (TiendaCentroComercial) obj;
                this.listTiendaCentroComercial.add(objtTiendaCentroComercial);

                return true;
            }
           
        } catch (Exception e) {

            return false;
        }
    }

   
}
