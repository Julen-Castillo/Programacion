
package MisClases;


public class Empleado extends Persona {
    
     private Integer sueldo_bruto;

    public Integer getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(Integer sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public Empleado(Integer sueldo_bruto, String nombre, Integer edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

  
  
      @Override
      public String mostrar(){
          return this.getNombre() + " " + this.getEdad() + " " + this.getSueldo_bruto();
      }
    
      public Double calcular_salario_neto(){
          return null;
                                           }
}

