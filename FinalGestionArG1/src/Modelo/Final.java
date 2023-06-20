/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Conexion;
import Controlador.ComentariosData;
import Controlador.EquipoData;
import java.time.LocalDate;
import Controlador.MiembroData;
import Controlador.ProyectoData;
import Controlador.EquipoMiembrosData;
import Controlador.TareaData;
import Modelo.Comentarios;

public class Final {

    public static void main(String[] args) {
        Conexion con = new Conexion();

        MiembroData md = new MiembroData(con);
        ProyectoData pd = new ProyectoData(con);
        EquipoData ed = new EquipoData(con);
        EquipoMiembrosData em = new EquipoMiembrosData(con);
        TareaData td = new TareaData(con);
        ComentariosData cd = new ComentariosData(con);

        
        System.out.println("probadno main: "+td.listarTareasPorIdMiembroEQ(39));
        //System.out.println(ed.buscarEquipoPorNombre("grupo 1"));
        
//        equipoData ed = new equipoData(con);
//miembro miembrotest = new miembro(153251, "alverti", "juan carlos", true);
//md.guardarmiembro(miembrotest); Test Guardar Miembro
//md.eliminarMiembro(8); Test Eliminar miembro 
//miembro d = new miembro(123, "testapellido", "testNombre", true);
//md.modificarMiembro(7, d); Test modificarmiembro
//md.listarAlumnos(); TEST LISTAR ALUMNOS
//md.activarMiembro(8); test activar miembro
        Proyecto d = new Proyecto(3, "Materia2", "materia dificil2", LocalDate.of(2023, 6, 12), true);
        Proyecto h = new Proyecto(5, "Materia rara", "dificilisima", LocalDate.of(2023, 6, 12), true);
        Proyecto z = new Proyecto(7, "proshecto zeta", "zeta", LocalDate.of(2023, 6, 12), true);
//        System.out.println(d);
//        pd.guardarProyecto(z);
//        pd.eliminarProyecto(4);
//        pd.modificarProyecto(3, d);
//        pd.listarProyectos();
//        pd.activarMiembro(4);

        //Equipo e = new Equipo(h, 10, "TestdesdemainM", LocalDate.of(2017, 1, 1), true);
        Equipo e2 = new Equipo(z, 20, "EquipoZ", LocalDate.of(2016, 2, 20), true);

        //System.out.println(pd.buscarProyecto(5));
        //System.out.println(md.buscarMiembro(1));
        //ed.guardarEquipo(e2);
        //ed.eliminarEquipo(10);
        //ed.modificarEquipo(10, e);
        //ed.listarEquipo();
        //System.out.println(ed.buscarEquipoPorIdProyecto(5));
        //System.out.println(ed.buscarEquipoPorIdEquipo(10));
        //ed.listarEquiposInactivos();
        Miembro a = new Miembro(16, 4136, "roman", "ruperto", true);
        Miembro b = new Miembro(14, 32112, "alquilar", "piso", true);
        // md.guardarmiembro(a);

        EquipoMiembros x = new EquipoMiembros(39, LocalDate.of(2017, 1, 1), e2, a, true);
        //em.guardarEquipoMiembro(x); 
        //em.eliminarEquipoMiembro(23); 
        //em.modificarEquipoMiembro(37, x);
        //em.activarEquipoMiembro(23);
//        em.listarEquipoMiembrosPorID(10);
        Tarea t = new Tarea(4, "limpiar", LocalDate.of(2020, 2, 2), LocalDate.of(2023, 6, 11), 1, x);
        //td.listarTareasPorId(23);
        //td.guardarTarea(t);
        //td.eliminarTarea(4);
        //td.activarTarea(4);
        //td.modificarTarea(4, t);
        Comentarios c = new Comentarios(5, "emma me paso la sala", LocalDate.of(2023, 6, 10), t, true);
        //cd.guardarComentario(c);
        //cd.eliminaComentario(5);
        //cd.activarComentario(5);
        //cd.modificarComentario(5, c);
//        cd.listarComentariosPorIdTarea(4);
    }

}
